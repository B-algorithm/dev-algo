package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ_2108_통계학 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integersList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        double sum = 0;
        for(int i = 0; i < N; i ++) {
            int Number = Integer.parseInt(br.readLine());
            sum += Number;
            integersList.add(Number);
        }

        Collections.sort(integersList);
        int max = Collections.max(integersList);
        int min = Collections.min(integersList);
        int[] maxMinValue = getMaxMinValue(max, min);


        int avg = (int) Math.round(sum/N);
        int median = integersList.get(N/2);
        int range  = maxMinValue[0] + maxMinValue[1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int Number : integersList) {
            map.put(Number, map.getOrDefault(Number, 0 )+1);
        }
        int maxNumber = 0;
        for(int key : map.values()) {
            maxNumber = Math.max(maxNumber, key);
        }
        integersList = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == maxNumber) {
                integersList.add(key);
            }
        }

        Collections.sort(integersList);
        System.out.println(avg);
        System.out.println(median);
        System.out.println(getMode(integersList));
        System.out.println(range);
    }
    public static int getMode(List<Integer> integersList) {
        if(integersList.size() >= 2) {
            return integersList.get(1);
        }else {
            return integersList.get(0);
        }
    }
    public static int[] getMaxMinValue(int max, int min) {
        int[] result = new int[2];
        if( (max < 0 && min < 0) || (max > 0 && min >0)) {
            result[0] = max;
            result[1] = min * (-1);
        } else {
            result[0] = Math.abs(max);
            result[1] = Math.abs(min);
        }
        return result;
    }
}
