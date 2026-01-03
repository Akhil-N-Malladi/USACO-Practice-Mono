package problems.dsa.string;

import java.io.*;
import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        String sTemp = kbr.nextLine();
        StringBuilder s = new StringBuilder(sTemp.length());
        char[] sChar = sTemp.toCharArray();
        for(char c:sChar){
            c=Character.toLowerCase(c);
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y')){
                s.append('.');
                s.append(c);
            }
        }
        System.out.println(s.toString());

    }
}