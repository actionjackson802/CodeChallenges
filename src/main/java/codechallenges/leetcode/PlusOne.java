package codechallenges.leetcode;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.

 Created by jacksonchang on 8/10/16.
 *
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int t = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            t = digits[i];
            t++;
            if(t > 9 && i == 0){
                digits[i] = t % 10;
                int [] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
            else if(t > 9){
                digits[i] = t % 10;
            }else{
                digits[i] = t;
                return digits;
            }

        }
        return digits;
    }
}