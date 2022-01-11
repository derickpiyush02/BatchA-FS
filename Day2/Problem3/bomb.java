import java.util.*;
import java.lang.*;
public class bomb {
    public static int min(int n1,int n2,int n3) {
        if(n3==0) {
            return (n1<n2)?n1:n2;
        }
        return min(min(n1,n2,0),n3,0);
    }
    public static int minBombed(int [][]ip,int n) {
        int [][] dp = new int[n][n];
        for(int i=0;i<n;i++) {
            dp[0][i] = ip[0][i];
        }
        for(int i=1;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(j==0) {
                    dp[i][j] = ip[i][j]+min(dp[i-1][j],dp[i-1][j+1],0); 
                }
                else if(j==n-1) {
                    dp[i][j] = ip[i][j]+min(dp[i-1][j],dp[i-1][j-1],0);
                }
                else {
                    dp[i][j] = ip[i][j]+min(dp[i-1][j-1],dp[i-1][j],dp[i-1][j+1]);
                }
            }
        }
        /*Check 1
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/
        int minimum = 10000;
        for(int i=0;i<n;i++) {
            if(minimum>dp[n-1][i]) {
                minimum = dp[n-1][i];
            }
        }
        return minimum;
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ip[][] = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                ip[i][j] = cin.nextInt();
            }
        }
        int result = minBombed(ip,n);
        System.out.println(result);
    }
}
