import java.util.Scanner;

public class TimeZone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GMT : ");
        int day = sc.nextInt();
        int hrs = sc.nextInt();
        int min = sc.nextInt();

        min = min + 30;
        if (min > 60) {
            min = min - 60;
            hrs++;
        }

        hrs = hrs + 5;
        if (hrs > 24) {
            hrs = hrs - 24;
            day++;
        }

        if (day > 30) {
            day = day - 30;
        }

        System.out.print("IST : ");
        System.out.println(day + " day, " + hrs + " hour, " + min + " minute");
        sc.close();
    }
}
