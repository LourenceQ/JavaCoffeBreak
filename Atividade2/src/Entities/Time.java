package Entities;

public class Time {
    public String Nome;
    private int Pontos;

    public Time(String n) {
        Nome = n;
    }

    public int getPontos() {
        return this.Pontos;
    }

    public void setPontos(int p) {
        this.Pontos = p;
    }

    public void Jogar() {
        for (int i = 0; i < 5; i++) {

            double x = (Math.random());
            double y = (Math.random());
            if (x <= y) {
                this.Pontos++;
            }
        }
    }

    public void Recurso() {
        System.out.println("O time pediu recurso");
    }

    public void PrintMethod() {
        System.out.println(
                "");
    }
}
