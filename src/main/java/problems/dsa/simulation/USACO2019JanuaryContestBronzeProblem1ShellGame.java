package problems.dsa.simulation;

import java.util.*;
public class USACO2019JanuaryContestBronzeProblem1ShellGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int swaps = sc.nextInt();
        int[] shells = {1,2,3};
        int[][] instructions = new int[swaps][2];
        int[] guess = new int[swaps];
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(1,0);
        count.put(2,0);
        count.put(3,0);
        for(int i=0; i<swaps; i++){
            instructions[i][0] = sc.nextInt();
            instructions[i][1] = sc.nextInt();
            guess[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(guess)+"\n"+count);
        for(int i=0; i<3; i++){
            int temp = shells[instructions[i][0]-1];
            shells[instructions[i][0]-1] = shells[instructions[i][1]-1];
            shells[instructions[i][1]-1] = temp;
            count.put(guess[i], count.get(guess[i])+1);
        }

        int max = 0;
        for(int i=0; i<3; i++){
            max = Math.max(count.get(i),max);
        }
        System.out.println(max);
    }
}