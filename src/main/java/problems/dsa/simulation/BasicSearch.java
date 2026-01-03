package problems.dsa.simulation;

import java.io.*;
import java.util.*;
public class BasicSearch {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int number = kbr.nextInt();
        double maxDistance = 0;
        double distance = 0;
        int[][] points = new int[number][2];
        for(int x=0; x<number; x++)
            points[x][0]=kbr.nextInt();
        for(int x=0; x<number; x++)
            points[x][1]=kbr.nextInt();
        for(int x=0; x<number; x++) {
            for (int y = 0; y < number; y++) {
                distance=Math.pow(points[x][0]-points[y][0],2)+Math.pow(points[x][1]-points[y][1],2);
                maxDistance=Math.max(maxDistance, distance);
            }
        }
        System.out.println(maxDistance);
    }
}
