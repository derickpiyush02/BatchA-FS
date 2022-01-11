import java.util.*;
import java.lang.*;
public class nMin {
    public static int nth(String st,int k) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for(int i=0;i<st.length();i++) {
            int n = st.charAt(i)-'0';
            s.add(n);
        }
        if(k>s.size()) return -1;
        int arr[] = new int[s.size()];
        int i=0;
        for(int x : s) {
            arr[i++] = x;
        }
        return arr[k-1];
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String st = cin.nextLine();
        int k = cin.nextInt();
        System.out.println(nth(st,k));
    }
}
