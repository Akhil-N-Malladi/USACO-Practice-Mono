package problems.dsa.math;

import java.util.*;
public class YetAnotherArrayProblem {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int cases = kbr.nextInt();
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};

        //Run through each case
        for(int a=0; a<cases; a++){
            int len = kbr.nextInt();
            long[] nums = new long[len];
            for(int i=0; i<nums.length; i++) nums[i] = kbr.nextLong();
            int smallX = 53;
//            go through each number

            for(long num:nums){
                if(num%2==1) {
                    smallX = 2;
                    break;
                }
                for(int prime:primes){
                    if(num%prime!=0){
                        smallX = Math.min(smallX,prime);
                        break;
                    }
                }
            }
            System.out.println(smallX);
        }
    }

}