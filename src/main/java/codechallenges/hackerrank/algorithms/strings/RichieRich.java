package codechallenges.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by JacksonChang408 on 8/19/2016.
 * Sandy likes palindromes. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as it does forward. For example, madam is a palindrome.

 On her birthday, Sandy's uncle, Richie Rich, offered her an -digit check which she refused because the number was not a palindrome. Richie then challenged Sandy to make the number palindromic by changing no more than digits. Sandy can only change digit at a time, and cannot add digits to (or remove digits from) the number.

 Given and an -digit number, help Sandy determine the largest possible number she can make by changing digits.

 Note: Treat the integers as numeric strings. Leading zeros are permitted and can't be ignored (So 0011 is not a palindrome, 0110 is a valid palindrome). A digit can be modified more than once.

 Input Format

 The first line contains two space-separated integers, (the number of digits in the number) and (the maximum number of digits that can be altered), respectively.
 The second line contains an -digit string of numbers that Sandy must attempt to make palindromic.

 Constraints

 Each character in the number is an integer where .

 Output Format

 Print a single line with the largest number that can be made by changing no more than digits; if this is not possible, print -1.

 Sample Input 0

 4 1
 3943

 Sample Output 0

 3993

 Sample Input 1

 6 3
 092282

 Sample Output 1

 992299

 Sample Input 2

 4 1
 0011

 Sample Output 2

 -1

 Explanation

 Sample 0

 There are two ways to make a palindrome by changing exactly digits:

 , so we print .
 */
public class RichieRich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 77543;//in.nextInt();
        int k = 58343;//in.nextInt();
        String number = in.next();

        System.out.println(number);

        char [] numArr = number.toCharArray();

        for(int i = 0; i < n / 2; i++){
            if(numArr[i] != numArr[n - i - 1]){
                if(k < 0){
                    System.out.println("a-1");
                    return;
                }else{
                    if(numArr[i] != '9'){
                        numArr[i] = '9';
                        k--;
                    }
                    if(k < 0){
                        System.out.println(i);
                        System.out.println(k);
                        System.out.println("b-1");
                        return;
                    }else{
                        if(numArr[n - i - 1] != '9'){
                            numArr[n - i - 1] = '9';
                            k--;
                        }
                    }
                }
            }
        }
        if(k == 0){
            System.out.println(new String(numArr));
            return;
        }
        else if(k < 0){
            System.out.println("c-1");
            return;
        }

        for(int i = 0; i < n / 2; i++){
            if(k < 0){
                break;
            }else{
                if(numArr[i] != '9'){
                    numArr[i] = '9';
                    k--;
                }
                if(numArr[n - i - 1] != '9'){
                    numArr[n - i - 1] = '9';
                    k--;
                }
            }
        }

        System.out.println(new String(numArr));
    }
}
