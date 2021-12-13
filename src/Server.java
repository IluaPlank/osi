import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server started");
        int port = 9089;

        while (true) {
            ServerSocket serverSocket = new ServerSocket(port); // порт можете выбрать любой в доступном диапазоне 0-65536. Но чтобы не нарваться на уже занятый - рекомендуем использовать около 8080
            Socket clientSocket = serverSocket.accept(); // ждем подключения
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("New connection accepted");
            in.readLine();
            out.println("Write your name");
            String name = in.readLine();
            out.println("Are you child? (yes/no)");
            String child = in.readLine();
            if (child.equals("yes")){
                out.println("Welcome to the kids area, "+name+"! Let's play!");
            }
            else out.println( "Welcome to the adult zone,"+name+"! Have a good rest, or a good working day!");
            serverSocket.close();
        }
    }
}
