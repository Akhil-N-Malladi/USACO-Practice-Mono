package problems.dsa.simulation;

//Completed in 7 minutes and 22 seconds
import java.util.*;
public class USACO2016FebruaryContestBronzeProblem2CircularBarn {
    public static void main(String[] args) {
        Scanner kbr=  new Scanner(System.in);
        int rooms = kbr.nextInt();
        int[] room = new int[rooms];
        for(int i=0; i<rooms; i++){
            room[i]=kbr.nextInt();
        }
        int minDist = 0;
        //Go through each combination
        for(int i=0; i<rooms; i++){
            //Simulate walking through each room
            int distance = 0;
            for(int j=0; j<rooms; j++){
                distance+=j*room[(i+j)%rooms];
            }
            if(i==1){
                minDist=distance;
            }else{
                minDist=Math.min(minDist,distance);
            }
        }
        System.out.println(minDist);
    }
}

/*
4    7    8    6    4
4*4 +7*0 +8*1+ 6*2+ 4*3 = 48
*/