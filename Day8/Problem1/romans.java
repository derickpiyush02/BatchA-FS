import java.util.*;
public class romans {
    public static void getRomans(int n) {
        int dig[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String romanDig[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i=12;   
        while(n>0){
            int q = n/dig[i];
            if(q != 0){
                n = n%dig[i];
                while(q>0){
                    System.out.print(romanDig[i]);
                    q--;
                }
            }      
            i--;
        }
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        getRomans(n);
    }
}
