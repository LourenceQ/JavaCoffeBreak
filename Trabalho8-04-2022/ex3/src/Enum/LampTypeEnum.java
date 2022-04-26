package Enum;

public enum LampTypeEnum {
    incandescente(0)
    , halogena(1)
    , fluorescente(2)
    , LED(3);

    private final int value;
    LampTypeEnum(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public static LampTypeEnum getEnum(int v) {
        for (LampTypeEnum a: LampTypeEnum.values() ) {
            if(a.getValue() == v)
                return a;
        }
        return LampTypeEnum.incandescente;
    }
}
