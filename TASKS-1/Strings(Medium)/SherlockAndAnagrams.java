import java.util.*;
public class SherlockAndAnagrams {
    public static int sherlockAndAnagrams(String s) {
        // Write your code here
            int n = s.length();
            Map<String, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++) {
                for(int j=i; j<n; j++) {
                    char[] arr = s.substring(i,j+1).toCharArray();
                    Arrays.sort(arr);
                    String substr = new String(arr);
                    map.put(substr, map.getOrDefault(substr,0)+1);
                }  
            }
            int ans = 0;
            for(String k:map.keySet()) {
                int val = map.get(k);
                ans+=val*(val-1)/2;
            }
            return ans;
    
        }
}
