/*
Crie uma aplicação em Java, que contenha a classe
Caneta onde as características desta caneta podem ser
descritas pelos seguintes atributos: cor, ponta (0.5, 0.7
etc) e caneta tampada.
▶ Além disso, esta classe Caneta deve possuir os seguintes
métodos:
▶ imprimir seu status (tampada ou destampada juntamente
com a cor e o tamanho de sua ponta)
▶ tampar
▶ destampar
▶ escrever (Note que uma caneta não pode escrever se
estiver tampada).
▶ Crie dois objetos do tipo caneta (caneta1 = azul, 0.7 e
tampada e caneta2 = vermelha, 0.5 e destampada).
▶ Imprima na tela o status de cada uma d
*/

public class Program {
    public static void main(String[] args) {
        
        Pen bluePen = new Pen("Azul", 0.7, true);
        Pen redPen = new Pen("Vermelha", 0.5, false);

        System.out.println(bluePen.PrintMethod() 
                           +"\n"+ redPen.PrintMethod());

    }
}
