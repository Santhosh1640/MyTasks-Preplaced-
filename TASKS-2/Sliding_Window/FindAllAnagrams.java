import java.util.*;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        
        List<Integer> ans = new ArrayList<>();
        if(n2>n1) {
            return ans;
        }

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> pMap = new HashMap<>();
        for(int i=0; i<n2; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
        }
        if(sMap.equals(pMap)) {
            ans.add(0);
        }
        int l = 0;
        int r = n2;

        while(r<n1) {
            char alp = s.charAt(r++);
            sMap.put(alp, sMap.getOrDefault(alp,0)+1);

            char del = s.charAt(l++);
            sMap.put(del, sMap.get(del)-1);
            if(sMap.get(del)==0) {
                sMap.remove(del);
            }
            
            if(sMap.equals(pMap)) {
                ans.add(l);
            }
        }
        return ans;
    }
}
