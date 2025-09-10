import java.util.Random;

public class Produtor implements Runnable {

    private Buffer buffer;
    private Random random = new Random(100);

    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int item = random.nextInt();
                System.out.println("Produtor produziu "+item);
                buffer.produzir(item);
                System.out.println("Produtor entregou "+item+" no buffer");
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    
}
