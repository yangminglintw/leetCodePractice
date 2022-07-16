package leetcode;

import java.util.HashMap;

public class IsomorphicSolution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Object, Object> stringMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (stringMap.containsKey(s.charAt(i))) {
                if (!stringMap.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                if (stringMap.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    stringMap.put(s.charAt(i), t.charAt(i));
                }
            }
        }

        return true;
    }
}
