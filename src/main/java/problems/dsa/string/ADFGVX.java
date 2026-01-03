package problems.dsa.string;

import java.util.*;
public class ADFGVX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int cases = sc.nextInt();
        sc.nextLine();
        while(cases-->0){
            char[][] map = new char[6][6];
            for(int i=0; i<6; i++){
                String s = sc.nextLine();
                for(int j=0; j<6; j++){
                    map[i][j]=s.charAt(j);
                }
            }
            String keyword = sc.nextLine();
            char[] keyArr = keyword.toCharArray();
            int[] keyInt = new int[keyArr.length];

            for(int i=0; i<keyword.length(); i++) System.out.print(keyword.charAt(i) + "\t");
            System.out.println();

            //Sort keyArr
            for(int i = 0; i< keyArr.length; i++){
                keyInt[i] = keyArr[i];
            }
            Arrays.sort(keyInt);
            for(int i = 0; i< keyArr.length; i++){
                keyArr[i] = (char)keyInt[i];
            }


            keyArr = keyword.toCharArray();


            //Fill msgArr
            String msg = sc.nextLine();
            char[][] msgArr = new char[(int)Math.ceil(msg.length()/(keyArr.length+0.0))][keyArr.length];




            for(int i=0; i<msgArr.length; i++) {
                //properly finish the last row
                //FIX THE CONTENTS OF THE IF STATEMENT
                if (i == msgArr.length - 1 && msg.length() % keyword.length() != 0) {
                    int leftover = msg.length() - i * keyword.length();
                    String temp = keyword.substring(0, leftover);
                    char[] c = temp.toCharArray();
                    Arrays.sort(c);
                    for (int j = 0; j < leftover; j++) {
                        char currLetter = c[j];
                        msgArr[i][Arrays.binarySearch(keyInt, (int) currLetter)] = msg.charAt(msg.length() - j - 1);
                    }


                    break;
                }
                for (int j = 0; j < msgArr[i].length; j++) {
                    msgArr[i][j] = msg.charAt(i * msgArr[i].length + j);
                }
            }
            output(msgArr);
            char[][] msgSort = new char[msgArr.length][msgArr[0].length];


            //Switch the columns around
            for(int i=0; i<keyword.length(); i++){
                char c = keyword.charAt(i);


                int index = Arrays.binarySearch(keyInt,c);


                //System.out.println(c+"\t"+index);


                for(int j=0; j<msgSort.length; j++){
                    msgSort[j][i] = msgArr[j][index];
                }


            }




            //System.out.println(Arrays.deepToString(msgSort));


            //Convert to 2 letter pairs
            String temp = "";
            for(int i=0; i<msgSort.length; i++){
                for(int j=0; j<msgSort[i].length; j++){
                    if(msgSort[i][j]=='\u0000') break;
                    temp=temp+msgSort[i][j];
                }
            }
            String[] code = new String[temp.length()/2];
            for(int i=0; i<temp.length(); i+=2){
                code[i/2] = temp.substring(i,i+2);
            }
            //System.out.println(Arrays.toString(code)+"\t"+temp);




            String res = "";
            //Decode
            for(String s:code){
                res+=decode(s,map);
            }
            System.out.println(res);
        }
    }


    public static char decode(String s, char[][] arr){
        char a = s.charAt(0);
        char b = s.charAt(1);


        int index1=-1;
        int index2=-1;
        if(a=='A'){
            index1 = 0;
        } else if(a=='D') {
            index1 = 1;
        } else if(a=='F') {
            index1 = 2;
        } else if(a=='G') {
            index1 = 3;
        } else if(a=='V') {
            index1 = 4;
        } else if(a=='X') {
            index1 = 5;
        }


        if(b=='A'){
            index2 = 0;
        } else if(b=='D') {
            index2 = 1;
        } else if(b=='F') {
            index2 = 2;
        } else if(b=='G') {
            index2 = 3;
        } else if(b=='V') {
            index2 = 4;
        } else if(b=='X') {
            index2 = 5;
        }
        return arr[index1][index2];
    }

    public static void output(char[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}