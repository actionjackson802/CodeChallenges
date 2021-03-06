package codechallenges.leetcode;

/**
 * Created by JacksonChang408 on 8/9/2016.
 */
/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
   The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        //boolean b = true;
        int low = 1;
        int high = n;
        int mid = 0;
        int g;
        if(guess(low) == 0) return low;
        if(guess(high) == 0) return high;

        while (low < high){
            mid = low + (high - low) / 2;

            g = guess(mid);
            if(g == 0) return mid;
            else if (g == -1){
                high = mid;
            }
            else if (g == 1){
                low = mid + 1;
            }
        }

        return mid;
    }
}

class GuessGame{
    public int guess(int n){
        return n;
    }
}