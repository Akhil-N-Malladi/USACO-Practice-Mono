package problems.dsa.simulation;

//Completed in 9 minutes and 57 seconds
//Passed all 10 testcases
import java.util.*;
public class USACO2016JanuaryContestBronzeProblem1PromotionCounting {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[][] standings = new int[4][2];
        int[] promotions = new int[3];
        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                standings[i][j]=kbr.nextInt();
            }
        }
        for(int i=3; i>0; i--){
            int diff = standings[i][1]-standings[i][0];
            promotions[i-1] = diff;
            standings[i-1][1] +=diff;
        }
        for(int i=0; i<3; i++){
            System.out.println(promotions[i]);
        }
    }
}