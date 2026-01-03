package problems.dsa.simulation;

import java.util.*;
public class USACO2020DecemberContestBronzeProblem3StuckInARut {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int cows = kbr.nextInt();
        int[][] cow = new int[cows][2];
        String[] dir = new String[cows];
        int[] dist = new int[cows];
        int totalN = 0;
        int totalE = 0;
        ArrayList<String> field = new ArrayList<>();
        for(int i =0; i<cows; i++){
            dir[i] = kbr.next();
            if(dir[i].equals("N")){
                totalN++;
            }else{
                totalE++;
            }
            dist[i]=-1;
            for(int j=0; j<2; j++){
                cow[i][j]=kbr.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(cow)+Arrays.toString(dir));
        for(int i=0 ;i<cows; i++){
            for(int j=0; j<cows; j++){
                //Makes sure that the same cow isn't compared
                if(i==j){continue;}
                //Runs through all cases if both cows are in the same direction
                if(dir[i].equals(dir[j])){
                    if(dir[i].equals("E")){
                        if(cow[i][1]!=cow[j][1]){
                            dist[i] = -2;
                            break;
                        }else{
                            int distance = cow[i][1]-cow[j][1];
                            if(distance>0){
                                if(dist[i]!=-1){
                                    dist[i]=Math.min(distance,dist[i]);
                                }else{
                                    dist[i]=distance;
                                }
                            }else{
                                if(dist[j]!=-1) {
                                    dist[j] = Math.min(distance * -1,dist[j]);
                                }else{
                                    dist[j]=distance*-1;
                                }
                            }
                        }
                        break;
                    }else{
                        if(cow[i][0]!=cow[j][0]){
                            break;
                        }else{
                            int distance = cow[i][0]-cow[j][0];
                            if(distance>0){
                                if(dist[i]!=-1){
                                    dist[i]=Math.min(distance,dist[i]);
                                }else{
                                    dist[i]=distance;
                                }
                            }else{
                                if(dist[j]!=-1) {
                                    dist[j] = Math.min(distance * -1,dist[j]);
                                }else{
                                    dist[j]=distance*-1;
                                }
                            }
                        }
                        break;
                    }
                }
                int slope= (cow[i][1]-cow[j][1])/(cow[i][0]-cow[j][0]);
                int yCord;
                int xCord;
                if(dir[i].equals("E")){
                    yCord = cow[i][1];
                    xCord = cow[j][0];
                }else{
                    xCord = cow[i][0];
                    yCord = cow[j][1];
                }
                if (slope>0){
                    break;//No possible intersection
                }else{
                    if(slope<-1){ //The cow heading north will be stopped
                        if(dir[i].equals("N")){
                            if(dist[i]!=-1) {
                                dist[i] = Math.min(yCord - cow[i][1], dist[i]);
                            }else{
                                dist[i]=yCord - cow[i][1];
                            }
                        }
                        else{
                            if(dist[j]!=-1) {
                                dist[j] = Math.min(yCord - cow[j][1], dist[j]);
                            }else{
                                dist[j]=yCord - cow[j][1];
                            }
                        }
                    }else{//Cow heading east will be stopped
                        if(dir[i].equals("E")){
                            if(dist[i]!=-1) {
                                dist[i] = Math.min(xCord - cow[i][0], dist[i]);
                            }else{
                                dist[i]=xCord - cow[i][0];
                            }
                        }
                        else{
                            if(dist[j]!=-1) {
                                dist[j] = Math.min(xCord - cow[j][0], dist[j]);
                            }else{
                                dist[j]=xCord - cow[j][0];
                            }
                        }
                    }
                }
            }
        }
        for(int i=0; i<cows; i++){
            if(dist[i]!=-1) {
                System.out.println(dist[i]);
            }else{
                System.out.println("Infinity");
            }
        }
    }
}