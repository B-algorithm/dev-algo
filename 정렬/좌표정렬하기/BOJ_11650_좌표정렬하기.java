package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_11650_좌표정렬하기 {

    public static void main(String[] args) throws Exception {
        ArrayList<int []> arrayList = new ArrayList<>();
        String sb;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        for(int i=0; i<total; i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());
            arrayList.add(new int[] {number, number2});
        }

        Collections.sort(arrayList, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                if(o1[0] - o2[0] == 0)
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        sb = arrayList.stream()
                      .map(ints -> ints[0] + " " + ints[1])
                      .collect(Collectors.joining());
        System.out.println(sb.toString());
    }
}
