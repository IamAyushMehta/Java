import java.util.Scanner;

public class Weekday {
    public static void weekNumToWeekday(int n) {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please enter digits under 1 to 7");
                break;
        }
    }

    public static void weekDayOrWeekEnd(int n) {
        switch (n) {
            case 1:
                System.out.println("Weekday");
                break;

            case 2:
                System.out.println("Weekday");
                break;

            case 3:
                System.out.println("Weekday");
                break;

            case 4:
                System.out.println("Weekday");
                break;

            case 5:
                System.out.println("Weekday");
                break;

            case 6:
                System.out.println("Weekend");
                break;

            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Please enter digits under 1 to 7");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = sc.nextInt();

        // weekNumToWeekday(n);
        weekDayOrWeekEnd(n);

        sc.close();
    }
}