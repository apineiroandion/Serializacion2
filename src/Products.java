import java.io.*;
import java.util.ArrayList;

public class Products implements Serializable {
    ArrayList<Product> products = new ArrayList<Product>();

    public Products() {
    }

    public void serializar() {
        try {
            FileOutputStream fos = new FileOutputStream("productos.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("Error al serializar");
            ioe.printStackTrace();
        }
    }

    public void deserializar() {
        try {
            FileInputStream fis = new FileInputStream("productos.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
