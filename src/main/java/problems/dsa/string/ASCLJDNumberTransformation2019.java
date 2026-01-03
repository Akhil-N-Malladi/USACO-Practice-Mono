package problems.dsa.string;

import java.io.*;
import java.util.*;
public class ASCLJDNumberTransformation2019 {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        String number = kbr.next();
        int[] digits = new int[number.length()];
        int pos = digits.length-kbr.nextInt();
        int transition = kbr.nextInt();

        for (int x = 0; x < number.length(); x++)
            digits[x] = Integer.parseInt(number.substring(x, x + 1));
        if (digits[pos] < 5) {
            digits[pos] = digits[pos] + transition % 10;
            System.out.println("a");
        } else {
            digits[pos] = Integer.parseInt((Math.abs(digits[pos] - transition) + "").substring(0,1));

        }
        for (int x = pos + 1; x < digits.length; x++)
            digits[x] = 0;
        for (int x = 0; x < digits.length; x++)
        {
            System.out.print(digits[x]);
        }

    }
}
