package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = " ".split(br.readLine());

        int[] array = IntStream.range(0, N)
                              .map(i -> Integer.parseInt(input[i]))
                              .toArray();

        int[] sort = array.clone();

        Arrays.sort(sort);

        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        for (int n : sort) {
            if (!map.containsKey(n))
                map.put(n, temp++);
        }

        String sb = Arrays.stream(array)
                          .mapToObj(key -> String.valueOf(map.get(key)) + ' ')
                          .collect(Collectors.joining());

        System.out.println(sb);

    }
}
