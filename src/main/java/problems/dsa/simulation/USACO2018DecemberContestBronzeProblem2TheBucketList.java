package problems.dsa.simulation;

import java.util.*;
public class USACO2018DecemberContestBronzeProblem2TheBucketList {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int minBuckets = 0;
        int currBuckets = 0;
        int cows = kbr.nextInt();
        int[] startTime = new int[cows];
        int[] endTime = new int[cows];
        int[] buckets = new int[cows];
        int finalEndTime = 0;
        for(int i=0; i<cows; i++){
            startTime[i]=kbr.nextInt();
            endTime[i]=kbr.nextInt();
            buckets[i]=kbr.nextInt();
            finalEndTime=Math.max(finalEndTime,endTime[i]);
        }

        for(int i=1; i<finalEndTime; i++){
            for(int j=0; j<cows; j++){
                if(i==startTime[j]){
                    currBuckets+=buckets[j];
                }
                else if(i==endTime[j]){
                    currBuckets-=buckets[j];
                }
                minBuckets=Math.max(currBuckets,minBuckets);
            }
        }
        System.out.println(minBuckets);
    }
}
//Completed in 8 mins 41 seconds