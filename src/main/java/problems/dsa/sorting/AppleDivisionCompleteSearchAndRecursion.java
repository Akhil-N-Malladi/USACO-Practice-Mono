package problems.dsa.sorting;

import java.io.*;
import java.util.*;
public class AppleDivisionCompleteSearchAndRecursion {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int apples = kbr.nextInt();
        int[] weight = new int[apples];
        int groupTotal =0;
        int total = 0;
        int curr;
        int minDiff = 1000000000;
        for(int x=0; x<apples; x++) {
            curr=kbr.nextInt();
            total+=curr;
            weight[x]=curr;
        }
        Arrays.sort(weight);
        System.out.println(total);

        for(int x=0; x<apples; x++)
        {
            groupTotal+=weight[x];
            System.out.println(groupTotal);
            minDiff=Math.min(minDiff, Math.abs(groupTotal-(total-groupTotal)));
        }
        System.out.println(minDiff);

    }
}