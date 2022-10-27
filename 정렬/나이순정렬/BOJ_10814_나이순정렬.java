package BOJ;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;

public class BOJ_10814_나이순정렬 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringBuilder;
        
        int N = scanner.nextInt();
        String[][] array = new String[N][2];


        for(int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = scanner.next();
            }
        }
        
        sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }

        });
        
        stringBuilder = IntStream.range(0, N)
                                 .mapToObj(i -> array[i][0] + " " + array[i][1])
                                 .collect(Collectors.joining());
        
        System.out.println(stringBuilder.toString());

    }

}
