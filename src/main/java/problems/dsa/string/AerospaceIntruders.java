package problems.dsa.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AerospaceIntruders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        ArrayList<String> res = new ArrayList<>();
        
        while(cases-->0){
            int numShips = input.nextInt();
            input.nextLine();
            String[] names = new String[numShips];
            char[] type = new char[numShips];
            int[][] coords=  new int[numShips][2];

            //Input handling
            for(int i=0; i<numShips; i++){
                String current = input.nextLine();


                int colon = current.indexOf(':');
                int comma = current.indexOf(',');
                int underscore = current.indexOf('_');

                //System.out.println(colon+"\t"+comma+"\t"+underscore+"\t"+current+"\tend");
                names[i] = current.substring(0,underscore);
                type[i] = current.charAt(underscore+1);
                coords[i][0] = Integer.parseInt(current.substring(colon+1,comma));
                coords[i][1] = Integer.parseInt(current.substring(comma+1));
            }
            //System.out.println(Arrays.toString(names)+"\n"+Arrays.toString(type)+"\n"+Arrays.deepToString(coords));

            //Solve the problem
            for(int i=0; i<numShips; i++) {

                int closest = -1;
                //properly initialize closest

                for (int j = 0; j < numShips; j++) {
                    if (names[j] == null) continue;
                    closest = j;
                    break;
                }

                //find closest
                for (int j = 0; j < numShips; j++) {
                    if (names[j] == null) continue;

                    if (coords[j][0] < coords[closest][0]) {
                        closest = j;
                    } else if (coords[j][0] == coords[closest][0]) {
                        if (coords[j][1] > coords[closest][1]) {
                            closest = j;
                        }
                    }
                }
                res.add("Destroyed Ship: " + names[closest] + " xLoc: " + coords[closest][0]);
                names[closest] = null;

                //simulate movement
                for (int j = 0; j < numShips; j++) {
                    if (names[j] == null) continue;
                    if (type[j] == 'A') {
                        coords[j][0] -= 10;
                    } else if (type[j] == 'B') {
                        coords[j][0] -= 20;
                    } else {
                        coords[j][0] -= 30;
                    }
                }
            }
        }
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }
}