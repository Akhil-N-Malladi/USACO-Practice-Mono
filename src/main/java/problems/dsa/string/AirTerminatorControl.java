package problems.dsa.string;

import java.util.*;
public class AirTerminatorControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases  = sc.nextInt();
        sc.nextLine();

        while(cases-->0){
            boolean friendly = false;
            int longestCont = 1;
            int entry = 0;
            int currCont = 1;
            int threat = 0;
            //threat = 0 --> None
            //threat = 1 --> Low
            //threat = 2 --> Medium
            //threat = 3 --> High

            if(sc.next().equals("TRUE")){
                friendly = true;
            }

            int numPoints = sc.nextInt();

            //Adjust threat level based on numPoints
            if(numPoints>=36){
                threat = Math.max(3,threat);
            } else if(numPoints>=24){
                threat = Math.max(2,threat);
            } else if(numPoints>=12){
                threat = Math.max(1,threat);
            }

            sc.nextLine();
            int[] points = new int[numPoints];
            points[0] = 0;
            int start = toMins(sc.nextLine());
            for(int i=1; i<numPoints; i++){
                String s = sc.nextLine();
                points[i] = toMins(s)-start;
            }

            if(friendly) {
                System.out.println("NONE");
                continue;
            }
            for(int i=1; i<numPoints; i++){
                if(points[i-1]+15==points[i]){
                    currCont++;
                } else {
                    longestCont = Math.max(currCont,longestCont);
                    currCont = 1;
                    entry++;
                }
            }
           longestCont = Math.max(currCont,longestCont);

            if(longestCont>=12){
                threat = Math.max(threat, 3);
            } else if(longestCont>=8){
                threat = Math.max(threat,2);
            } else if(longestCont>=4){
                threat = Math.max(threat,1);
            }

            if(entry>=8){
                threat = Math.max(3,threat);
            } else if(entry>=4){
                threat = Math.max(threat,2);
            }

            if(threat==0){
                System.out.println("NONE");
            } else if(threat==1){
                System.out.println("LOW");
            } else if(threat==2){
                System.out.println("MEDIUM");
            } else if(threat==3){
                System.out.println("HIGH");
            }
        }
    }
    public static int toMins(String s){
        int hours = Integer.parseInt(s.substring(0,s.indexOf(':')));
        int mins = Integer.parseInt(s.substring(s.indexOf(':')+1));

        return hours*60+mins;
    }
}