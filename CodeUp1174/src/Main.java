import java.util.*;
public class Main {
    public static void main(String[] args) {
        int in_hour;
        int in_minute;

        int result_hour;
        int result_minute;

        Scanner sc = new Scanner(System.in);
        in_hour = sc.nextInt();
        in_minute = sc.nextInt();


        int total_in_minute = (in_hour+24)*60 + in_minute;
        int total_resutl_minute = total_in_minute - 30;

        result_hour = (total_resutl_minute / 60) % 24;
        result_minute = total_resutl_minute % 60;

        System.out.println(result_hour + " " + result_minute);
    }
}
