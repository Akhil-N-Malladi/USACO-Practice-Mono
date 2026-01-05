import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-- > 0){
            sc.nextLine();
            int n = sc.nextInt();
            sc.nextInt();
            int[] a = new int[n];
            int b;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            b = sc.nextInt();

            //Check if it is already non-decreasing
            boolean yes = true;
            for(int i=1; i<n; i++){
                if(a[i-1]>a[i]){
                    yes = false;
                    break;
                }
            }
            if(yes){
                System.out.println("YES");
                continue;
            }
            yes = true;
            for(int i=0; i<n; i++){
                if(i==0){
                    a[i] = Math.min(a[i],b-a[i]);
                } else {
                    if(a[i]<b-a[i]){
                        if(a[i]>=a[i-1]) {
                            continue;
                        } else {
                            if(b-a[i]<a[i-1]){
                                System.out.println("NO");
                                yes = false;
                                break;
                            }
                        }
                    } else {
                        a[i] = b-a[i];
                    }
                }
            }
            yes = true;
            for(int i=1; i<n; i++){
                if(a[i-1]>a[i]){
                    yes = false;
                    break;
                }
            }
            if(yes){
                System.out.println("YES");
                continue;
            } else {
                System.out.println("NO");
            }
        }
    }
}