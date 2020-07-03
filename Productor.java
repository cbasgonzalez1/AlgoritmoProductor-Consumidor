package productorconsumidor2;

/**
 *
 * @author Sebastian
 */
public class Productor extends Thread {

    private Cubiculo cubiculo;
    private int numero;

    public Productor(Cubiculo c, int number) {
        cubiculo = c;
        this.numero = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubiculo.put(i);
            System.out.println("Productor" + this.numero + " pone: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
