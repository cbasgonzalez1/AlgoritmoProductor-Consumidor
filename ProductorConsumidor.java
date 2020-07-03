
package productorconsumidor2;

/**
 *
 * @author Sebastian
 */
public class ProductorConsumidor {

    public static void main(String[] args) {
        // TODO code application logic here

        Cubiculo c = new Cubiculo();
        Productor p1 = new Productor(c, 1);
        Consumidor c1 = new Consumidor(c, 1);
        p1.start();
        c1.start();
    }
}
