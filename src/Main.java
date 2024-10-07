public class Main {

    static String[] cod={"p1","p2","p3"};
    static String[] desc ={"parafusos","cravos ","tachas"};
    static int[] prezo ={3,4,5};

    public static void main(String[] args) {
        Products products = new Products();
        products.getProducts().add(new Product(cod[0], desc[0], prezo[0]));
        products.getProducts().add(new Product(cod[1], desc[1], prezo[1]));
        products.getProducts().add(new Product(cod[2], desc[2], prezo[2]));
        products.serializar();

        Products products2 = new Products();
        products2.deserializar();
        for (Product p : products2.getProducts()) {
            System.out.println(p.getCodigo() + " " + p.getDescripcion() + " " + p.getPrecio());
        }
    }
}
