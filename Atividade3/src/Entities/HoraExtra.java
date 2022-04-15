package Entities;

public class HoraExtra {
    private String Tipo;
    private int Valor;

    public HoraExtra(String t, int v) {
        this.Tipo = t;
        this.Valor = v;
    }

    public void SetTipo(String t) {
        this.Tipo = t;
    }

    public String GetTipo() {
        return this.Tipo;
    }

    public void SetValor(int v) {
        this.Valor = v;
    }
    
    public int GetValor() {
        return this.Valor;
    }
}
