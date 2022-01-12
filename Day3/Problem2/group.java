import java.util.*;

public class group {
    public static boolean check(String[] st,int k) {
        if(k>st.length || st.length%k!=0) 
            return false;
        int arr[] = new int[st.length];
        Map<Integer,Integer> m = new TreeMap<Integer,Integer>();
        for(int i=0;i<st.length;i++) {
            arr[i] = Integer.parseInt(st[i]);
            int count = m.getOrDefault(arr[i], 0);
            m.put(arr[i], count + 1);
        }
        for (Map.Entry<Integer,Integer> entry : m.entrySet()) {
    		int currKey = entry.getKey();
    		int val = entry.getValue();
    		if(val>0) {
    			for (int i = 1; i < k; ++i) {
    				if (!m.containsKey(currKey+i)) {
    					return false;
    				}
    				m.put(currKey+i,m.get(currKey+i)-val);
    				if (m.get(currKey+i) < 0)
    					return false;
    			}
    		}
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        String st[] = s.split(" ");
        int k = cin.nextInt();
        if(check(st,k)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
