import java.util.*;

public class CommonChild {
    //This problem is same as Longest Common Subsequence
    public static int helper(int ind1, int ind2, String s1, String s2, int[][] dp) {
        if(ind1<0 || ind2<0) {
            return 0;
        }
        if(dp[ind1][ind2]!=-1) {
            return dp[ind1][ind2];
        }
        int match = 0;
        int notmatch=0;
        if(s1.charAt(ind1)==s2.charAt(ind2)) {
            match = 1+helper(ind1-1, ind2-1, s1, s2, dp);
        }else {
            notmatch = Math.max(helper(ind1-1, ind2, s1, s2, dp),
                                helper(ind1, ind2-1, s1, s2, dp));
        }
        return dp[ind1][ind2]=Math.max(match,notmatch);
    }
    public static int commonChild(String s1, String s2) {
    // Write your code here
        int n = s1.length();
        int[][] dp = new int[n+1][n+1];
        for(int[] arr:dp) {
           Arrays.fill(arr,-1); 
        } 
        return helper(n-1,n-1,s1,s2,dp);
        

    }
}
