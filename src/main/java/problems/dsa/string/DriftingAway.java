package problems.dsa.string;

import java.util.*;
public class DriftingAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        while(cases-- > 0){
            char[] c = sc.nextLine().toCharArray();
            int[] time = new int[c.length];
            boolean skip = false;
            if(c.length == 1){
                System.out.println(1);
                skip = true;
            }
            if(skip) continue;

            for(int i=0; i<c.length-1; i++){
                if((c[i]=='>' && c[i+1]=='<') || (c[i] == '*' && c[i+1] == '<') || (c[i]== '>' && c[i+1] == '*') || (c[i] == '*' && c[i+1] == '*')){
                    skip = true;
                    System.out.println(-1);
                    break;
                }
            }
            if(skip) continue;

            for(int i=0; i<c.length; i++){
                if(c[i]=='>'){
                    break;
                } else {
                    time[i] = i+1;
                }
            }
            for(int i=c.length-1; i>=0; i--){
                if(c[i]=='<'){
                    break;
                } else {
                    if(time[i]==0) time[i] = c.length-i;
                    else if(c[i] == '*') time[i] = Math.max(time[i],c.length-i);
                    else time[i] = Math.min(time[i],c.length-i);
                }
            }
            int max = -1;
            for(int i=0; i<c.length; i++){
                max = Math.max(time[i],max);
            }
            System.out.println(max);
        }
    }
}