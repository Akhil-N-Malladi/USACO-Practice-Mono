package problems.dsa.string;

import java.util.*;

public class USACO2022USOpenContestBronzeProblem1Photoshoot {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int cows = kbr.nextInt();
        String ord = kbr.next();
        char[] order= new char[cows];
        List<Character> reversed = new ArrayList<>();
        List<Character> bestReversed = new ArrayList<>();
        int even=-1;
        int currEven =0;
        int g = 0;
        int maxEven = (int)Math.min(Math.floor(cows/2),g);
        int counter=0;
        for (int x=0; x<cows; x++)
        {
            order[x]=ord.charAt(x);
            if (ord.charAt(x)=='G') {
                g++;
                if(x%2==0)
                    currEven++;
            }
        }

        //while(maxEven!= currEven){
            reversed.clear();
            even=0;
            System.out.println("\n");
            for(int x=0; x<cows; x++){
                reversed.add(order[x]);
                even=0;
                for(int y=x; y>=0; y-=2){
                    if(reversed.get(y)=='G') {
                        even++;
                    }
                }
                for(int z=x+1; z<cows; z++){
                    if(order[z]=='G'){
                        even++;
                    }
                }
                //System.out.println(even+"\t\t\t"+currEven);
                if(even>currEven) {
                    bestReversed.clear();
                    bestReversed.addAll(reversed);
                    //System.out.println("a");
                }
                currEven=Math.max(even,currEven);
                counter++;
                System.out.println(bestReversed);

            }
            //System.out.println(bestReversed);
            for(int x = 0; x<bestReversed.size()-1; x++)
            {
                order[x]=bestReversed.get(bestReversed.size()-x-1);
            }
           System.out.println(Arrays.toString(order));
        //}
        //System.out.println(counter);
    }
}