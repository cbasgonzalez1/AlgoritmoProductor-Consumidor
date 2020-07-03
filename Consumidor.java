package productorconsumidor2;

/**
 *
 * @author Sebastian
 */
public class Consumidor extends Thread {

    private Cubiculo cubiculo;
    private int numero;

    public Consumidor(Cubiculo c, int numero) {
        cubiculo = c;
        this.numero = numero;
    }

    public void run() {
        int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = cubiculo.get();
            System.out.println("Consumidor " + this.numero + " tiene: " + valor);
        }
    }
}
