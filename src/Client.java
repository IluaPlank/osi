import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        String host = "netology.homework";
        int port = 9089;
        try (Socket clientSocket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out.println("Hello");
            System.out.println("Hello");
            String resp = in.readLine();
            System.out.println(resp);
            out.println("Ilua");
            System.out.println("Ilua");
            resp = in.readLine();
            System.out.println(resp);
            out.println("no");
            System.out.println("no");
            resp = in.readLine();
            System.out.println(resp);
        }
    }
}
