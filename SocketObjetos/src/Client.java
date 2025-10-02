import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket conexao = new Socket("127.0.0.1",2001);
        try (ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
             BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) { 
                System.out.print("Digite o cpf: > ");
                String cpf = teclado.readLine();
                System.out.print("Digite o valor: >");
                Double valor = new Double(teclado.readLine());
                Pedido pedido = new Pedido(cpf, valor);
                output.writeObject(pedido);
                String resposta = (String)input.readObject();
                System.out.println(resposta);
            }
        }
    }

}
