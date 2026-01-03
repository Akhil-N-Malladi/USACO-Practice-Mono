package problems.dsa.simulation;

import java.io.*;
import java.util.*;

public class SquarePastureUSACOBronze1December2016 {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);

        int minx=11;
        int miny=11;
        int maxx=-1;
        int maxy=-1;
        int length;
        int hieght;
        int[][] pasture = new int[4][2];
        for(int x=0; x<4; x++)
        {
            for(int y=0; y<2; y++)
            {
                pasture [x][y]=kbr.nextInt();
            }
        }

        for(int x=0; x<4; x++)
        {
            if(pasture[x][0]<minx)
                minx=pasture[x][0];

            if(pasture[x][1]<miny)
                miny=pasture[x][1];

            if(pasture[x][0]>maxx)
                maxx=pasture[x][0];

            if(pasture[x][1]>maxy)
                maxy=pasture[x][1];
        }

        length = Math.abs(maxx-minx);
        hieght = Math.abs(maxy-miny);
        System.out.println(Math.max(length,hieght)*Math.max(length,hieght));

    }
}

//Finished in 23 mins 6 seconds