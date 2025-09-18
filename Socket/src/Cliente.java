
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

    public static void main(String args[]) throws Exception {
        Socket socket = new Socket("127.0.0.1",50000);

        try (DataInputStream input = new DataInputStream(socket.getInputStream()); 
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            while (true) {  
                System.out.print("> ");
                String linha = teclado.readLine();
                output.writeUTF(linha);

                linha = input.readUTF();
                if (linha.isEmpty()) {
                    System.out.println("Conexão encerrada");
                    break;
                }
                System.out.println(linha);
            }
        }   


    }
}
