package problems.dsa.math;

import java.util.*;
public class CountGoodNumbers {
    static int[] primes = {2,3,5,7,6,10,14,15,21,35,30,70,105,210};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            //a: Use PIE (multiples of(2,3,5,7)-multiples of(6,10,14,15,21,35)+multiples of(30,70,105)-multiples of(210)
            //a(0,r            //a: Use PIE (multiples of(2,3,5,7)-multiples of(6,10,14,15,21,35)+multiples of(30,70,105)-multiples of(210))-a(0,l-1) = a(l,r)
            long l = sc.nextLong();
            long r = sc.nextLong();
            System.out.println(good(r) - good(l));
        }
    }
    public static long good(long a){
        long total = 0;
        for(int i=0; i<4; i++){
            total+=a/primes[i];
        }
        for(int i=4; i<10; i++){
            total-=a/primes[i];
        }
        for(int i=10; i<13; i++){
            total+=a/primes[i];
        }
        total -= a/primes[13];
        return a-total;
    }
}