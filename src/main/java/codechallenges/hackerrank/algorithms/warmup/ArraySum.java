package codechallenges.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by JacksonChang408 on 8/19/2016.
 *
 * Given an array of integers, can you find the sum of its elements?

 Input Format

 The first line contains an integer, , denoting the size of the array.
 The second line contains space-separated integers representing the array's elements.

 Output Format

 Print the sum of the array's elements as a single integer.

 Sample Input

 6
 1 2 3 4 10 11

 Sample Output

 31

 Explanation

 We print the sum of the array's elements, which is: .
 */
public class ArraySum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int sum = 0;

        for(int i = 0; i < a; i++){
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
