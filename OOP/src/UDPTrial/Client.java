package UDPTrial;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        JFrame jframe = new JFrame("Client");
        jframe.setSize(400,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabelText = new JLabel("Waiting for the server....");
        jframe.add(jLabelText, BorderLayout.SOUTH);
        jframe.setVisible(true);




        ServerSocket server = new ServerSocket(5555);


        while (true)
        {
            Socket client = server.accept();
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            PrintWriter printWriter = new PrintWriter(client.getOutputStream());

            Scanner sc = new Scanner(System.in);
            System.out.println("Message from android: "+ br.readLine());
//
            System.out.println("Send -------> ");
            printWriter.println(sc.nextLine());
            printWriter.flush();

            System.out.println("Message from android: "+ br.readLine());

        }



//            ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
//
//            BufferedImage currentVideoFrame = (BufferedImage) ois.readObject();


//            JLabel jlabelPic = new JLabel(new ImageIcon(currentVideoFrame));
//            jLabelText.setText("Image Received");
//            jframe.add(jlabelPic, BorderLayout.CENTER);







        }











    }

