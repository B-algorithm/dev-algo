package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1427_소트인사이드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String numbers = sc.nextLine();
        char[] charNumberArray = numbers.toCharArray();
        Arrays.sort(charNumberArray);
        for(int i = 0; i< charNumberArray.length; i++) {
            sb.append(charNumberArray[charNumberArray.length-i-1]);
        }
        System.out.println(sb.toString());
    }
}
