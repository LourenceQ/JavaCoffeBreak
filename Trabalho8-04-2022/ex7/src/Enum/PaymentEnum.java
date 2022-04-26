package Enum;

public enum PaymentEnum {
    Dinheiro(0)
    , Cheque(1)
    , cCartao (3);

    private final int value;
    PaymentEnum(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public static PaymentEnum getEnum(int v) {
        for (PaymentEnum a: PaymentEnum.values()) {
            if (a.getValue() == v)
                return a;
        }

        return PaymentEnum.Dinheiro;
    }   
}
