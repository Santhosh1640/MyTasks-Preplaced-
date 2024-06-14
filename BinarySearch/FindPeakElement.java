package BinarySearch;
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int max = nums[0];
        int maxInd = 0;

        while(i<=j) {
            if(nums[i]<=nums[j]) {
                if(nums[j]>=max) {
                    max = nums[j];
                    maxInd = j;
                }
                i++;
            }
            else {
                if(nums[i]>=max) {
                    max = nums[i];
                    maxInd = i;
                }
                j--;
            }
        }
        return maxInd;
    }
}