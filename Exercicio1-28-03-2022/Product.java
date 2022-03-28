import java.text.DecimalFormat;

public class Product implements IDiscount {
    public String Name;
    public double Wheight;
    public double Price;

    public Product(String name, double wheight, double price) {
        this.Name = name;
        this.Wheight = wheight;
        this.Price = price;
    }

    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");
    public String PrintMethod()
    {
        return ("Nome: " + this.Name + "\n" 
                + "Peso: " + this.Wheight + " Kg\n"
                + "Preço: " + dFormat.format(this.Price) + "\n");
    }    

    @Override
    public double Discount() {        
        return this.Price * 0.1;
    }
}

