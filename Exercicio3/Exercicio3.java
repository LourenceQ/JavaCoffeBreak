package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        try (Scanner myObj = new Scanner(System.in)) {
            int[] nums = new int[20];        
            int mult;

            for (int i = 0; i < nums.length; i++) {
                nums[i] = i+1;
            }

            System.out.println("Informe um número: ");
            mult = myObj.nextInt();

            for (int i = 0; i < nums.length; i++) {
                nums[i] *= mult;
            }

            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
    }

}
