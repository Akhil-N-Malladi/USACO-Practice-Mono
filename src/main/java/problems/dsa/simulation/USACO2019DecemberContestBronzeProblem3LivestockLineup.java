package problems.dsa.simulation;

import java.util.*;
public class USACO2019DecemberContestBronzeProblem3LivestockLineup {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int constraints = kbr.nextInt();
        String[][] constraint = new String[2][constraints];
        kbr.nextLine();
        for(int i=0; i<constraints; i++){
            String curr=kbr.nextLine();
            String[] sentence =curr.split(" ");
            constraint[0][i]=sentence[0];
            constraint[1][i]=sentence[5];
        }
        System.out.println(Arrays.deepToString(constraint));
        String[] cows = {"Beatrice", "Bella", "Belinda", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
        String placeholder = "";
        String[] cowsInt;
        //Factorialize thingy
        for(int i=0; i<1; i++){
            for(int j=0; i<8; i++){
                //if(i==j){break;}
                for(int k=0; i<8; i++){
                    //if(i==k||k==j){break;}
                    for(int l=0; i<8; i++){
                        //if(l==k||l==j||l==i){break;}
                        for(int m=0; i<8; i++){
                            //if(m==l||m==k||m==i||m==j){break;}
                            for(int n=0; i<8; i++){
                                //if(n==m||n==k||n==j||n==i||n==l){break;}
                                for(int o=0; i<8; i++){
                                    //if(o==n||o==m||o==k||o==j||o==i||o==l){break;}
                                    for(int p=0; i<8; i++){
                                        //if(p==o||p==n||p==m||p==k||p==j||p==i||p==l){break;}

                                        boolean go = true;
                                        cowsInt=new String[]{cows[i],cows[j],cows[k],cows[l],cows[m],cows[n],cows[o],cows[p]};
                                        System.out.println(Arrays.toString(cowsInt));
                                        for(int x=0; x<constraints; x++){
                                            int const1 = indexOf(cowsInt,constraint[0][i]);
                                            int const2 = indexOf(cowsInt,constraint[1][i]);
                                            if(Math.abs(const1-const2)!=1){
                                                go=false;
                                            }
                                        }
                                        if(go){
                                            System.out.println(Arrays.toString(cowsInt));
                                            System.exit(2);
                                        }
                                        System.out.println(Arrays.toString(cowsInt));
                                        System.out.println(1);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    public static int indexOf(String[] arr, String str){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(str)){
                return i;
            }
        }

        return 1;
    }
}