package BOJ;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class BOJ_1181_단어정렬 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int N = scanner.nextInt();
        String[] array = IntStream.range(0, N)
                                  .mapToObj(i -> scanner.nextLine())
                                  .toArray(String[]::new);


        Arrays.sort(array, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });


        stringBuilder.append(array[0]+'\n');

        for (int i = 1; i < N; i++) {
            if (array[i] != array[i - 1]) {
                stringBuilder.append(array[i]+'\n');
            }
        }
        System.out.println(stringBuilder.toString());
    }

}