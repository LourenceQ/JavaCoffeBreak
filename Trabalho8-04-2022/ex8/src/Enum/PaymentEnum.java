package Enum;

public enum PaymentEnum {
    dinheiro(0)
    , cheque(1)
    , cartao (3);

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

        return PaymentEnum.dinheiro;
    }
}
