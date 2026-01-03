package problems.dsa.simulation;

import java.util.*;
public class TheStrictTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int len = sc.nextInt();
            sc.nextInt();
            sc.nextInt();
            int[] teachers = {sc.nextInt(), sc.nextInt()};
            if(teachers[0]>teachers[1]){        //Sort
                int temp = teachers[0];
                teachers[0] = teachers[1];
                teachers[1] = temp;
            }
            int pos = sc.nextInt();


            if(pos>teachers[0] && pos<teachers[1]){     //Case 1: David is in the middle
                System.out.println((int)(teachers[1]-Math.ceil((teachers[0]+teachers[1])/2.0)));
            } else if(pos<teachers[0]){     //Case 2: David is on left
                System.out.println(teachers[0]-1);
            } else {        //Case 3: David is on right
                System.out.println(len-teachers[1]);
            }
        }
    }
}