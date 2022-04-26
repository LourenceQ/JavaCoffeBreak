package Entities;

import java.text.DecimalFormat;
// import java.util.Scanner;

public class Employee {
    private String Name;
    private String Lastname;
    private double Salary;

    // GETTER SETTER DE NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // GETTER SETTER DE LASTNAME
    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    // GETTER SETTER DE SALARY
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double s) {
        if (s < 0)
            this.Salary = 0.0;
        else
            this.Salary = s;
    }


    // GETTER SETTER DE ANUAL SALARY
    public double getAnualSalary() {
        double newS = getSalary() * 12;
        return newS;
    }

    // GETTER SETTER DE PAY RAISE
    public double setPayRaise() {
        double p = getSalary() + (getSalary() * 0.1);
        setSalary(p);
        return p;
    }

    // PRINT METHOD
    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");

    public String PrintMe() {
        return "Nome: " + getName() + "\n"
                + "Ultimo nome: " + getLastname() + "\n"
                + "salário: " + dFormat.format(getSalary()) + "\n"
                + "Salário anual: " + dFormat.format(getAnualSalary()) + "\n"
                + "Aumento de 10% de salário: " + dFormat.format(setPayRaise()) + "\n"
                + "Salário anual reajustado: " + dFormat.format(getAnualSalary()) + "\n";
    }

}
