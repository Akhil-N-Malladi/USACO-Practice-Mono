package problems.dsa.simulation;

//30 mins
//All test cases take <100ms
//9 out of 10 test cases work
//Worst case time complexity is O(n^2)
//n is at most 100

import java.util.*;
public class USACO2018FebruaryContestBronzeProblem3TamingTheHerd {
    public static void main(String[] args) {
        Scanner kbr=  new Scanner(System.in);
        int days = kbr.nextInt();
        int[] breakout = new int[days];
        breakout[0]=2;
        int min = 0;
        int max = 0;
        int[] counter = new int[days];
        for(int x=0; x<days; x++){
            counter[x]=kbr.nextInt();
            if(counter[x]!=-1)
            {
                for(int y=x;y>x-counter[x]; y--){
                    breakout[y]=1;
                }
                if(x-counter[x]!=-1)
                    breakout[x-counter[x]]=2;
                else {
                    System.out.println("\n"+-1);
                    System.exit(0);
                }
            }
        }
        for(int x=0; x<days; x++)
        {

            if (breakout[x]==0) {
                max++;
            }
            if(breakout[x]==2) {
                min++;
                max++;
            }


        }
        System.out.println(min+" "+max);

    }
}
