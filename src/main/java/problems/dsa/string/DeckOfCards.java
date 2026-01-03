package problems.dsa.string;

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int a = 0, b = 0, c = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '0') a++;
                else if (ch == '1') b++;
                else if (ch == '2') c++;
            }

            char[] ans = new char[n];
            Arrays.fill(ans, '+');

            for (int i = 0; i < n; i++) {
                if (i < a + c || i >= n - b - c) ans[i] = '?';
                if (i < a || i >= n - b || k == n) ans[i] = '-';
            }

            System.out.println(new String(ans));
        }
    }
}
