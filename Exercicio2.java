package Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        int[] nums = new int[10];

        for (int i=0; i< nums.length; i++) {
            if(i % 2 != 0)  
                nums[i] = 1;
            else 
                nums[i] = 2;
        }

        for (int i=0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }        
    }    
}
