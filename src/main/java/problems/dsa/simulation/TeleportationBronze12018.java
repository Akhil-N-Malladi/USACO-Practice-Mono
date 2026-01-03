package problems.dsa.simulation;

import java.io.*;
import java.util.*;
public class TeleportationBronze12018 {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int start = kbr.nextInt();
        int end = kbr.nextInt();
        int tp1 = kbr.nextInt();
        int tp2 = kbr.nextInt();
        int path1 = 0;
        int path2 = 0;
        int path3 = 0;
        int distance = 0;

        path1=Math.abs(start-tp1)+Math.abs(tp2-end);

        path2=Math.abs(start-tp2)+Math.abs(tp1-end);

        path3=Math.abs(start-end);
        distance=Math.min(Math.min(path1,path2),path3);
        System.out.println(distance);
    }
}

//Finished in 12m 54 seconds