package problems.dsa.simulation;

import java.util.*;
public class USACO2017FebruaryContestBronzeProblem1WhyDidTheCowCrossTheRoad {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[] side = new int[10];
        int crossings = 0;
        int logLen=kbr.nextInt();
        for(int i=0; i<10; i++){
            side[i]=-1;
        }
        for(int i=0; i<logLen; i++){
            int id=kbr.nextInt()-1;
            int nextSide=kbr.nextInt();
            if(side[id]!=nextSide&&side[id]!=-1){
                crossings++;
            }
            side[id]=nextSide;
        }
        System.out.println(crossings);
    }
}
//Completed in 9 minutes and 23 seconds