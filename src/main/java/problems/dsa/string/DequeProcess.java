package problems.dsa.string;

import java.util.*;
public class DequeProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-- > 0) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
            }
            StringBuilder sb = new StringBuilder(len);
            int r = len-1;
            int l = 0;
            for (int i = 0; i < len; i++) {
                if(i%2==0){
                    if(arr[l]<arr[r]){
                        l++;
                        sb.append("L");
                    } else {
                        r--;
                        sb.append("R");
                    }
                } else {
                    if(arr[l]>arr[r]){
                        l++;
                        sb.append("L");
                    } else {
                        r--;
                        sb.append("R");
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}