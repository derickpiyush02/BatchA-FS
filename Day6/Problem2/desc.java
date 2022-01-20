import java.util.*;
import java.lang.*;
class desc {
    public static boolean bcktrck(int pos,String s, List<Integer>l) {
        if(pos>=s.length()) {
            return l.size()>=2;
        }
        int n = 0;
        for(int i=pos;i<s.length();i++) {
            n = n*10 + s.charAt(i)-'0';
            if(l.size()==0 || l.get(l.size()-1)-n == 1) {
                l.add(n);
                if(bcktrck(i+1,s,l)) return true;
                l.remove(l.size()-1);
            }
        }
        return false;
    }
    public static boolean splittable(String s) {
        if(s.length()<=1 || s==null) return false;
        return bcktrck(0,s,new ArrayList<Integer>());
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        if(splittable(s)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
