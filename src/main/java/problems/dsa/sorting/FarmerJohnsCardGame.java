package problems.dsa.sorting;

import java.util.*;
    public class FarmerJohnsCardGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cases = sc.nextInt();
            while(cases-- > 0){
                sc.nextLine();
                int cows = sc.nextInt();
                int cards = sc.nextInt();
                int[][] hands = new int[cows][cards];
                int[] order = new int[cows];
                boolean invalid = false;
                //Fill
                for(int i=0; i<cows; i++){
                    for(int j=0; j<cards; j++){
                        hands[i][j] = sc.nextInt();
                    }
                }

                //Sort
                for(int i=0; i<cows; i++){
                    Arrays.sort(hands[i]);
                }

                //Validate
                for(int[] i:hands){
                    int prev = i[0];
                    for(int j=1; j<cards; j++){
                        int curr = i[j];
                        if(curr-prev!=cows){
                            invalid = true;
                            break;
                        }
                        prev = curr;
                    }
                    if(invalid){
                        break;
                    }
                }
                if(invalid){
                    System.out.println(-1);
                    continue;
                }

                //Get order
                for(int i=0; i<cows; i++){
                    int[] temp = hands[i];
                    for(int j:temp){
                        if(j<cows){
                            order[j] = i+1;
                        }
                    }
                }

                for(int i:order){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }