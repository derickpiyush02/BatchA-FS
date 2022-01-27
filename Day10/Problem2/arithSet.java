import java.util.*;
class arithSet {
    static int longestSub(int[] nums,int diff) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+diff==nums[j]){
                    dp[i]=Integer.max(dp[i],1+dp[j]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[dp.length-1];
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int diff = cin.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i]=cin.nextInt();
        System.out.println(longestSub(nums,diff));
    }
}
