import Entities.Time;

class Main {
    public static void main(String[] args) {
        Time t1 = new Time("Time 1");
        t1.setPontos(0);

        Time t2 = new Time("Time 2");
        t2.setPontos(0);        
        
        t1.Jogar();
        t2.Jogar();

        if(t1.getPontos() > t2.getPontos())
        {
            System.out.println(
                "\n"+t1.Nome + ": "+ t1.getPontos() + 
                "\n"+t2.Nome + ": "+ t2.getPontos() + 
                "\n"+t1.Nome + " ganhou");
        }
        else if (t1.getPontos() < t2.getPontos())
        {
            System.out.println(
                "\n"+t1.Nome + ": "+ t1.getPontos() + 
                "\n"+t2.Nome + ": "+ t2.getPontos() + 
                "\n"+t2.Nome + " ganhou");
        }
        else if(t1.getPontos() == t2.getPontos())
        {
            System.out.println(
                "\n"+t1.Nome + ": "+ t1.getPontos() + 
                "\n"+t2.Nome + ": "+ t2.getPontos() + 
                    "\nHouve empate");
        }
    }
}