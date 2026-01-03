package problems.dsa.simulation;

import com.sun.security.jgss.InquireType;

import java.util.*;
public class EqualValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int len = sc.nextInt();
            long[] arr = new long[len];
            int l = 0;
            int r = 0;
            long minCost = Long.MAX_VALUE;
            //Input reading
            for(int i=0; i<len; i++) arr[i] = sc.nextLong();
            //Solving
            while(r<len){
                if(r!=len-1 && arr[r+1] == arr[l]){
                    r++;
                } else {
                    Long currCost = arr[l]*(l)+arr[r]*(len-1-r);
                    minCost = Math.min(currCost,minCost);
                    r++;
                    l = r;
                }
            }
            if(minCost==Long.MAX_VALUE){
                minCost=0;
            }
            System.out.println(minCost);
        }
    }
}