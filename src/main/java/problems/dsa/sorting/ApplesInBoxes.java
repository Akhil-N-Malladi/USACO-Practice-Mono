package problems.dsa.sorting;

import java.util.*;

public class ApplesInBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            int len = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[len];

            for(int i=0; i<len; i++) arr[i] = sc.nextInt()-k;
            Arrays.sort(arr);
        }
    }
}