package Entity;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
    private String Nome;
    private double Custo;
    private double Venda;
    private double Lucro;

    public Product(String nome, double custo) {
        Nome = nome;
        Custo = custo;
    }

    public void SetNome(String n) {
        this.Nome = n;
    }

    public String GetNome() {
        return this.Nome;
    }

    public void SetCusto(double c) {
        this.Custo = c;
    }

    public double GetCusto() {
        return this.Custo;
    }

    public void SetVenda() {
        boolean isValid = false;

        while (isValid == false) {
            System.out.println("Informe o preço de venda:");
            Scanner scan = new Scanner(System.in);
            double v = scan.nextDouble();
            if (v > this.Custo) {
                this.Venda = v;
                isValid = true;
            }
            else
                System.out.println("Preço de venda não pode ser menor que preço de compra." 
                        + dFormat.format(this.Custo));
        }

    }

    public double GetVenda() {
        return this.Venda;
    }

    public void SetLucro(double l) {
        this.Lucro = l;
    }

    public double GetLucro() {
        return this.Lucro;
    }

    public double CalcularMargemLucro() {
        this.Lucro = this.Venda - this.Custo;

        return this.Lucro;
    }

    public double GetMargemLucroPorcentagem() {
        return 100 - ((this.Custo * 100) / this.Venda);
    }

    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");

    public String PrintMe() {
        return "Nome: " + GetNome() + "\n"
                + "Custo: " + GetCusto() + "\n"
                + "Venda: " + GetVenda() + "\n"
                + "Margem Lucro: " + dFormat.format(CalcularMargemLucro()) + "\n"
                + "Lucro %: " + (GetMargemLucroPorcentagem()) + " %\n";
    }
}
