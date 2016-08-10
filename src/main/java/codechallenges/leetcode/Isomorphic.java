package codechallenges.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JacksonChang408 on 8/9/2016.
 */
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<Character, Character>();
        char key;

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i),t.charAt(i));
            }else{
                key = map.get(s.charAt(i));
                if(key != t.charAt(i)){
                    return false;
                }
            }
        }

        map = new HashMap<Character, Character>();

        for(int i = 0; i < t.length(); i++){
            if(map.get(t.charAt(i)) == null){
                map.put(t.charAt(i),s.charAt(i));
            }else{
                key = map.get(t.charAt(i));
                if(key != s.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

}
