import java.util.*;
public class FrequencyQueries {
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> valToFreq = new HashMap<>();
        Map<Integer, Integer> freqCount = new HashMap<>();
        
        for(List<Integer> curr: queries) {
            if(curr.get(0) == 1) {
                int freq = valToFreq.getOrDefault(curr.get(1), 0);
                if(freq != 0) {
                    freqCount.put(freq, freqCount.getOrDefault(freq, 0)-1);
                    if(freqCount.get(freq) <= 0) freqCount.remove(freq);
                }
                valToFreq.put(curr.get(1), valToFreq.getOrDefault(curr.get(1), 0)+1);
                freqCount.put(valToFreq.get(curr.get(1)), freqCount.getOrDefault(valToFreq.get(curr.get(1)), 0)+1);
            } else if (curr.get(0) == 2) {
                if(valToFreq.containsKey(curr.get(1))) {
                    int freq = valToFreq.get(curr.get(1));
                    freqCount.put(freq, freqCount.getOrDefault(freq, 0)-1);
                    if(freqCount.get(freq) <= 0) freqCount.remove(freq);
                    
                    valToFreq.put(curr.get(1), valToFreq.getOrDefault(curr.get(1), 0)-1);
                    if(valToFreq.get(curr.get(1)) <= 0) {
                        valToFreq.remove(curr.get(1));
                    }
                    freqCount.put(valToFreq.get(curr.get(1)), freqCount.getOrDefault(valToFreq.get(curr.get(1)), 0)+1);
                }
            } else {
                if(freqCount.containsKey(curr.get(1))) {
                    ans.add(1);
                } else {
                    ans.add(0);
                }
            }
        }
        
        return ans;

    }
}