package Util;

import Application.Broadcaster;
import Application.Quiz;
import Application.SenderSingle;
import Controller.UserController;
import Model.Database;
import Model.User;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Handler {
    public static void message(String senderName, String message) {
        Broadcaster.getInstance().broadcast(senderName + ": " + message);
        message.toLowerCase();
        Quiz quiz = Quiz.getInstance();
        if (message.equals("/mulai")) {
            if (quiz.status()) {
                Broadcaster.getInstance().broadcast("Soal sebelumnya masih belum selesai.");
            } else {
                quiz.startQuiz();
                Broadcaster.getInstance().broadcast("Quiz telah dimulai");
                Broadcaster.getInstance().broadcast(MessageGenerator.activeQuestion(quiz.getActiveQuestion(), quiz.getUsersAnswer()));
            }
            return;
        }
        if (message.equals("/nyerah")) {
            if (!quiz.status()) {
                Broadcaster.getInstance().broadcast("Belum ada quiznya");
            } else {
                quiz.endQuiz();
                Broadcaster.getInstance().broadcast("Quiznya udahan..");
            }
            return;
        }
        if (message.equals("/score")) {
            String sendMessage = "Daftar nilai user yang online\n";
            for (User user: quiz.getActiveUser()) {
                sendMessage += user.getUsername() + " -> " + user.getPoints().toString() + " points";
            }
            Broadcaster.getInstance().broadcast(sendMessage);
        }

        if (quiz.status()) {
            if (quiz.getActiveQuestion().getAnswers().contains(message) && !quiz.getUsersAnswer().contains(message)) {
                UserController.findByName(senderName).addPoints(10);
                quiz.getUsersAnswer().add(message);
                Broadcaster.getInstance().broadcast("Jawaban " + senderName + " benar :D -> +10 point");
                Broadcaster.getInstance().broadcast(MessageGenerator.activeQuestion(quiz.getActiveQuestion(), quiz.getUsersAnswer()));
            }
        }

    }

    public static void register(String data, InetAddress address, Integer port) {
        String username = data.split(";")[0];
        String password = data.split(";")[1];
        System.out.println("register for" + username + "->" + password + "from ->" + address.toString() + " on port: " + port.toString());
        if (UserController.findByName(username)!= null) {
            String message = "fail;Username already used";
            SenderSingle.getInstance().sendMessage(message, address, port);
        } else {
            UserController.register(username, password);
            String message = "success;User created, please login";
            SenderSingle.getInstance().sendMessage(message, address, port);
        }
    }

    public static void login(String data, InetAddress address, Integer port) {
        String username = data.split(";")[0];
        String password = data.split(";")[1];
        User user = UserController.findByName(username);
        if (user == null) {
            String message = "fail;user not found";
            SenderSingle.getInstance().sendMessage(message, address, port);
        } else if (user.getPassword().equals(password)){
            String message = "success;Login success";
            Quiz.getInstance().addActiveUser(user);
            SenderSingle.getInstance().sendMessage(message, address, port);
        } else {
            String message = "fail;Wrong password";
            SenderSingle.getInstance().sendMessage(message, address, port);
        }
    }

    public static void logout(String username) {
        Quiz.getInstance().removeActiveUser(UserController.findByName(username));
    }
}
