import java.util.*;
public class spaceable {
    public static boolean splitWords(String s,HashSet<String>hs) {
        String tmp = "";
        for(int i=0;i<s.length();i++) {
            tmp = tmp + s.charAt(i);
            if(hs.contains(tmp)) {
                tmp = "";
            }
        }
        if(tmp.length()!=0) return false;
        return true;
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s1 = cin.nextLine();
        String s2 = cin.nextLine();
        String[] str1 = s1.split(" ");
        HashSet<String> hs = new HashSet<String>();
        for(String s : str1) {
            hs.add(s);
        }
        if(splitWords(s2,hs)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
