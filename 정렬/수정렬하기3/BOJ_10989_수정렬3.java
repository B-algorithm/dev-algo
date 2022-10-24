package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_10989_수정렬3 {

    public static void main(String[] args) throws IOException {
        int[] integerList = new int[10001];
        StringBuilder sb = new StringBuilder();
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            //integerList.add(sc.nextInt());
            integerList[Integer.parseInt(br.readLine())] ++;
        }
        //Collections.sort(integerList);
        // todo(hig) : <= N
        for(int i = 1; i < 10001; i++) {
            if(integerList[i] > 0) {
                for(int j = 0; j<integerList[i]; j++) {
                    sb.append(i+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
