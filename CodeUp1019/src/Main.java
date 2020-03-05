import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inDate[] = new String[3];

        Scanner sc = new Scanner(System.in);

        String in_date = sc.nextLine();

//        System.out.println(in_date);
        inDate = in_date.split("\\.");

        System.out.printf("%04d.%02d.%02d",Integer.parseInt(inDate[0]),Integer.parseInt(inDate[1]),Integer.parseInt(inDate[2]));
    }
}
