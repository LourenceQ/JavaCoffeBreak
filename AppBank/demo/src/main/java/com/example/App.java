package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static List<BankAccount> bankAccList = new ArrayList<>();

    public static void main(String[] args) {

        String userOp = GetUserOp();

        while (userOp.toUpperCase() != "X") {
            switch (userOp) {
                case "1":
                    CreateAcc();
                    break;
                case "2":
                    DeleteAcc();
                    break;
                case "3":
                    Withdraw();
                    break;
                case "4":
                    Deposit();
                    break;
                case "5":
                    Tranfer();
                    break;
                case "6":
                    Extract();
                    break;
                case "7":
                    GetAllAccounts();
                    break;
                case "C":
                    System.out.flush();
                    break;
            }
            
            userOp = GetUserOp();
        }
        System.out.println("Obrigado por utilizar nossos serviços.");
    }    

    private static void CreateAcc() {
        
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Informe o nome do cliente");
        String accName = scanner.nextLine();

        System.out.println("[1] - Conta Especial\n[2] - Conta Comum");
        int accType = scanner.nextInt();

        System.out.println("Informe o saldo inicial");
        double accBalance = scanner.nextDouble();

        System.out.println("Informe um limite para saque");
        double accLimit = scanner.nextDouble();

        AccountType type = AccountType.getEnum(accType);
        
        BankAccount newAcc = new BankAccount(
            accName, accBalance, type, accLimit); 

        bankAccList.add(newAcc);
    }

    private static void DeleteAcc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta");
        int accNum = scanner.nextInt();

        System.out.println("Tem certeza que deve remover a conta número " + (accNum) + " ?");
        System.out.println("[1] - Sim\n[2] - Não");
        int deleteConfirmation = scanner.nextInt();
        if(deleteConfirmation == 1)
            bankAccList.remove(accNum-1);
        else
            System.out.println("Operação cancelada pelo usuário.");
    }

    private static void Withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta da sacar");
        int accNum = scanner.nextInt();

        System.out.println("Iniforme o valor para saque: ");
        double withdrawValue = scanner.nextDouble();

        bankAccList.get(accNum-1).Withdraw(withdrawValue);
    }

    private static void Deposit() {        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta para depositar");
        int accNum = scanner.nextInt();

        System.out.println("Iniforme o valor para depósito: ");
        double depositValue = scanner.nextDouble();

        bankAccList.get(accNum-1).Deposit(depositValue);
    }

    private static void Tranfer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta de origem da trasnferencia");
        int accNumTransferOrigin = scanner.nextInt();

        System.out.println("Informe o número da conta de destino da trasnferencia");
        int accNumTransferDestination = scanner.nextInt();

        System.out.println("Iniforme o valor para transferencia: ");
        double transferValue = scanner.nextDouble();

        bankAccList.get(accNumTransferOrigin-1).Transfer(transferValue, bankAccList.get(accNumTransferDestination-1));
    }

    private static void Extract() {
        System.out.println("metodo 6");
    }

    private static void GetAllAccounts() {
        System.out.println("Lista de contas\n");

        if(bankAccList.size() == 0) {
            System.out.println("Não existem contas cadastradas.");
            return;
        }            

        for(int i=0; i<bankAccList.size(); i++) {
            BankAccount bankAcc = bankAccList.get(i);
            System.out.print("Conta número: "+(i+1)+"\n");
            System.out.println(bankAcc.PrintMethod());
        }
    }

    public static String GetUserOp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Internacional");
        System.out.println("--------------------------------");
        System.out.println("[1] - Criar Conta");
        System.out.println("[2] - Excluir conta");
        System.out.println("[3] - Sacar");
        System.out.println("[4] - Depositar");
        System.out.println("[5] - Transferir");
        System.out.println("[6] - Emitir extrato");
        System.out.println("[7] - Visualizar contas");
        System.out.println("[C] - Limpar tela");
        System.out.println("[X] - Sair");
        System.out.println();

        String userOp = scanner.nextLine();

        System.out.println();

        return userOp;
    }
}
