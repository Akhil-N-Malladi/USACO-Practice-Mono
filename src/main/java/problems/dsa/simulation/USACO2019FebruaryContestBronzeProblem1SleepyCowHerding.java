package problems.dsa.simulation;

import java.io.*;
import java.util.*;
public class USACO2019FebruaryContestBronzeProblem1SleepyCowHerding {
    public static void main(String[] args) {

        Scanner kbr = new Scanner(System.in);
        int[] pos = new int[3];
        int min;
        int max;

        for (int x = 0; x < 3; x++) {
            pos[x] = kbr.nextInt();
        }
        if(pos[0]+1==pos[1]||pos[1]+1==pos[2]||pos[0]+2==pos[1]||pos[1]+2==pos[2]) {
            min = 1;
            max = Math.max(pos[1]-pos[0],pos[2]-pos[1])-1;

        }
        else if(pos[0]+1==pos[1]&&pos[1]+1==pos[2])
        {
            min=0;
            max=0;
        }
        else{
            min=2;
            max = Math.max(pos[1]-pos[0],pos[2]-pos[1])-1;

        }
        System.out.println(min+"\n"+max);

    }
}
