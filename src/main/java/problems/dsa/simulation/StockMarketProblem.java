package problems.dsa.simulation;

import java.util.*;
public class StockMarketProblem {
    public static void main(String[] args) {
            ArrayList<Integer> prices = new ArrayList<Integer>();
            Scanner kbr = new Scanner(System.in);
            int buy=0;
            int sell=1;
            int diff;
            int days = kbr.nextInt();
            for(int x=0; x<days; x++)
                prices.add(kbr.nextInt());
            /*while(kbr.hasNext()) {
                prices.add(kbr.nextInt());
            }*/
            //int days =prices.size();
            diff=prices.get(sell)-prices.get(buy);
            sell++;
            while(sell>buy&&sell<days){
                if(prices.get(sell)-prices.get(buy)<=diff){
                    if(sell==days-1) {
                        buy++;
                    }
                    else {
                        sell++;

                        if (prices.get(sell) - prices.get(buy) < diff) {
                            sell--;
                            buy++;
                        } else {
                            diff = prices.get(sell) - prices.get(buy);
                        }
                    }

                }
                else{
                    diff=prices.get(sell)-prices.get(buy);
                }
            }
            if(diff<=0) {
                System.out.println(0);
            }
            else{
                System.out.println(diff);
            }
            int[] p = new int[5];
            int l = p.length;

    }
}