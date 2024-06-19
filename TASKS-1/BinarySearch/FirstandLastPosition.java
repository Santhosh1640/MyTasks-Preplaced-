package BinarySearch;

public class FirstandLastPosition {
    public int first(int[] nums, int t, int n) {
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid]==t) {
                ans = mid;
                r = mid-1;
            }
            else if(nums[mid]<t) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return ans;
    }
    public int last(int[] nums, int t, int n) {
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if(nums[mid]==t) {
                ans = mid;
                l = mid+1;
            }
            else if(nums[mid]<t) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int ind1 = first(nums, target, n);
        int ind2 = last(nums, target, n);
        int[] ans = new int[2];
        ans[0] = ind1;
        ans[1] = ind2;

        return ans;
    }
}
