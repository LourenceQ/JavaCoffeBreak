package com.example;

public enum AccountType {
    None(0), Especial(1), Comum(2);

    private final int value;
    AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static AccountType getEnum(int value) {
        for(AccountType a: AccountType.values()) {
            if(a.getValue() == value) 
            return a;
        }
        return AccountType.None;
    }
}
