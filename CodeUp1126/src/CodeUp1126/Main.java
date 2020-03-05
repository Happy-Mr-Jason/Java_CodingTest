package CodeUp1126;

import java.util.*;

public class Main {

    static int[] lottoResultNums = new int[7];
    static int[] myLottoNums = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lottoResultNums.length; i++) {
            lottoResultNums[i] = sc.nextInt();
        }
        for (int i = 0; i < myLottoNums.length; i++) {
            myLottoNums[i] = sc.nextInt();
        }
        System.out.println(String.valueOf(checkResult()));
    }

    static int checkResult() {
        int resultcount = 0;
        int result2nd = 0;
        int result;
        for (int i = 0; i < lottoResultNums.length; i++) {
            for (int j = 0; j < myLottoNums.length; j++) {
                if (myLottoNums[j] == lottoResultNums[i]) {
                    if (i != 6) {
                        resultcount++;
                    } else {
                        result2nd++;
                    }
                }
//                    System.out.println(myLottoNums[j] + " " + lottoResultNums[i] +  " : " + resultcount);
            }
        }

        switch (resultcount) {
            case 6:
                result = 1;
                break;
            case 5:
                if (result2nd == 1) {
                    result = 2;
                } else {
                    result = 3;
                }
                break;
            case 4:
                result = 4;
                break;
            case 3:
                result = 5;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
