package problems.dsa.sorting;

import java.util.*;
public class WonderfulGloves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            int colors = sc.nextInt();
            int minPairs = sc.nextInt();
            int[][] socks = new int[2][colors];
            int[] remainders = new int[colors];
            long res = 0;
            for(int i=0; i<2; i++){
                for(int j=0; j<colors; j++){
                    socks[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<colors; i++){
                int chosen = 1;
                if(socks[0][i]>socks[1][i]){
                    chosen = 0;
                }
                res+=socks[chosen][i];
                remainders[i] = socks[(chosen+1)%2][i];
            }

            Arrays.sort(remainders);
            for(int i=colors-1; i>colors-minPairs; i--){
                res+=remainders[i];
            }
            res++;
            System.out.println(res);
        }
    }
}