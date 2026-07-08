public class Transpose {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        transpose(arr);
    }

    public static void transpose(int arr[][]) {
        System.out.println("Transpose Matrix");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " " + arr[i + 1][j]);
            }
        }
    }
}
