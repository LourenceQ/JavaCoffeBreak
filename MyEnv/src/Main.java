/*
1) Implememnte a classe em Java Carro 
nome: String
marcar: String
proprietátio: String

----------------------
getNome(): String
SetNome(nome: string): void
getMarca(): String
setMarca(marca: string): void
setProprietário(proprietário String): String
andar(): void

*/
import Entities.Car;

class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Meu Carro", "WolksWagen", "Carro de Lourence");
        myCar.PrintMethod();
        
        

    }
}
