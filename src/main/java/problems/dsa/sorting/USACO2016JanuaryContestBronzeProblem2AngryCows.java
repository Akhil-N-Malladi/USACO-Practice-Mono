package problems.dsa.sorting;

import java.util.*;
public class USACO2016JanuaryContestBronzeProblem2AngryCows {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int nums = kbr.nextInt();
        int[] haybale = new int[nums];
        Arrays.sort(haybale);
        for(int i=0; i<nums; i++){
            haybale[i]=kbr.nextInt();
        }
        //Run Through Each Possibility
        for(int i=0; i<nums; i++){
            int[] copy = new int[nums];
            copyArray(haybale,copy);
            int start = haybale[i];
            //chain reaction
            int dist = 1;
            while(true){

            }

        }
    }
    public static int[] copyArray(int[] original, int[] copy) {
        int len = original.length;
        for(int i = 0; i<len; i++){
            copy[i]=original[i];
        }
        return copy;
    }
}