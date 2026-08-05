/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2 },
                { 4, 5 },
                { 6, 7 }
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " " + arr[i + 1][j]);
            }
            System.out.println();
        }
    }
}