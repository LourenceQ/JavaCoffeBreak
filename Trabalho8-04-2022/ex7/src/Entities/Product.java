package Entities;

import java.text.DecimalFormat;

public class Product {
    public String Name;
    public double Price;
    public int Quantity;

    public Product(String name, double price, int quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");
    @Override
    public String toString() {
        return ("Nome: " + this.Name + "\n" +
                "Preço: " + dFormat.format(this.Price) + "\n" +
                "Quantidade: " + this.Quantity);
    }
}
