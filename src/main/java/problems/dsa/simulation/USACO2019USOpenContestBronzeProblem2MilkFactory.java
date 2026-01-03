package problems.dsa.simulation;

import java.util.*;
public class USACO2019USOpenContestBronzeProblem2MilkFactory {
    public static void main(String[] args) {
     Scanner kbr=new Scanner(System.in);
     HashMap<Integer,Integer> walkways = new HashMap<>();
     int num = kbr.nextInt();
     for(int i=0; i<num-1; i++){
         walkways.put(kbr.nextInt(),kbr.nextInt());
     }
     boolean cont = true;
     for(int i=0; i<num; i++){
         for(int j=0; j<num; j++){
             if(j==i){
                 continue;
             }
             int station=j;
             int counter=0;
             while(station!=i&&counter<num&&walkways.get(station)!=null){
                 station=walkways.get(station);
                 counter++;
             }
             if (counter==num){
                 break;
             }
             else if(j==num-1){
                  System.out.println(i);
                  System.exit(0);
             }
         }
     }
     System.out.println(-1);
    }
}