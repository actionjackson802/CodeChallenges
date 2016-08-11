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
            }
            else{
                digits[i] = t;
                return digits;
            }

        }
        return digits;
    }

    public static void main(String [] args){

        int [] a = new int[]{4,3,3,2};
        int [] b = new int[]{4,3,9,9};
        PlusOne ps = new PlusOne();

        a = ps.plusOne(a);
        b = ps.plusOne(b);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

        System.out.println();
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }


    }

}