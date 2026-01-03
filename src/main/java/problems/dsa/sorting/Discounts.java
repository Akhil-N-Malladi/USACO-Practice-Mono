package problems.dsa.sorting;

import java.util.*;
public class Discounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        sc.nextLine();

        while(cases-->0){
            int numProducts = sc.nextInt();
            int numDiscounts = sc.nextInt();
            sc.nextLine();
            long[] products = new long[numProducts];
            long[] discounts = new long[numDiscounts];
            long cost = 0;
            int prodR = numProducts;
            int dCount = 0;
            for(int i=0; i<numProducts; i++){
                products[i] = sc.nextInt();
                cost+=products[i];
            }

            for(int i=0; i<numDiscounts; i++){
                discounts[i] = sc.nextInt();
            }

            Arrays.sort(products);
            Arrays.sort(discounts);
            //System.out.println(Arrays.toString(products)+"\t"+Arrays.toString(discounts));
            while(prodR>=0&&dCount<numDiscounts){
                long len = discounts[dCount];
                prodR-=len;
                //System.out.println(prodR+"\t"+dCount);
                if(prodR<0) break;
                cost -= products[prodR];
                dCount++;

            }
            //System.out.println(prodR+"\t"+dCount);
            System.out.println(cost);

        }

    }
}