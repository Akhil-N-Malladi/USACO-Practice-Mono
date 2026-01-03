package problems.dsa.simulation;

//Completed in 12 minutes and 17 seconds

import java.util.*;
import static java.lang.Math.min;

public class USACO2016FebruaryContestBronzeProblem1MilkPails {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int x = kbr.nextInt();
        int y = kbr.nextInt();
        int m = kbr.nextInt();
        int most = m/ min(x,y);
        int milkMax = -1;
        int min = Math.min(x,y);
        int max = Math.max(x,y);
        for(int i=1; i<=most; i++){
            milkMax=Math.max(milkMax,m-((m-min*i)%max));
        }
        System.out.println(milkMax);
    }
}