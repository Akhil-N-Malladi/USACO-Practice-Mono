package problems.dsa.string;

import java.util.*;
public class USACO2020USOpenContestBronzeProblem1SocialDistancingI {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int longest1Index = 0;
        int longest2Index = 0;
        int longest1 = 0;
        int longest2 = 0;
        int currLen = 0;
        int nums = kbr.nextInt();
        int shortestDist = 2100000000;
        String stalls = kbr.next();
        int[] barn = new int[nums];
        for(int i = 0; i< nums; i++){
            if(stalls.charAt(i)=='0'){
                currLen++;
            }
            else{
                if(currLen>longest2){
                    if(currLen>longest1){
                        longest2Index=longest1Index;
                        longest2=longest1;
                        longest1Index=i-currLen;
                        longest1=currLen;
                    }else{
                        longest2Index =i-currLen;
                        longest2=currLen;
                    }
                }
                currLen=0;
            }
            barn[i]=Integer.parseInt(""+stalls.charAt(i));
        }
        //System.out.println(longest1Index+"\t"+ longest1+"\t"+longest2Index+"\t"+longest2);
        currLen=0;
        barn[longest1Index+longest1/2]=1;
        barn[longest2Index+longest2/2]=1;
        for(int i=0; i<nums; i++){
            //System.out.println(shortestDist);
            if(barn[i]==0){
                currLen++;
            }
            else if(i!=0&&barn[i]==1){
                shortestDist=Math.min(shortestDist,currLen);
                currLen=0;
            }

        }
        System.out.println(Arrays.toString(barn));
        System.out.println(shortestDist+1);
    }
}