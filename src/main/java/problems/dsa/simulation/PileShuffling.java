package problems.dsa.simulation;

import java.util.*;
public class PileShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases=  sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int piles = sc.nextInt();
            int res = 0;
            int[][] towers = new int[piles][4];
            for(int i=0; i<piles; i++){
                for(int j=0; j<4; j++){
                    towers[i][j] = sc.nextInt();
                }
            }
            for(int[] i:towers){
                res+=Math.max(i[2]-i[0],0);
                res+=Math.max(i[3]-i[1],0);
            }
            System.out.println(res);
        }
    }
}