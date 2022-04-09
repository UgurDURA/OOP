package UDPTrial;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPClient
{
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        String str = "Client is connected";
        byte[] buf = str.getBytes(StandardCharsets.UTF_8);

        while(true)
        {
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 5555);
            client.send(packet);
        }







    }
}
