package productorconsumidor2;

/**
 *
 * @author Sebastian
 */
public class Cubiculo {

    private int contenido;
    private boolean disponible = false;

    public synchronized int get() {
        while (disponible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponible = false;
        notifyAll();
        return contenido;
    }

    public synchronized void put(int value) {
        while (disponible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contenido = value;
        disponible = true;
        notifyAll();
    }
}
