import java.util.*;
public class extra {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        String[] str = s.split(" ");
        int xor = 0;
        for(int i=0;i<str[0].length();i++) {
           xor^=str[0].charAt(i);
        }
        for(int i=0;i<str[1].length();i++) {
           xor^=str[1].charAt(i);
        }
        System.out.println((char)xor);
    }
}
