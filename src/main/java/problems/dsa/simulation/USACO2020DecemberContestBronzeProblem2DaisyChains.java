package problems.dsa.simulation;

//Completed in 21 minutes and 46 seconds
//O(N^3)    This is fine for now(N<=100)
//Passes all 10 testcases
import java.util.*;
public class USACO2020DecemberContestBronzeProblem2DaisyChains {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int flowers = kbr.nextInt();
        int[] petalCount = new int[flowers];
        int match = 0;
        for(int i=0; i<flowers; i++){
            petalCount[i] = kbr.nextInt();
        }
        int[] sum = new int[flowers];
        sum[0]=petalCount[0];
        for(int i=1; i<flowers; i++){
            sum[i]=sum[i-1]+petalCount[i];
        }
        double avg  = 0;
        for(int i=0; i<flowers; i++){
            for(int j=i; j<flowers; j++){
                //System.out.println(i+"\t"+j+"\t"+flowers);
                if(i==0) {
                    avg = sum[j]/(j+1.0);
                }
                else{
                    avg = (sum[j]-sum[i-1])/(j-i+1.0);
                }
                //System.out.println(i+"\t"+j+"\t"+avg);
                if(avg%1!=0){
                    continue;
                }
                else{
                    for(int x=i; x<=j; x++){
                        if(petalCount[x]+0.0==avg){
                            match++;
                            //System.out.println(i+"\t"+j);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(match);
    }
}