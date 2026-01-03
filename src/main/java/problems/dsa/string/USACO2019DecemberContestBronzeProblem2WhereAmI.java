package problems.dsa.string;

//Completed in 13 mins and 17 seconds

import java.util.*;
public class USACO2019DecemberContestBronzeProblem2WhereAmI {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int stringLen = kbr.nextInt();
        String mailboxes = kbr.next();
        boolean cont = true;
        for(int len=1; len<=stringLen; len++){
            cont=true;
            for(int start=0; start<stringLen-len+1; start++) {
                for (int i = start+1; i <stringLen-len+1; i++) {
                    if(mailboxes.substring(start,start+len).equals(mailboxes.substring(i,i+len))){
                        cont=false;
                        //System.out.println("false");
                        break;
                    }
                    //System.out.println(len+"\t\t"+start+"\t\t"+i);
                }
                if(!cont){break;}
            }
            if(cont){
                System.out.println(len);
                break;
            }
        }


    }
}