package problems.dsa.simulation;

import java.util.*;
public class SquarePasture {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int minX = 11;
        int minY = 11;
        int maxX = -1;
        int maxY = -1;
        for (int x = 0; x < 8; x++){
            int temp = kbr.nextInt();
            if (x % 2 == 0) {
                minX = Math.min(minX, temp);
                maxX = Math.max(maxX, temp);
            } else {
                minY = Math.min(minY, temp);
                maxY = Math.max(maxY, temp);
            }
        }
        int area = (int)Math.pow(Math.max(maxX-minX,maxY-minY),2);
        //System.out.println(""+minX+"\t"+minY+"\t"+maxX+"\t"+maxY);
        System.out.println(area);
    }
}
//Completed in 15 mins