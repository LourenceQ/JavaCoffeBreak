package Enum;

public enum LightIntentsityEnum {    
    apagada(0)
    , meiaLuz(1)
    , acesa(2);

    private final int value;
    LightIntentsityEnum(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    public static LightIntentsityEnum getEnum(int v) {
        for (LightIntentsityEnum a: LightIntentsityEnum.values() ) {
            if(a.getValue() == v)
                return a;
        }
        return LightIntentsityEnum.apagada;
    }    
}
