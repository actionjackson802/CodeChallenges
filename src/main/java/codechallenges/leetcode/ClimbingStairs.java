package codechallenges.leetcode;

/**
 * Created by JacksonChang408 on 8/9/2016.
 *
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 */
public class ClimbingStairs {
    /*public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }*/
    public int climbStairs(int n) {
        int stepone = 1;
        int steptwo = 2;
        int stepthree = 0;

        if (n == 1 || n == 2){
            return n;
        }
        for(int i = 3; i <= n; i++){

            stepthree = stepone + steptwo;
            stepone = steptwo;
            steptwo = stepthree;
        }
        return stepthree;
    }
    /*
    * Testing Commit
    * */

}