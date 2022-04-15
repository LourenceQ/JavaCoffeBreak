import Entities.Funcionario;
import Entities.HoraExtra;

class Main{
    public static void main(String[] args) {
        int[] hT = {0,1,7,1};

        // Funcionario newFunc = new Funcionario("Lourence", "Arquiteto de Software", hT);
        // newFunc.setSalario(25000);
        // System.out.println(newFunc.Mostra());

        // System.out.println();
        // Funcionario newFunc2 = new Funcionario("Lourence2", "Arquiteto de Software2", hT);
        // newFunc2.setSalario(50000);
        // System.out.println(newFunc2.Mostra());

        System.out.println();
        HoraExtra hE = new HoraExtra("total",5);
        Funcionario newFunc3 = new Funcionario("Lourence3", "Arquiteto de Software3", hT, hE);
        newFunc3.SetSalario(50000);        
        System.out.println(newFunc3.Mostra());
        newFunc3.GetHorasTrabalhadas();
    }
}