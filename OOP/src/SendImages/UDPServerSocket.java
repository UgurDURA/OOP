package SendImages;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class UDPServerSocket
{

    public static void main(String[] args) throws IOException {
        ServerSocket ss;
        Socket s;
        DataInputStream dis;
        int len;
        byte[] data;

        ss = new ServerSocket(5555);
        System.out.println("Server is listening....");

        while (true)
        {
            s = ss.accept();
            InputStream in = s.getInputStream();

            DataInputStream dIn = new DataInputStream(s.getInputStream());

            int length = dIn.readInt();                    // read length of incoming message
            if(length>0) {
                byte[] message = new byte[length];
                dIn.readFully(message, 0, message.length); // read the message

                System.out.println(Arrays.toString(message));
            }



//            dis = new DataInputStream(in);
//
//            System.out.println((String) dis.toString());
//
//            len = dis.readByte();
//            data = new byte[len];
//
//            if(len >0)
//            {
//                dis.readFully(data, 0, data.length);
//                System.out.println(data.toString());
//
//            }


        }

    }







}
