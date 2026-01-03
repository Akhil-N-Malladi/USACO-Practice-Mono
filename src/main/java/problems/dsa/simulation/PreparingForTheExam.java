package problems.dsa.simulation;

import java.util.*;
public class PreparingForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int questions = sc.nextInt();
            int lists = sc.nextInt();
            int known = sc.nextInt();
            int[] tests = new int[lists];
            int[] answers = new int[known];
            int[] res = new int[lists];
            boolean complete = false;
            int missing = questions;
            //Fill in arrays
            for(int i=0; i<lists; i++){
                tests[i] = sc.nextInt();
            }
            for(int i=0; i<known; i++){
                answers[i] = sc.nextInt();
            }
            //Pre answer
            if (known == questions){ //Monocarp knows all of the answers
                Arrays.fill(res, 1);
                complete = true;
                for(int i:tests) System.out.print(1);
            } else if(known<questions-1){ //Monocarp doesn't know enough answers to pass a single test
                complete = true;
                for(int i:tests) System.out.print(0);
                //System.out.println("b"+known+"\t"+questions+"\t"+lists);
            }
            if(complete){
                System.out.println();
                continue;
            }


            //Monocarp knows all but one answer
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] != i + 1) {
                    missing = i + 1;
                    break;
                }
            }

            for(int i=0; i<lists; i++){
                if(tests[i]==missing){
                    res[i] = 1;
                }
            }
            for(int i:res){
                System.out.print(i);
            }

            System.out.println();
            //System.out.println(known+"\t"+questions+"\t"+lists);
            //System.out.println("--------");

        }
    }
}