package Entities;

import java.text.DecimalFormat;

public class Funcionario {
    private static int counter = 1;
    public String Nome;
    public String Cargo;
    private double Salario;
    private int FuncionarioId;
    private int[] HorasTrabalhadas = {0,0,0,0};
    public HoraExtra HExtra = new HoraExtra("", 0);

    public Funcionario(String nome, String cargo, int[] hT, HoraExtra hExtra) {
        this.Nome = nome;
        this.Cargo = cargo;
        this.HorasTrabalhadas = hT;
        this.HExtra = hExtra;        
        this.FuncionarioId = counter++;
    }

    public double GetFuncId() {
        return this.FuncionarioId;
    }

    public double GetSalario() {
        return this.Salario;
    }

    public void SetHorasTrabalhadas(int[] hT) {
        this.HorasTrabalhadas = hT;
    }

    public int  GetHorasTrabalhadasTotal() {
        int val = 0, len = HorasTrabalhadas.length;
        for (int i=0; i<len; i++) {
            val += HorasTrabalhadas[i];
        }
        return val;        
    }

    public String  GetHorasTrabalhadas() {        
        int len = HorasTrabalhadas.length;
        for (int i=0; i<len; i++) {
            System.out.println((i+1)+"º Domingo: " + HorasTrabalhadas[i] +" hrs");
        }
        return "";        
    }    

    public void SetSalario(double s) {
        this.Salario = s;
    }
    //

    

    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");
    public String Mostra() {
        return ("Nome: " + this.Nome + "\n"
                + "Cargo: " + this.Cargo + "\n"
                + "Salário: " + dFormat.format(this.GetSalario()) + "\n"
                + "Funcionario Id: " + this.FuncionarioId + "\n"
                + "Horas Trabalhadas: " + GetHorasTrabalhadasTotal() + " hrs\n" 
                + "Tipo de hora extra: " +this.HExtra.GetTipo() +"\n"
                + "Valor de hora extra: " +dFormat.format(this.HExtra.GetValor()));
    }
}
