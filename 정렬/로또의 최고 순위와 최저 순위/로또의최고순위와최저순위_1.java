import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zeroCnt = 0;
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) zeroCnt ++;
            for(int j=0; j<win_nums.length; j++) {
                if(win_nums[j] == lottos[i]) cnt ++;            
            }
        }
        //answer[0] = getRankLotteryNumber(cnt+zeroCnt);
        //answer[1] = getRankLotteryNumber(cnt);
        //return answer;
        return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
    }
    
    public int getRankLotteryNumber(int hit) {
        int result = 0;
        switch(hit) {
            case 6 :
                result = 1;
                break;
            case 5 : 
                result = 2;
                break;
            case 4 :
                result = 3;
                break;
            case 3 :
                result = 4;
                break;
            case 2 :
                result = 5;
                break;
            default :
                result = 6;
                break;
            
        }
        return result;
    }
}