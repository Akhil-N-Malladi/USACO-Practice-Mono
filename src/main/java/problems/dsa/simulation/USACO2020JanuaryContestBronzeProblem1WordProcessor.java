package problems.dsa.simulation;

//Solved in 10 minutes and 29 seconds

import java.util.*;
public class USACO2020JanuaryContestBronzeProblem1WordProcessor {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int words = kbr.nextInt();
        int maxLen = kbr.nextInt();
        kbr.nextLine();
        String line = kbr.nextLine();
        String[] word = line.split(" ");
        int lineLen = 0;
        String currLine = "";
       //System.out.println(Arrays.toString(word)+line);
        for(int i=0; i<words; i++){
            if(lineLen+word[i].length()>maxLen){
                System.out.println(currLine);
                currLine=word[i];
                lineLen=word[i].length();
            }
            else{
                if(i>0) {
                    currLine = currLine + " " + word[i];
                } else if (i==0) {
                    currLine=word[i];
                }
                lineLen+=word[i].length();
            }
        }
        System.out.println(currLine);
    }
}