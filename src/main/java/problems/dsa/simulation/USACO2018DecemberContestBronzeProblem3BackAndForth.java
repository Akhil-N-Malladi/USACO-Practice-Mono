package problems.dsa.simulation;

//The value of farm1Vol is being carried over through different scenarios(need to reset the value of it to the parent scenario

import java.util.*;
public class USACO2018DecemberContestBronzeProblem3BackAndForth {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[] farm1 = new int[11];
        int[] farm2 = new int[11];
        int farm1Vol = 1000;
        int farm2Vol = 1000;
        int unique = 0;
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            farm1[i] = kbr.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            farm2[i] = kbr.nextInt();
        }
        //Tuesday
        for (int i = 0; i < 10; i++) {
            farm1Vol = 1000;
            farm2Vol = 1000;
            int[] farm1Copy = new int[11];
            int[] farm2Copy = new int[11];
            //Copies over arrays
            copyArray(farm1, farm1Copy);
            copyArray(farm2, farm2Copy);
            //Shifts over milk
            farm1Vol -= farm1Copy[i];
            farm2Vol += farm1Copy[i];

            //Moves buckets around and slides zeros to the end;
            farm2Copy[10] = farm1Copy[i];
            farm1Copy[i] = farm1Copy[9];
            farm1Copy[9] = 0;

            //Wednesday
            for (int j = 0; j < 11; j++) {
                int[] farm1Copy2 = new int[11];
                int[] farm2Copy2 = new int[11];
                //Copies over arrays and volumes
                copyArray(farm1Copy, farm1Copy2);
                copyArray(farm2Copy, farm2Copy2);
                int farm1Vol2=farm1Vol;

                farm1Copy2[9] = (int)farm2Copy2[j];
                //System.out.print(farm1Vol2+"\t");
                farm1Vol2 += farm1Copy2[9];
                //System.out.println(farm1Copy[9]+"\t"+farm2Copy2[j]+"\t"+farm1Vol2);
                farm2Copy2[j] = farm2Copy2[10];
                farm2Copy2[10] = 0;

                //Thursday
                for (int k = 0; k < 10; k++) {

                    int[] farm1Copy3 = new int[11];
                    int[] farm2Copy3 = new int[11];

                    //Copies over arrays and volumes
                    copyArray(farm1Copy2, farm1Copy3);
                    copyArray(farm2Copy2, farm2Copy3);
                    int farm1Vol3=farm1Vol2;

                    farm2Copy3[10] = farm1Copy3[k];
                    farm1Copy3[k] = farm1Copy3[9];
                    farm1Copy3[9] = 0;

                    farm1Vol3 -= farm2Copy3[10];
                    //Friday
                    for (int l = 0; l < 11; l++) {
                        int[] farm1Copy4 = new int[11];
                        int[] farm2Copy4 = new int[11];

                        //Copies over arrays and volumes
                        copyArray(farm1Copy3, farm1Copy4);
                        copyArray(farm2Copy3, farm2Copy4);
                        int farm1Vol4=farm1Vol3;


                        farm1Copy4[9] = farm2Copy4[j];
                        farm2Copy4[j] = farm2Copy4[10];
                        farm2Copy4[10] = 0;
                        farm1Vol4 += farm1Copy4[9];
                        if (!results.contains(farm1Vol4)) {
                            results.add(farm1Vol4);
                            unique++;
                        }
                        System.out.println(Arrays.toString(farm1Copy4));
                    }
                }
                /*if(!results.contains(farm1Vol2)){
                    results.add(farm1Vol2);
                    unique++;
                }*/
            }

        }
        System.out.println(unique);
        System.out.println(results);
    }
    public static void copyArray(int[] arr1, int[] arr2){
        for(int j=0; j<11; j++){
            arr2[j]=arr1[j];
        }
    }
}
