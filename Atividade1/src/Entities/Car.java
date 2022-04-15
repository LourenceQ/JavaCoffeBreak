package Entities;

public class Car {
    
    public String Nome;
    public String Marca;
    public String Proprietario;

    public Car(String nome, String marca, String proprietario) {
        Nome = nome;
        Marca = marca;
        Proprietario = proprietario;
    }

    // Getters setter de Nome
    public String getNome()
    {
        return Nome;
    }

    public void setName(String n)
    {
        this.Nome = n;
    }

    // Getters setter de Marca
    public String getMarca()
    {
        return Marca;
    }

    public void setMarca(String m)
    {
        this.Marca = m;
    }

    // Getters setter de Propriedade
    public String getProprietario()
    {
        return Proprietario;
    }

    public void setProprietario(String p)
    {
        this.Proprietario = p;
    }    

    // Métodos

    public String Andar()
    {
        return " O carro está andando";
    }

    public void PrintMethod()
    {
        System.out.println( "Nome: " + Nome + "\n" +
               "Marca: " + Marca+ "\n" +
               "Proprietário: " + Proprietario+ "\n" +
               "Status do carro: " + Andar());
    }
}
