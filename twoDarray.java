import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter col : ");
        int col = sc.nextInt();

        int matrix[][] = new int[rows][col];

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();

                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }

                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest : " + smallest);
        System.out.println("largest : " + largest);
    }
}