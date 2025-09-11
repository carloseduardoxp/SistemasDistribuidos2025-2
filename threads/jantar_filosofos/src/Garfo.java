public class Garfo {

    private static final Integer FILOSOFOS = 5;
    private EstadoFilosofo[] estado = new EstadoFilosofo[FILOSOFOS];

    public Garfo() {
        for (int i = 0; i < FILOSOFOS; i++) {
            estado[i] = EstadoFilosofo.PENSANDO;
        }
    }

    public synchronized void pegar(Integer idFilosofo) {
        estado[idFilosofo] = EstadoFilosofo.FAMINTO;
        try {
            int vizinhoEsquerda = getVizinhoEsquerda(idFilosofo);
            int vizinhoDireita = getVizinhoDireita(idFilosofo);
            EstadoFilosofo estadoEsquerda = estado[vizinhoEsquerda];
            EstadoFilosofo estadoDireita = estado[vizinhoDireita];
            while (estadoEsquerda == EstadoFilosofo.COMENDO || 
                estadoDireita == EstadoFilosofo.COMENDO) {
                System.out.println("Filosofo "+idFilosofo+" vai mimir. Estado dos vizinhos: "+estadoEsquerda+" - "+estadoDireita);
                wait();
            }
            estado[idFilosofo] = EstadoFilosofo.COMENDO;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void devolver(Integer idFilosofo) {
        estado[idFilosofo] = EstadoFilosofo.PENSANDO;
        int vizinhoEsquerda = getVizinhoEsquerda(idFilosofo);
        int vizinhoDireita = getVizinhoDireita(idFilosofo);
        EstadoFilosofo estadoEsquerda = estado[vizinhoEsquerda];
        EstadoFilosofo estadoDireita = estado[vizinhoDireita];
        if ( (estadoEsquerda == EstadoFilosofo.FAMINTO) || 
             (estadoDireita == EstadoFilosofo.FAMINTO) ) {
            notifyAll();
        } 
        printEstadoFilosofos();
    }

    public Integer getVizinhoEsquerda(int idFilosofo) {
        return (idFilosofo + FILOSOFOS-1) % FILOSOFOS;
    }

    public Integer getVizinhoDireita(int idFilosofo) {
        return (idFilosofo + 1) % FILOSOFOS;
    }

    public void printEstadoFilosofos() {
        for (int i = 0; i < estado.length;i++) {
            System.out.println("Filosofo "+i+" "+estado[i]);
        }
    }

}