package UDPTrial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5555);

        while(true)
        {
            Socket client = server.accept();

            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            PrintWriter printWriter = new PrintWriter(client.getOutputStream());

            Scanner sc = new Scanner(System.in);


            System.out.println("Message from android: "+ br.readLine());

            System.out.println("Send -------> ");
            printWriter.println(sc.nextLine());
            printWriter.flush();

            client.close();
            printWriter.close();
            isr.close();
            br.close();
        }











    }
}
