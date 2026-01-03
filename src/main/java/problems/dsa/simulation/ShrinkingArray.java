package problems.dsa.simulation;

import java.util.*;
public class ShrinkingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            int len = sc.nextInt();
            int[] arr = new int[len];
            int index = -1;
            int[] range = new int[2];
            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1; i<len-1; i++){
                if(Math.abs(arr[i]-arr[i-1])<=1 || Math.abs(arr[i]-arr[i+1])<=1){
                    System.out.println(0);
                }
            }
            //Static sliding window
            for(int i=0; i<len-3; i++){
                range[0] = Math.min(arr[i],arr[i+1]);
                range[1] = Math.max(arr[i+1],arr[i]);
                if(range[0]<arr[i+2] && range[1]>arr[i+2]){
                    index = i+2;
                    System.out.println(1);
                }
            }

            if(index == 0){
                for(int i=1; i<len-2; i++){
                    range[0] = Math.min(arr[i],arr[i+1]);
                    range[1] = Math.max(arr[i+1],arr[i]);
                    if(range[0]<arr[i-1] && range[1]>arr[i-1]){
                        index = i-1;
                        System.out.println(1);
                    }
                }
            }
            if(index == -1){
                System.out.println(-1);
            }
        }
    }
}