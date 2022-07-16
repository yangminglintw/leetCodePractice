package leetcode;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        int ans = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i) + 1));
            }

            hashMap.put(s.charAt(i), 1);
        }

        for (Character c: hashMap.keySet()) {
            ans += hashMap.get(c) / 2 * 2;

            if (ans % 2 == 0 && hashMap.get(c) % 2 == 1){
                ans++;
            }

        }

        return ans;
    }
}
