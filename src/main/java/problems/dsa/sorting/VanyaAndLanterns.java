package problems.dsa.sorting;

import java.util.*;

public class VanyaAndLanterns {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int numLanterns = kbr.nextInt();
        int streetLen = kbr.nextInt();
        int[] lanterns = new int[numLanterns];

        for(int i=0; i<numLanterns; i++){
            lanterns[i] = kbr.nextInt();
        }

        Arrays.sort(lanterns);

        if(numLanterns<=1) {
            System.out.println(Math.max(streetLen-lanterns[0],lanterns[0]));
            System.exit(0);
        }

        double maxDist = 0;
        int prev = lanterns[0];

        for(int i=1; i<numLanterns; i++){
            int curr = lanterns[i];
            maxDist=Math.max((double) (curr - prev  ) /2, maxDist);
            prev = curr;
        }

        maxDist=Math.max(maxDist,lanterns[0]);
        maxDist=Math.max(maxDist,streetLen-lanterns[numLanterns-1]);
        System.out.println(maxDist);
    }
}
// 7 15
// 0 3 5 7 9 14 15
// 15 5 3 7 9 14 0