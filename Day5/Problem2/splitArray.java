import java.util.*;

class splitArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++) arr.add(sc.nextInt());
        sc.close();
        Collections.sort(arr);
        int sum = arr.stream().mapToInt(Integer::intValue).sum(),flag = 0,half = sum/2,check = sum;
        if(sum%2 != 0) flag = 0;
        else{
            for(int i = 0;i<arr.size();i++){
                if(check<half){
                    arr.remove(0);
                    i = -1;
                    check = sum;
                    continue;
                }
                else if(check == half){
                    flag = 1;
                    break;
                }
                check-=arr.get(i);
            }
        }
        System.out.println(flag == 0?"false":"true");
    }
}
