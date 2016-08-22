package codechallenges.hackerrank.algorithms.search;

import java.util.Scanner;

/**
 * Created by JacksonChang408 on 8/21/2016.
 * Watson gives Sherlock an array of length . Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
 Formally, find an , such that, 12i-1 i+1i+2N.

 Input Format
 The first line contains , the number of test cases. For each test case, the first line contains , the number of elements in the array . The second line for each test case contains space-separated integers, denoting the array .

 Output Format
 For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

 Constraints


 i

 Sample Input

 2
 3
 1 2 3
 4
 1 2 3 3

 Sample Output

 NO
 YES

 Explanation
 For the first test case, no such index exists.
 For the second test case, , therefore index satisfies the given conditions.
 */
public class SherlockArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k;
        int leftSum;
        int rightSum;

        for(int i = 0; i < t; i++){
            k = in.nextInt();
            int arr[] = new int[k];

            for(int j = 0; j < k; j++){
                arr[j] = in.nextInt();
            }

            if (k == 1){
                System.out.println("YES");
                continue;
            }else if(k == 2){
                System.out.println("NO");
                continue;
            }

            leftSum = 0;
            rightSum = 0;
            for(int b = 1; b < k; b++){
                rightSum += arr[b];
            }

            for(int j = 1; j < k - 1; j++){

                leftSum += arr[j - 1];

                rightSum -= arr[j];

                if(leftSum == rightSum){
                    System.out.println("YES");
                    break;
                }

                if(j + 2 == k){
                    System.out.println("NO");
                }
            }
        }
    }
}
