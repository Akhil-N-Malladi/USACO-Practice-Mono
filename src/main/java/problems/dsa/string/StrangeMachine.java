package problems.dsa.string;

import java.util.*;

public class StrangeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        char[] types = s.toCharArray();
        int[] a = new int[q];
        for (int i = 0; i < q; i++) a[i] = sc.nextInt();

        int A = 0, B = 0;
        for (char c : types) {
            if (c == 'A') A++;
            else B++;
        }

        for (int i = 0; i < q; i++) {
            int x = a[i];

            if (B == 0) {
                System.out.println(x);
                continue;
            }

            int ans = 0;

            while (x > 0) {
                for (char c : types) {
                    if (x == 0) break;
                    ans++;

                    if (c == 'A') x -= 1;
                    else x /= 2;
                }
            }

            System.out.println(ans);
        }
    }
}
