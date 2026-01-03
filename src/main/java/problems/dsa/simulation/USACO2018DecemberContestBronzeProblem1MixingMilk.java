package problems.dsa.simulation;

import java.util.*;
public class USACO2018DecemberContestBronzeProblem1MixingMilk {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[] max = new int[3];
        int[] level = new int[3];
        for(int i=0; i<3; i++){
            max[i]=kbr.nextInt();
            level[i]=kbr.nextInt();
        }

        for(int i=0; i<100; i++){
            int currBucket = i%3;
            int nextBucket = (currBucket+1)%3;
            if(level[currBucket]+ level[nextBucket]<=max[(currBucket+1)%3]){
                level[(currBucket+1)%3]+= level[currBucket];
                level[currBucket]=0;
            }
            else{
                int transfer = max[(currBucket+1)%3]-level[nextBucket];
                level[currBucket]-=transfer;
                level[nextBucket]+=transfer;
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(level[i]);
        }
    }
}

//11 minutes and 21 seconds