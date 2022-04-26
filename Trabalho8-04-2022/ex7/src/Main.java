import java.util.Scanner;

import Entities.Market;
import Entities.Product;

class Main {
    public static void main(String[] args) {
        Product pd1 = new Product("Queijo", 35, 3);
        Product pd2 = new Product("Arroz", 12, 4);
        Product pd3 = new Product("Feijão", 15, 3);

        Market mk = new Market();
        mk.Order.add(pd1);
        mk.Order.add(pd2);
        mk.Order.add(pd3);

        System.out.println("Informe o tipo de pagamento \n[1]- Dinehriro\n[1]- Cheque\n[1]- Cartão");
        Scanner scan = new Scanner(System.in);
        int paymentType = scan.nextInt();
        mk.setPayment(paymentType);
        System.out.println("Tipo de pagamento: " + mk.getPayment().toString());
        

        int len = mk.Order.size();
        for(int i=0; i<len; i++) {
            System.out.println("Pedido nº " + (i+1));
            System.out.println(mk.Order.get(i).toString());           
            System.out.println();
        }
        
    }
}