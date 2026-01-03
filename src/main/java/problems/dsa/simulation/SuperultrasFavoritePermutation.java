package problems.dsa.simulation;

import java.util.*;
public class SuperultrasFavoritePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int num = sc.nextInt();
            if(num<5){
                System.out.println(-1);
                continue;
            }
            int maxOdd;
            int maxEven;
            if(num%2==1){
                maxOdd = num;
                maxEven = num-1;
            } else {
                maxOdd = num-1;
                maxEven = num;
            }
            for(int i=maxOdd; i>5; i-=2){
                System.out.print(i+" ");
            }
            System.out.print("1 3 5 4 2 ");
            for(int i=6; i<=maxEven; i+=2){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}