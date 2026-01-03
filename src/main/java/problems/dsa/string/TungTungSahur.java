package problems.dsa.string;

import java.util.*;
public class TungTungSahur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        while(cases-- > 0){
            char[] p = sc.nextLine().toCharArray();
            char[] s = sc.nextLine().toCharArray();
            int pLeft = 0;
            int pRight = 0;
            int sLeft = 0;
            int sRight = 0;
            boolean yes = true;
            //Use a sliding window technique
            while(pRight <p.length){
                char c = p[pLeft];
                while(pRight < p.length && p[pRight]==c){
                    pRight++;
                }
                while(sRight < s.length && s[sRight]==c){
                    sRight++;
                }
                if(sRight - sLeft < pRight - pLeft || sRight-sLeft>(pRight-pLeft)*2){
                    //Doesnt work
                    yes = false;
                    break;
                }
                pLeft = pRight;
                sLeft = sRight;
            }
            if(sRight<s.length){
                yes = false;
            }
            if(yes){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}