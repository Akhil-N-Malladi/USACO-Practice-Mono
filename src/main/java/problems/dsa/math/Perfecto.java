package problems.dsa.math;

import java.util.*;
public class Perfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            if(n==1){
                System.out.println(-1);
                continue;
            }
            for(int i = 0; i<n; i++){
                arr.add(i+1);
            }
            //System.out.println(arr);
            int sum = 0;
            for(int i=0; i<arr.size(); i++){
                sum += arr.get(i);
                while(Math.sqrt(sum)%1==0){
                    sum-=arr.get(i);
                    int curr = arr.get(i);
                    arr.remove(i);
                    arr.add(curr);
                    sum+=arr.get(i);
                    //System.out.println(arr);
                }
            }
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}