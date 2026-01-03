package problems.dsa.simulation;

import java.util.*;

public class TheCunningSellerEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute costs for 3^x deals
        long[] cost = new long[21];
        long c = 3;
        long cnt = 1;
        for (int i = 0; i < 21; i++) {
            cost[i] = c;
            c = 3 * c + cnt;
            cnt *= 3;
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long minCost = 0;
            int pos = 0;

            while (n > 0) {
                long digit = n % 3;
                minCost += digit * cost[pos];
                n /= 3;
                pos++;
            }

            System.out.println(minCost);
        }
    }
}
