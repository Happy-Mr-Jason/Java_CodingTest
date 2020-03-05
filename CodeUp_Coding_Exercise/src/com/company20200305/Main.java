package com.company20200305;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int garbageCounter = 0;
        int waste = 0;
        Scanner sc = new Scanner(System.in);
        waste = sc.nextInt();
        int garbage = compress(waste);
        System.out.println(garbage);
        System.out.println(garbage <= 50 ? "GOOD" : "OH MY GOD");
    }

    static int compress (int num){
        int cal = num;
        int temp = 0;
        int result = 0;

        temp = cal/10;
        cal = cal%10;
        result = (cal*10 + temp)*2;

        if(result >= 100){
            return result = result%100;
        }else {
            return result;
        }
    }
}
