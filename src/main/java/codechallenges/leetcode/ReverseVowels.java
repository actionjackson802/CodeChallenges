package codechallenges.leetcode;

/**
 * Created by JacksonChang408 on 8/11/2016.
 *
 *
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".
 *
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        char t1;
        //aeiou

        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' &&
                    arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U'){
                continue;
            }
            else{
                for(int j = n - 1; j > i; j--){
                    if(arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' &&
                            arr[j] != 'A' && arr[j] != 'E' && arr[j] != 'I' && arr[j] != 'O' && arr[j] != 'U'){
                        continue;
                    }
                    else{
                        t1 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t1;
                        n = j;
                        break;
                    }
                }
            }
        }
        return new String(arr);
    }
}
