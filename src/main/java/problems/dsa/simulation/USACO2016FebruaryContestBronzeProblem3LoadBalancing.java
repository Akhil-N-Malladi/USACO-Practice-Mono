package problems.dsa.simulation;

//Completed in 20 minutes and 3 seconds
//Only passes 7 testcases
//Remaining 3 testcases run out of time
import java.util.*;
public class USACO2016FebruaryContestBronzeProblem3LoadBalancing {
    public static void main(String[] args) {
        Scanner kbr=  new Scanner(System.in);
        int cows = kbr.nextInt();
        int size = kbr.nextInt();
        int[][] coords = new int[cows][2];
        for(int i=0; i<cows; i++) {
            for (int j = 0; j < 2; j++) {
                coords[i][j] = kbr.nextInt();
            }
        }
        int m = largestMin(coords,0,0,cows);
        boolean exit = false;
        for(int i=0; i<cows; i++){
            for(int j=0; j<cows; j++){
               m=Math.min(m,largestMin(coords,coords[i][0]+1,coords[j][1]+1,cows));
                //System.out.println(m+"\tx:"+i+"\ty:"+j);
                if(m==Math.ceil(cows/4.0)){
                    exit = true;
                    break;
                }
            }
            if(exit){
                break;
            }
        }
        System.out.println(m);

    }

    public static int largestMin(int[][] coords, int xAvg, int yAvg, int cows){
        int quad1 = 0;
        int quad2 = 0;
        int quad3 = 0;
        int quad4 = 0;
        for(int i=0; i<cows; i++){
            if(coords[i][0]<xAvg&&coords[i][1]<yAvg){
                quad3++;
            }
            else if(coords[i][0]>xAvg&&coords[i][1]<yAvg){
                quad4++;
            }
            else if(coords[i][0]>xAvg&&coords[i][1]>yAvg){
                quad1++;
            }
            else if(coords[i][0]<xAvg&&coords[i][1]>yAvg){
                quad2++;
            }
        }
        //System.out.println(quad1+"\t"+quad2+"\t"+quad3+"\t"+quad4);
        return (Math.max(Math.max(quad1,quad2),Math.max(quad3,quad4)));
    }
}