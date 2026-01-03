package problems.dsa.sorting;

import java.util.*;
public class DestructionOfTheDandelionFields {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        while(cases-->0){
            int fields = sc.nextInt();
            ArrayList<Integer> odd = new ArrayList<>();
            int[] flowers = new int[fields];
            boolean on = false;
            long cut = 0;
            for(int i=0; i<fields; i++){
                int num = sc.nextInt();
                if(num%2==1) {
                    odd.add(num);
                }
                flowers[i] = num;
            }
            Collections.sort(odd);
            Arrays.sort(flowers);

            //Add all even numbers
            if(odd.size()>=1){
                for(int i:flowers){
                    if(i%2==0){
                        cut+=i;
                    }
                }
            }
            for(int i=odd.size()-1; i>=odd.size()/2; i--){
                cut+=odd.get(i);
            }

            System.out.println(cut);
                    //+"\t"+Arrays.toString(flowers)+"\t"+odd);
        }

    }
}