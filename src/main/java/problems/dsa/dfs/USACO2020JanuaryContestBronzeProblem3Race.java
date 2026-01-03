package problems.dsa.dfs;

import java.util.*;
public class USACO2020JanuaryContestBronzeProblem3Race {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int len = kbr.nextInt();
        int numMax = kbr.nextInt();
        int[] maxSpeed = new int[numMax];
        for(int i = 0; i<numMax; i++){
            maxSpeed[i]=kbr.nextInt();
        }
        //System.out.println(toBinary(5));

        for(int i = 0; i<numMax; i++){
            int max = maxSpeed[i];
            int dist = 0;
            int time = 0;
            int speed = 0;
            ArrayList<Integer> speeds = new ArrayList<Integer>();
            while(dist<len){
                if(dist+speed>=len){
                    if(speed+1>=max){
                        if(speed>=max){
                            if(speed-1>=max){
                                //Backtrack
                                int decrease = speed-max;
                                //convert decrease to binary
                                String binary  = toBinary(decrease);
                                for(int j=0; j<binary.length(); j++){
                                    int length = speeds.size();
                                    speeds.set(/*index*/length - j,/*Get Value*/speeds.get(length - j) -/*Subtract*/Integer.parseInt(binary.substring(binary.length() - j - 1, binary.length() - j)));
                                }
                                break;
                            }
                            else{
                                //Decrease speed by 1
                                speed--;
                            }
                        }
                        else {
                            //Maintain curr speed
                        }
                    }
                    else {
                        speed++;
                        //Increase speed by 1
                    }
                }
                else{
                    speed++;
                }
                speeds.add(speed);
                dist+=speed;
            }
            //Calculate time
            time=speeds.size();
            System.out.println(time+"\t"+speeds);
            System.out.println("--------------------------");
        }

    }
    public static String toBinary(int num){
        String binary="";
        while(true) {
            binary=num%2+binary;
            num/=2;
            if(num==0){
                break;
            }
        }
        return binary;
    }
}