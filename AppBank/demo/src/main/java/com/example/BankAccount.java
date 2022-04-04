package com.example;

import java.text.DecimalFormat;

public class BankAccount {
    public String Name;
    public double Balance;
    public AccountType AccType;
    public double Limit;

    public BankAccount(String name, double balance, AccountType accType) {
        Name = name;
        Balance = balance;
        AccType = accType;
    }

    public BankAccount(String name, double balance, AccountType accType, double limit) {
        Name = name;
        Balance = balance;
        AccType = accType;
        Limit = limit;
    }

    DecimalFormat dFormat = new DecimalFormat("R$ 0.00");

    public String PrintMethod() {
        return ("Nome: " + this.Name + "\n"
                + "Saldo: " + dFormat.format(this.Balance) + "\n"
                + "Limite para saque: " + dFormat.format(this.Limit) + "\n"
                + "Tipo de conta: " + this.AccType + "\n");
    }

    public boolean Withdraw(double withdrawValue) {
        if (this.Balance - withdrawValue < (this.Limit * -1)) {
            System.out.println("Saldo insuficiente!");
            return false;
        }

        this.Balance -= withdrawValue;
        System.out.println("Saldo atual da conta de: " + this.Name + " é " + dFormat.format(this.Balance));

        return true;
    }

    public void Deposit(double depositValue) {
        this.Balance += depositValue;

        System.out.println("Saldo atual da conta de: " + this.Name + " é " + dFormat.format(this.Balance));
    }

    public void Transfer(double transferValue, BankAccount destinationAcc) {
        if(this.Withdraw(transferValue)) {
            destinationAcc.Deposit(transferValue);
        }
        
    }

}
