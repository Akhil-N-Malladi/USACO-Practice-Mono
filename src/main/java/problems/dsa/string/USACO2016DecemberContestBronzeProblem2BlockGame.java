package problems.dsa.string;

import java.util.*;
public class USACO2016DecemberContestBronzeProblem2BlockGame {
    public static void main(String[] args) {

        int[] alphabet = new int[26];
        Scanner kbr = new Scanner(System.in);
        int boards = kbr.nextInt();


        for(int i=0; i<boards; i++){
            String side1 = kbr.next();
            String side2 = kbr.next();
            int[] tempAlphabet = new int[26];
            int[] tempAlphabet2 = new int[26];
            for(int j=0; j<side1.length(); j++){
                tempAlphabet[(int)(side1.charAt(j))-97]++;
            }
            for(int j=0; j<side2.length(); j++){
                tempAlphabet2[(int)(side2.charAt(j))-97]++;
            }
            for(int j=0; j<26; j++){
                alphabet[j]+=Math.max(tempAlphabet[j],tempAlphabet2[j]);
                //System.out.println(tempAlphabet[j]+"\t\t"+tempAlphabet2[j]+"\t\t"+Arrays.toString(alphabet));
            }
            //System.out.println(Arrays.toString(tempAlphabet)+"\t"+Arrays.toString(tempAlphabet)+"\t"+Arrays.toString(tempAlphabet2));
        }
        for(int i=0; i<26; i++){
            System.out.println(alphabet[i]);
        }
    }
}
//Completed in 25 mins