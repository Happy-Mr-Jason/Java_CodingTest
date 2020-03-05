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

        if(in_minute >= 30 ){
            result_hour = in_hour;
            result_minute = in_minute-30;
        }else {
            result_hour = in_hour-1;
            result_minute = 30 + in_minute;
        }
        if(result_hour <0){
            result_hour += 24;
        }
        System.out.println(result_hour + " " + result_minute);
    }
}
