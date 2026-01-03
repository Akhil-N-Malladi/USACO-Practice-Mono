package problems.dsa.string;

//Finished in 17 minutes and 2 seconds
//O(1) time complexity
import java.util.*;
public class USACO2019USOpenContestBronzeProblem1BucketBrigade {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        String[][] field = new String[10][10];

        int barnX=-1;
        int barnY=-1;

        int rockX = -1;
        int rockY=-1;

        int lakeX = -1;
        int lakeY = -1;

       for(int i=0; i<10; i++){
           String next = kbr.nextLine();
           for(int j=0; j<10; j++){
               field[i][j]=""+next.charAt(j);
               if(next.charAt(j)=='B'){
                    barnX=i;
                    barnY=j;
               }
               else if(next.charAt(j)=='L'){
                   lakeX=i;
                   lakeY=j;
               }
               else if(next.charAt(j)=='R'){
                   rockX=i;
                   rockY=j;
               }
           }
       }

       //Same column
       if(barnX==lakeX&&barnX==rockX){
           //barn is below
           if (barnY>lakeY){
               //rock is between
               if(rockY<barnY&&rockY>lakeY){
                   System.out.println(barnY-lakeY+1);
               }
               //rock is not between
               else{
                   System.out.println(barnY-lakeY-1);
               }
           }
           //barn is above
           else{
               //rock is between
               if(rockY<lakeY&&rockY>barnY){
                   System.out.println(lakeY-barnY+1);
               }
               //rock is not between
               else{
                   System.out.println(lakeY-barnY-1);
               }
           }
       }
       //They are on the same row
       else if(barnY==lakeY&&barnY==rockY){
           //barn is further right
            if (barnX>lakeX){
                //rock is between
                if(rockX<barnX&&rockX>lakeX){
                    System.out.println(barnX-lakeX+1);
                }
                //rock is not between
                else{
                    System.out.println(barnX-lakeX-1);
                }
            }
            //barn is further left
            else{
                //rock is between
                if(rockX<lakeX&&rockX>barnX){
                    System.out.println(lakeX-barnX+1);
                }
                //rock is not between
                else{
                    System.out.println(lakeX-barnX-1);
                }
            }
        }
       //They are not on same row or column
       else{
           System.out.println(Math.abs(lakeX-barnX)+Math.abs(lakeY-barnY)-1);
       }
    }
}