/*
Crie uma aplicação para um Supermercado, que contenha
a classe Produto.
▶ As características de um produto podem ser descritas
pelos seguintes atributos: nome, peso e preço.
▶ Esta classe deve possuir os seguintes métodos:
▶ informacoes: imprime todas as características do produto
▶ vender: informa que "O produto"+ nome + "foi vendido."
▶ pesar: informa o peso do produto, porém, a balança deste
supermercado não tem capacidade para pesar produtos
acima de 10 Kg (um erro deve ser mostrado neste caso)
▶ calcular desconto: recebe como parâmetro a
porcentagem do desconto dado ao cliente (exemplo: o valor
50 - coresponderá a 50% de desconto) para aquele produto
e exibe na tela o novo valor do produto
▶ Crie dois objetos do tipo Produto
▶ p1
▶ Arroz Prato Fino
▶ 10Kg
▶ R$9,50
▶ p2
▶ Picanha
▶ 1Kg
▶ R$23,00
▶ Imprima na tela as informações de cada produto, os
venda e mostre na tela o valor total da compra destes
produtos, considerando que p2 teve desconto de 10%.
*/

import java.text.DecimalFormat;

public class Program {
    public static void main(String[] args) {

        DecimalFormat dFormat = new DecimalFormat("R$ 0.00");
        
        Product arroz = new Product("Arroz Prato Fino", 10.0, 9.50);
        Product picanha = new Product("Picanha", 1.0, 23.00);

        double totalPrice = arroz.Price + picanha.Price - picanha.Discount();

        System.out.println(arroz.PrintMethod() 
                           +"\n"+ picanha.PrintMethod()
                           + "\nPreço Total: " + dFormat.format(totalPrice));

    }    
}
