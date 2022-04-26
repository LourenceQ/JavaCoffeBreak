package Entities;

import java.util.ArrayList;
import Enum.PaymentEnum;

public class Market {
    private PaymentEnum Payment;
    public ArrayList<Product> Order = new ArrayList<Product>();

    public PaymentEnum getPayment() {
        return Payment;
    }

    public void setPayment(int i) {
        if(i == 1)
            Payment = PaymentEnum.getEnum(i);

        else if(i == 2)
            Payment = PaymentEnum.getEnum(i);
        
        else
            Payment = PaymentEnum.getEnum(0);
    }    

    // @Override 
    // public String toString() {
    //     return "Tipo de pagamento: " + getPayment().toString() + "\n"; 
    // }
}
