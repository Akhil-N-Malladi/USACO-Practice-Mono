package problems.dsa.simulation;

//O(n*k
import java.util.*;
public class PrefixMinAndSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-->0){
            sc.nextLine();
            int len = sc.nextInt();
            int[] exist = new int[len];
            int[] arr = new int[len];
            int[] min  = new int[len];
            int[] max = new int[len];
            exist[0] = 1;
            exist[len-1] = 1;

            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
            }

            //Fill min
            min[0] = arr[0];
            for(int i=1; i<len; i++){
                min[i] = Math.min(min[i-1],arr[i]);
            }

            //Fill max
            max[len-1] = arr[len-1];
            for(int i=len-2; i>=0; i--){
                max[i] = Math.max(max[i+1],arr[i]);
            }

            //Go through each index
            for(int i=1; i<len-1; i++){
                int[] temp = {min[i],arr[i],max[i]};
                if(Math.min(Math.min(temp[0],temp[1]),temp[2])==temp[1]){  //Is the current index the smallest in the array
                    exist[i] = 1;
                } else if(Math.max(Math.max(temp[0],temp[1]),temp[2])==temp[1]){  //Is the current index the smallest in the array
                    exist[i] = 1;
                } else if(Math.max(Math.min(temp[0],temp[1]),temp[2])==temp[1]){
                    exist[i] = 1;
                } else if(Math.max(Math.max(temp[1],temp[2]),temp[0])==temp[1]){
                    exist[i] = 1;
                }
            }

            for(int i:exist){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}