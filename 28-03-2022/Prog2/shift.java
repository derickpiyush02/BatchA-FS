import java.util.*;
class shift {
    public static void groupify(String[] str) {
        LinkedHashMap<String,List<String>> m = new LinkedHashMap<String,List<String>>();
        for(int i=0;i<str.length;i++) {
            String groupVal = "";
            String s  = str[i];
            for(int j=1;j<s.length();j++) {
                int ch = s.charAt(j)-s.charAt(j-1);
                if(ch<0) ch = ch + 26;
                groupVal+=(ch+'a');
            }
            if(!m.containsKey(groupVal)) {
                m.put(groupVal,new ArrayList<String>());
            }
            m.get(groupVal).add(s);
        }
        ArrayList<List<String>> l = new ArrayList<List<String>>();
        for(Map.Entry<String,List<String>> e : m.entrySet()) {
            ArrayList<String> tmp = new ArrayList<String>(e.getValue());
            Collections.sort(tmp);
            l.add(tmp);
        }
        System.out.println(l);
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        String[] str = s.split(" ");
        groupify(str);
    }
}
