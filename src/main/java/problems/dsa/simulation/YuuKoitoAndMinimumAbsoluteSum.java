package problems.dsa.simulation;

import java.io.*;
import java.util.*;
public class YuuKoitoAndMinimumAbsoluteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while(cases-->0){
            sc.nextLine();
            int len = sc.nextInt();
            int[] arr = new int[len];
            boolean fixLater = false;
            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == -1){
                    if(i==len-1){  //i = last number
                        if(fixLater){ //Adjust first number
                            arr[0] = 0;
                        }
                        arr[i] = arr[0]; //Adjust last number
                    } else if(i == 0){ //i = fist number
                        fixLater = true; //adjust later
                    } else { //adjust the number if it isn't first or last
                        arr[i] = 0;
                    }
                }
                if(i==len-1&&fixLater){
                    arr[0] = arr[i];
                }

            }
            System.out.println(Math.abs(arr[0] - arr[len-1]));
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}