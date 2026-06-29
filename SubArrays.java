public class SubArrays {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        printSubArrays(arr);
    }

    public static void printSubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0, min = 0, max = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }

                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
                System.out.println("sum = " + sum);
                System.out.print("min : " + min + " max : " + max);
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
