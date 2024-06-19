import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxx = Integer.MIN_VALUE;
        while(j<n) {
            if(set.contains(s.charAt(j))) {
                while(i<j && set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            maxx = Math.max(maxx, j-i+1);
            j++;
        }
        return maxx;
    }
}
