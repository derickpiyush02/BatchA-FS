import java.util.*;
public class intersection {
    public static HashSet<Integer> convertToInt(String s1) {
        String s [] = s1.split(" ");
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i=0;i<s.length;i++) {
            a.add(Integer.parseInt(s[i]));
        }
        return a;
    }
    public static int checkLen(int l1,int l2,int l3) {
        if(l1>l2 && l1>l3) {
            return 1;
        }
        else if(l2>l3 && l2>l1) {
            return 2;
        }
        else {
            return 3;
        }
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int len;
        String s1 = cin.nextLine();
        String str1[] = s1.split(" ");
        HashSet<Integer>a1 = convertToInt(s1);
        String s2 = cin.nextLine();
        String str2[] = s2.split(" ");
        HashSet<Integer>a2 = convertToInt(s2);
        String s3 = cin.nextLine();
        String str3[] = s3.split(" ");
        HashSet<Integer>a3 = convertToInt(s3);
        int maxLen = checkLen(a1.size(),a2.size(),a3.size());
        int flag = 0;
        switch(maxLen) {
            case 1 : 
                for(int x : a1) {
                    if(a2.contains(x) && a3.contains(x)) {
                        System.out.print(x+" ");
                        flag = 1;
                    }
                }
                break;
            case 2 : 
                for(int x : a2) {
                    if(a1.contains(x) && a3.contains(x)) {
                        System.out.print(x+" ");
                        flag = 1;
                    }
                }
                break;
            case 3 : 
                for(int x : a3) {
                    if(a1.contains(x) && a2.contains(x)) {
                        System.out.print(x+" ");
                        flag = 1;
                    }
                }
                break;
        }
        if(flag==0) {
            System.out.println("-1");
        }
    }
}
