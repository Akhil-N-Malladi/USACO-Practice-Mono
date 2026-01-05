import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check if there is input before reading
        if (sc.hasNextInt()) {
            int cases = sc.nextInt();

            while (cases-- > 0) {
                int len = sc.nextInt();
                int pos = sc.nextInt();
                long time = sc.nextLong();
                sc.nextLine(); // Consume the newline after the number
                String commandStr = sc.nextLine();
                char[] commands = commandStr.toCharArray();

                long res = 0;

                // --- PHASE 1: REACH 0 FOR THE FIRST TIME ---
                boolean reachedZeroFirstTime = false;

                // If we start at 0, do we count it?
                // Assuming standard logic: Yes, if time >= 0.
                if (pos == 0) {
                    reachedZeroFirstTime = true;
                    // Usually implies we increment res, but let's stick to your
                    // logic of "moving" first.
                    // If the problem implies "visits", starting at 0 is 1 visit.
                    res++;
                } else {
                    // Try to reach 0 using the instructions
                    for (int i = 0; i < len && time > 0; i++) {
                        if (commands[i] == 'L') pos--;
                        else pos++;

                        time--; // Decrement time for the move

                        if (pos == 0) {
                            res++; // We made a visit
                            reachedZeroFirstTime = true;
                            break; // Stop processing first phase
                        }
                    }
                }

                // If we ran out of time or instructions without reaching 0, we are done.
                if (!reachedZeroFirstTime || time == 0) {
                    System.out.println(res);
                    continue;
                }

                // --- PHASE 2: CALCULATE CYCLE (FROM START OF ARRAY) ---
                // You said: "start from the beginning of the instructions again"

                long cycleCost = 0;
                boolean foundCycle = false;

                // We restart simulation from pos=0 and index=0
                // NOTE: pos is already 0 here from Phase 1.

                for (int i = 0; i < len; i++) {
                    if (commands[i] == 'L') pos--;
                    else pos++;

                    cycleCost++; // One unit of time per step

                    if (pos == 0) {
                        foundCycle = true;
                        break;
                    }
                }

                // --- PHASE 3: CALCULATE REMAINING VISITS ---
                if (foundCycle) {
                    // We can repeat this cycle as many times as time permits
                    long additionalVisits = time / cycleCost;
                    res += additionalVisits;
                }

                System.out.println(res);
            }
        }
        sc.close();
    }
}