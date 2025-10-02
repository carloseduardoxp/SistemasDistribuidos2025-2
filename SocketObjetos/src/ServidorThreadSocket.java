import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServidorThreadSocket implements Runnable {

    private final Socket socketClient;

    public ServidorThreadSocket(Socket socketClient) {
        this.socketClient = socketClient;
    }

    @Override
    public void run() {
        try (ObjectOutputStream output = new ObjectOutputStream(socketClient.getOutputStream());
             ObjectInputStream input = new ObjectInputStream(socketClient.getInputStream())) {
            while (true) {
                Object objeto = input.readObject();
                if (objeto instanceof Pedido) {
                    Pedido pedido = (Pedido)objeto;
                    System.out.println("Recebi o pedido "+pedido);
                    output.writeObject("Objeto recebido do cpf: "+pedido.getCpf());
                } else {
                    output.writeObject("Não entendi o que você me enviou amigo");
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}