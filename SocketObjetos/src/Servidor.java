
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(2001,10000)) {
            System.out.println("Servidor iniciado, aguardando conexões .... ");
            while (true) { 
                Socket conexao = serverSocket.accept();
                System.out.println("Conexao estabelecida");
                ServidorThreadSocket thread = new ServidorThreadSocket(conexao);
                new Thread(thread).start();
            }
        }
    }
}
