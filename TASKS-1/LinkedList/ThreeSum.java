import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i]!= nums[i-1])){
                int low = i+1;
                int high = n-1;
                int sum = 0-nums[i];
            
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        ArrayList<Integer> sub = new ArrayList<Integer>();
                        sub.add(nums[i]);
                        sub.add(nums[low]);
                        sub.add(nums[high]);
                        ans.add(sub);

                        while(low<high && nums[low]==nums[low+1]){
                            low++;
                        }
                        while(low<high && nums[high]==nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]<sum){
                        low++;
                    }else{
                        high--;
                    }

                }
            }
        }
        return ans;
    
    }
}
