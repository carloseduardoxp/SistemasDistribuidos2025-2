
import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    private Queue<Integer> fila = new LinkedList<>();
    private static Integer LIMITE = 5;

    public synchronized void produzir(int item) throws InterruptedException {
        while (fila.size() == LIMITE) { 
            System.out.println("Buffer cheio, aguardando consumidor");
            wait();
        }

        fila.add(item);
        System.out.println("Produziu "+item);

        if (fila.size() == 1) {
            notifyAll();
        }
        Thread.sleep(100000);
    }

    public synchronized int consumir() throws InterruptedException {
        while (fila.isEmpty()) {
            System.out.println("Buffer vazio, aguardando produtor");
            wait();
        }
        int item = fila.poll();
        if (fila.size() == LIMITE - 1) {
            notifyAll();
        }
        return item;
    }

} 