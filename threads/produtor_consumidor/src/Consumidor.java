public class Consumidor implements Runnable {

    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) { 
            try {
                System.out.println("Consumidor tentando consumir");
                int item = buffer.consumir();
                System.out.println("Consumindo item "+item);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }    
    }


    
}
