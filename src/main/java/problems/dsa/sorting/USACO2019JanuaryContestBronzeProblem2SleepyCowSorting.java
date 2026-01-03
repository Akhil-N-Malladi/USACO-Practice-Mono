package problems.dsa.sorting;

//1 2 5 4 3 2x- 4      2 5 4 1 3   5 4 1 2 3   5 1 2 3 4   1 2 3 4 5
//1 5 2 4 3 3x- 4      5 2 4 1 3   2 4 1 3 5   4 1 2 3 5   1 2 3 4 5
//2 1 5 4 3 4x- 4      1 5 4 2 3   5 4 1 2 3   4 1 2 3 5   1 2 3 4 5
//4 1 5 3 2 5x- 4      1 5 3 2 4   5 3 1 2 4   3 1 2 4 5   1 2 3 4 5
//5 4 2 1 3 5x- 3      4 2 1 3 5   2 1 3 4 5   1 2 3 4 5
//1 2 4 3 2x- 3     2 4 1 3   4 1 2 3   1 2 3 4
//2 3 1 4 3x- 2     3 1 2 4   1 2 3 4
//3 4 1 2 4x- 2     4 1 2 3   1 2 3 4
//1 3 2 - 2  3 1 2  1 2 3

import java.io.*;
import java.util.*;
public class USACO2019JanuaryContestBronzeProblem2SleepyCowSorting {
//    public static void main(String[] args) {
//        Scanner kbr = new Scanner(System.in);
//        int len = kbr.nextInt();
//        int[] nums = new int[len+1];
//        int[] sorted = new int[len+1];
//        int counter = 0;
//
//
//        for (int x=0; x<len; x++)
//        {
//            nums[x]=kbr.nextInt();
//            sorted[x]=kbr.nextInt();
//        }
//        Arrays.sort(sorted);
//
//
//        for(int x=0; x<len; x++)
//        {
//            for(int y=0; y<len;y++)
//            {
//                if(nums[y]>nums[x])
//                {
//                    nums[len+1]=nums[x];
//                    nums[y]=nums[x];
//                }
//            }
//
//
//            counter++;
//            if(Arrays.equals(nums,sorted))
//                break
//        }
//
//
//        System.out.println(counter);
//
//    }
}