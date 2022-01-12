import java.util.*;
import java.lang.*;
public class friends {
    public static HashSet<Character> s1 = new HashSet<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
    public static HashSet<Character> s2 = new HashSet<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
    public static HashSet<Character> s3 = new HashSet<Character>(Arrays.asList('z','x','c','v','b','n','m'));
    
    public static int checkRow(String str,HashSet<Character>set) {
        for(int i=0;i<str.length();i++) {
            if(!set.contains(str.charAt(i))) {
                return -1;
            }
        }
        return 1;
    }
    public static int check(String str) {
        int idx = 0;
        int flag = 0;
        if((friends.s1).contains(str.charAt(0))) {
            flag = checkRow(str,friends.s1);
        }
        else if((friends.s2).contains(str.charAt(0))) {
            flag = checkRow(str,friends.s2);
        }
        else {
            flag = checkRow(str,friends.s3);
        }
        return flag;
    } 
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        if(!s.contains(" ")) {
            int flag = check(s);
            if(flag==-1) {
                System.out.println("-1");
                System.exit(0);
            }
            else {
                System.out.println(s);
                System.exit(0);
            }
        }
        String orig[] = s.split(" ");
        s = s.toLowerCase();
        String st[] = s.split(" ");
        int idx = 0;
        for(String str : st) {
            if(check(str)==1) {
                System.out.println(orig[idx]);
            }
            idx = idx + 1;
        }
        if(idx==0) {
            System.out.println("-1");
        }
    }
}
