import java.util.*;
public class islands {
    public static int c_1;
    public static int c_2;
    public static int c_3;
    public static int c_4;
    
    public static void checkEdges(int[][] mat,int i,int j) {
        int count = 0;
        if(j>0 && mat[i][j-1]==1) count++;
        if(j<mat[0].length-1 && mat[i][j+1]==1) count++;
        if(i>0 && mat[i-1][j]==1) count++;
        if(i<mat.length-1 && mat[i+1][j]==1) count++;
        switch(count) {
            case 1:
                c_1++;
                break;
            case 2:
                c_2++;
                break;
            case 3:
                c_3++;
                break;
        }
    }
    public static void getOnes(int[][] mat,int r,int c) {
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j]==1) {
                    checkEdges(mat,i,j);
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();
        int c = cin.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = cin.nextInt();
            }
        }
        getOnes(mat,r,c);
        int Perimeter = c_1*3 + c_2*2 + c_3;
        System.out.println(Perimeter);
    }
}
