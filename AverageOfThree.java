//Write a Java method to compute the average of three numbers

import java.util.Scanner;

public class AverageOfThree {
    public static float averageOfThree(int x, int y, int z) {
        return (x + y + z) / 3.f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter second num : ");
        int b = sc.nextInt();
        System.out.print("Enter third num : ");
        int c = sc.nextInt();

        System.out.println("Average of three : " + averageOfThree(a, b, c));

        sc.close();
    }
}
