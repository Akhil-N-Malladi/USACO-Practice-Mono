package problems.dsa.simulation;

import java.util.*;
public class CherryBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-->0){

            sc.nextLine();
            int len = sc.nextInt();
            int max = sc.nextInt();
            int[] a = new int[len];
            int[] b = new int[len];
            int sum = -1;
            int smallest = Integer.MAX_VALUE;
            int largest = -1;
            boolean cont = false;

            for(int i=0; i<len; i++){
                a[i] = sc.nextInt();
                smallest = Math.min(smallest, a[i]);
                largest = Math.max(largest, a[i]);
            }

            for(int i=0; i<len; i++){
                b[i] = sc.nextInt();
                if(b[i]!=-1){
                    sum = a[i]+b[i];
                }
            }

            for(int i=0; i<len; i++){
                if(b[i]!=-1){
                    if(a[i]+b[i]!=sum){
                        cont = true;
                        break;
                    }
                } else { //b[i] equals -1
                    if(a[i]>=max || sum-a[i]>=max || (a[i]>sum && sum!=-1)){
                        cont = true;
                        break;
                    }
                }
            }

            //System.out.print(sum+"\t");
            if(cont){
                System.out.println(0);
                continue;
            }

            if(sum==-1){
                System.out.println((smallest+max)-largest+1);
                continue;
            }

            System.out.println(1);
        }
    }
}