public class Pen {
    public String Color;
    public double PenTip;
    public boolean PenCap;

    public Pen(String color, double penTip, boolean penCap)
    {
        this.Color = color;
        this.PenTip = penTip;
        this.PenCap = penCap;
    }

    public String PenCapStatus()
    {
        String status;
        if(this.PenCap == true)
            // System.out.println("Tampada");
            status = "Tampada";
        else
            // System.out.println("Destampada");
            status = "Destampada";

            return status;
    }

    public void ToCap()
    {
        if(this.PenCap == false)
            System.out.println("Canata foi tampada.");
        else
            System.out.println("Caneta já está tampada");
    }

    public void Uncap()
    {
        if(this.PenCap == true)
            System.out.println("Canata foi destampada.");
        else
            System.out.println("Canata foi está destampada.");
    }

    public String PrintMethod()
    {
        return ("Cor: " + this.Color + "\n" 
                + "Ponta: " + this.PenTip + " Kg\n"
                + "Estatus da caneta: " + PenCapStatus() + "\n");
    }
}
