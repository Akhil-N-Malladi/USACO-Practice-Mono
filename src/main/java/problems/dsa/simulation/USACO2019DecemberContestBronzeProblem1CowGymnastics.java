package problems.dsa.simulation;

//Completed in 15 minutes and 46 seconds

import java.util.*;
public class USACO2019DecemberContestBronzeProblem1CowGymnastics {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int days = kbr.nextInt();
        int cows = kbr.nextInt();
        int pairs = 0;
        boolean consistent = true;
        int[][] cowRanks = new int[days][cows];
        for(int i=0; i<days; i++){
            for(int j=0; j<cows; j++){
                cowRanks[i][j]=kbr.nextInt();
            }
        }
        //Select cow 1
        for(int i=1; i<=cows; i++){
            //Select cow 2
            for(int j=1; j<=cows; j++){
                if(i==j){continue;}
                consistent=true;
                //Cycle through each day
                for(int k=0; k<days; k++) {
                    //Check each cow
                    for (int l = 0; l < cows; l++) {
                        if(cowRanks[k][l]==i){
                            //System.out.println(1);
                            break;
                        } else if (cowRanks[k][l]==j) {
                            consistent=false;
                        }
                    }
                }
                if(consistent){
                    //System.out.println(i+"\t"+j);
                    pairs++;
                }
                //System.out.println("------");
            }
        }
        System.out.println(pairs);
    }
}