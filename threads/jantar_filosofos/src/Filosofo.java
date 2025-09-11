
import java.util.Random;

public class Filosofo implements Runnable {

    private Integer id;
    private Garfo garfo;
    private Random random = new Random();

    public Filosofo(Integer id,Garfo garfo) {
        this.id = id;
        this.garfo = garfo;
    }

    @Override
    public void run() {
       while (true) {
            try {
                System.out.println("O filosofo "+id+" quer pegar garfo");
                garfo.pegar(id);  
                System.out.println("O filosofo "+id+" pegou os garfos");
                Thread.sleep(random.nextInt(15000));
                System.out.println("O filosofo "+id+" quer devolver garfo");
                garfo.devolver(id);
                System.out.println("O filosofo "+id+" devolveu os garfos e voltou a pensar");
                Thread.sleep(random.nextInt(15000));
            } catch (Exception e) {
                e.printStackTrace();
            }
       }
    }
}
