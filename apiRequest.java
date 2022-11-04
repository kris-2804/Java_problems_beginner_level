

import java.io.*;
import java.util.*;
import java.net.*;


public class apiRequest {
    public static void main(String[]args) throws UnknownHostException, IOException {
        Scanner input = new Scanner(System.in);
        int port = 8080;
        String host=null;
        String answer; String sendMessage; String receivedMessage;
        InetAddress address = InetAddress.getByName(host);
        Socket socket= new Socket(address,port);

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        System.out.println("Please answered the following question: ");
        System.out.println("What is the subject code for Socket Programming?");
        answer = input.nextLine();

        sendMessage = answer;
        bw.write(sendMessage);
        bw.newLine();
        bw.flush();
        System.out.println("Message sent to server: "+sendMessage);

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        receivedMessage = br.readLine();
        System.out.println("Message received from server : " + receivedMessage);
    }
}