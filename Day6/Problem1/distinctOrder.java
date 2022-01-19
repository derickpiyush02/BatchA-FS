import java.util.*;
public class distinctOrder {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        String res = "";
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        for(char ch : set) {
            res = res+ch;
        }
        System.out.println(res);
    }
}
