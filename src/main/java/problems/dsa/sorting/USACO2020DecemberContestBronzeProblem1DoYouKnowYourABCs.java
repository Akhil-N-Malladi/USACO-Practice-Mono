package problems.dsa.sorting;

//Completed in 5 minutes and 24 seconds
//Passes all 10 testcases
//O(1) time complexity
import java.util.*;
public class USACO2020DecemberContestBronzeProblem1DoYouKnowYourABCs {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[] nums = new int[7];
        for(int i=0; i<7; i++){
            nums[i]=kbr.nextInt();
        }
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[1];
        int c;
        if(nums[2]==a+b){
            c=nums[3];
        }
        else{
            c=nums[2];
        }
        System.out.println(a+" "+b+" "+c);
    }
}