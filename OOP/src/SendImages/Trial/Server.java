package SendImages.Trial;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Base64;

public class Server
{
    //initialize socket and input stream
    private static Socket socket = null;
    private static ServerSocket server = null;
    private static InputStream in  = null;
    private static OutputStream out = null;


    public static void main(String[] args) throws IOException {



//        while (true)
//        {
            int port = 5555;

            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");
            socket = server.accept();

            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(socket.getInputStream());
            //writes on client socket
            out = new DataOutputStream(socket.getOutputStream());

            // Receiving data from client
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte buffer[] = new byte[126720];
            baos.write(buffer, 0 , in.read(buffer));



            byte result[] = baos.toByteArray();
//            result = Base64.getDecoder().decode(result);

            System.out.println(result.length);

            File file;
            file = new File("/Users/ugur_dura/Projects/OOP/src/SendImages/Images/IMG.png");


            FileOutputStream fileOutputStream = new FileOutputStream(file);

            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes

            fileOutputStream.write(result);
            System.out.println("File written");
           fileOutputStream.flush();
            fileOutputStream.close();

            String res = Arrays.toString(result);
            System.out.println("Recieved from client : "+res);



//            ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
//            BufferedImage bImage2 = ImageIO.read(bis);
//            ImageIO.write(bImage2, "jpg", new File("output.jpg") );
//
//            BufferedImage image = new BufferedImage(10, 80, BufferedImage.TYPE_4BYTE_ABGR);
//            image.setRGB(5, 20, Color.BLUE.getRGB());
//
//
//            System.out.println("image created");
//            JFrame jFrame = new JFrame("Server");
//            jFrame.setSize(400,400);
//            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            JLabel jLabelText = new JLabel("[PROGRAM STATUS] --->>>>> Waiting image from Client......");
//            jFrame.add(jLabelText, BorderLayout.SOUTH);
//
//            jFrame.setVisible(true);
//
//            JLabel jLabelPic = new JLabel(new ImageIcon(bImage2));
//            jLabelText.setText("[PROGRAM STATUS] --->>>>> Image Received");
//            jFrame.add(jLabelPic, BorderLayout.CENTER);

            System.out.println("Closing connection");

            out.close();
            socket.close();
            server.close();







        }







//    }
}
