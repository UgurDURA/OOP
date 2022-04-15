package SendImages;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame("Server");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel jLabelText = new JLabel("[PROGRAM STATUS] --->>>>> Waiting image from Client......");
        jFrame.add(jLabelText, BorderLayout.SOUTH);

        jFrame.setVisible(true);

        ServerSocket serverSocket = new ServerSocket(5555);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        BufferedImage bufferedImage = ImageIO.read(bufferedInputStream);

        bufferedInputStream.close();
        socket.close();

        JLabel jLabelPic = new JLabel(new ImageIcon(bufferedImage));
        jLabelText.setText("[PROGRAM STATUS] --->>>>> Image Received");
        jFrame.add(jLabelPic, BorderLayout.CENTER);






    }
}
