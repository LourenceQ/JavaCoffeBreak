package Exercicio5;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        int mat[][] = new int[5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int x = 5; x >= 1; x--) {
            System.out.print("*");
            for (int y = 5; y > x; y--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int x = 5; x >= 1; x--) {
            System.out.print("*");
            for (int y = 1; y < x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
