package Application;

import Model.Database;
import Model.User;
import Util.MessageGenerator;

import java.io.IOException;
import java.net.*;

public class ListenThread extends Thread{
    private DatagramSocket socket;

    public ListenThread(DatagramSocket socket) {
        this.socket = socket;
    }

    public void run() {
        byte[] receiveData = new byte[512];
        Quiz quiz = new Quiz();

        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
            try {
                socket.receive(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String data = new String(datagramPacket.getData());
            String[] partition = data.split(";", 3);
            String senderName = partition[0];
            String messageType = partition[1];
            data = partition[2];
            Broadcaster.getInstance().broadcast(senderName + ": " + data);
            data = data.toLowerCase();

            if (data.equals("/mulai")) {
                if (quiz.status()) {
                    Broadcaster.getInstance().broadcast("Soal sebelumnya masih belum selesai.");
                } else {
                    quiz.startQuiz();
                    Broadcaster.getInstance().broadcast("Quiz telah dimulai");
                    Broadcaster.getInstance().broadcast(MessageGenerator.activeQuestion(quiz.getActiveQuestion(), quiz.getUsersAnswer()));
                }
                continue;
            }
            if (data.equals("/nyerah")) {
                if (!quiz.status()) {
                    Broadcaster.getInstance().broadcast("Belum ada quiznya");
                } else {
                    Broadcaster.getInstance().broadcast("Quiznya udahan..");
                }
                continue;
            }

            if (quiz.getActiveQuestion().getAnswers().contains(data) && !quiz.getUsersAnswer().contains(data)) {
                Database.getInstance().findUserByName(senderName).addPoints(10);
                quiz.getUsersAnswer().add(data);
                Broadcaster.getInstance().broadcast("Jawaban " + senderName + " benar :D -> +10 point");
                Broadcaster.getInstance().broadcast(MessageGenerator.activeQuestion(quiz.getActiveQuestion(), quiz.getUsersAnswer()));
            }

            System.out.println(data);
        }
    }
}
