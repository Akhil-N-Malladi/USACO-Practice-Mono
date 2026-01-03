package problems.dsa.string;

//Time complexity O(n)
//13:57
//Works for all 10 test cases

import java.util.*;
public class USACO2020FebruaryContestBronzeProblem2MadScientist {
    public static void main(String[] args) {

        Scanner kbr = new Scanner(System.in);
        int cows = kbr.nextInt();
        String result = kbr.next();
        String og = kbr.next();
        int transforms = 0;
        boolean cont = false;

        for(int x=0; x<cows; x++){
            if(result.charAt(x)==(og.charAt(x))){
                if(cont) {
                    transforms++;
                }
                cont=false;
            }
            else{
                cont=true;
            }
        }

        System.out.println(transforms);
    }
}