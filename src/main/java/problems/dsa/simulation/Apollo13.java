package problems.dsa.simulation;

import java.util.*;
public class Apollo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        //sc.nextLine();
        while (cases-- > 0) {
            for (int i = 0; i < 3; i++) {
                double num = sc.nextDouble();
                num-=180;
                if(num<0){
                    num+=360;
                }
                System.out.printf("%.2f",num);
                if(i!=2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}