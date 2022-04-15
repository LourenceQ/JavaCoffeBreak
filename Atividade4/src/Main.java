import Entity.Product;

class Main {
    public static void main(String[] args) {
        Product product = new Product("panela", 34.5);
        product.SetVenda();

        System.out.println(product.PrintMe());
    }
}