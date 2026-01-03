package problems.dsa.sorting;

//Completed in 22 mins 13 seconds
import java.util.*;

public class USACO2019FebruaryContestBronzeProblem1SleepyCowHerding {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int[] positions = {kbr.nextInt(),kbr.nextInt(),kbr.nextInt()};
        kbr.close();
        int furthest;
        int min=0;
        int max=0;
        Arrays.sort(positions);
        int[] positions2 ={positions[0],positions[1],positions[2]};
        while(!(Math.abs(positions[1]-positions[0])==1&&Math.abs(positions[2]-positions[1])==1))
        {
            if((positions[1]-positions[0]>positions[2]-positions[1])) {
                //System.out.println("1");
                furthest = 0;
                if(positions[1]+1!=positions[2]) {
                    positions[furthest] = positions[1] + 1;
                    //System.out.println("1a");
                }
                else {
                    positions[furthest] = positions[1] - 1;
                    //System.out.println("1b");
                }
                Arrays.sort(positions);
                min++;
            }
            else {
                //System.out.println("2");
                furthest = 2;
                if(positions[1]-1!=positions[0]) {
                    positions[furthest] = positions[1] - 1;
                    //System.out.println("2a");
                }
                else {
                    //System.out.println("2b");
                    positions[furthest] = positions[1] + 1;
                }
            }
            //System.out.println(Arrays.toString(positions));
        }

        //System.out.println("________________________________________");


        while(!(positions2[1]-positions2[0]==1&&positions2[2]-positions2[1]==1)) {
            if ((positions2[1] - positions2[0] > positions2[2] - positions2[1])) {
                //System.out.println("1");
                furthest = 2;
                if (positions2[1] - 1 != positions2[2]) {
                    positions2[furthest] = positions2[1] - 1;
                    //System.out.println("1a");
                } else {
                    positions2[furthest] = positions2[1] + 1;
                    //System.out.println("1b");
                }
            } else {
                //System.out.println("2");
                furthest = 0;
                if (positions2[1] + 1 != positions2[0]) {
                    positions2[furthest] = positions2[1] + 1;
                    //System.out.println("2a");
                    //System.out.println(Arrays.toString(positions2));
                } else {
                    //System.out.println("2b");
                    positions2[furthest] = positions2[1] - 1;
                }
            }

            Arrays.sort(positions2);
            //System.out.println(Arrays.toString(positions2));
            max++;
        }
        System.out.println(min+"\n"+max);
    }

}