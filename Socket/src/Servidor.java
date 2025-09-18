import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception {
        try (ServerSocket s = new ServerSocket(50000,10)) {
            while (true) { 
                System.out.println("Esperando conexão... ");
                Socket con = s.accept();
                System.out.println("Conexão estabelecida");
                ServidorSocketThread socketThread = new ServidorSocketThread(con);
                new Thread(socketThread).start();
            }
        }        
    }
}
