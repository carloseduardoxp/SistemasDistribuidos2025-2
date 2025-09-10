public class App {
    public static void main(String[] args) throws Exception {
        Buffer buffer = new Buffer();

        Produtor produtor = new Produtor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        new Thread(produtor).start();
        new Thread(consumidor).start();

        System.out.println("Que os jogos comecem");
    }
}
