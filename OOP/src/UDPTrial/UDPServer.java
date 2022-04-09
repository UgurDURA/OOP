package UDPTrial;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer

{
    public static void main(String[] args) throws IOException {


        DatagramSocket server = new DatagramSocket(4160);

        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("Server is listening");
        server.receive(packet);
        String response = new String(packet.getData());
        System.out.println(response);
        server.close();

    }

}
