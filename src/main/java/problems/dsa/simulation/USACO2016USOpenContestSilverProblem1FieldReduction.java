package problems.dsa.simulation;

import java.util.*;
    public class USACO2016USOpenContestSilverProblem1FieldReduction {
//        public static void main(String[] args) {
//            Scanner kbr = new Scanner(System.in);
//            int cows = kbr.nextInt();
//            double[][] coords = new double[cows][3];
//            int[] oneX = {-1, 0};
//            int[] twoX = {-1, 0};
//            int[] threeX = {-1, 0};
//            int[] oneY = {-1, 0};
//            int[] twoY = {-1, 0};
//            int[] threeY = {-1, 0};
//            double lowx = 40001;
//            double lowy = 400001;
//            double highx = -1;
//            double highy = -1;
//            int area;
//            double[][] center = new double[1][2];
//            for (int x = 0; x < cows; x++) {
//                for (int y = 0; y < 2; y++) {
//                    coords[x][y] = kbr.nextInt();
//                    center[0][0] += coords[x][0];
//                    center[0][1] += coords[x][1];
//                }
//
//            }
//
//            for (int x = 0; x < cows; x++) {
//                coords[x][2] = Math.pow(center[0][0] / cows - coords[x][0], 2) + Math.pow(center[0][1] / cows - coords[x][1], 2);
//                if (oneX[0] == -1) {
//                    oneX[0] = x;
//                    oneX[1]=Math.abs(center[0][0] - coords[x][0];
//                } else if (twoX[0] == -1) {
//                    twoX[0] = x;
//                } else if (threeX[0] == -1) {
//                    threeX[0] = x;
//                } else {
//                    if (Math.abs(center[0][0] - coords[x][0]) > Math.abs(center[0][0] - coords[threeX[0]][0])) {
//                        if (Math.abs(center[0][0] - coords[x][0]) > Math.abs(center[0][0] - coords[twoX[0]][0])) {
//                            if (Math.abs(center[0][0] - coords[x][0]) > Math.abs(center[0][0] - coords[oneX[0]][0])) {
//                                threeX = twoX;
//                                twoX = oneX;
//                                oneX[0] = x;
//                            } else {
//                                threeX = twoX;
//                                twoX[0] = x;
//                            }
//                        } else {
//                            threeX[0] = x;
//                        }
//                    } else {
//                    }
//                }
//
//
//                if (oneY[0] == -1) {
//                    oneY[0] = x;
//                } else if (twoY[0] == -1) {
//                    twoY[0] = x;
//                } else if (threeY[0] == -1) {
//                    threeY[0] = x;
//                } else {
//                    if (Math.abs(center[0][1] - coords[x][1]) > Math.abs(center[0][1] - coords[threeY[0]][1])) {
//                        if (Math.abs(center[0][1] - coords[x][1]) > Math.abs(center[0][1] - coords[twoY[0]][1])) {
//                            if (Math.abs(center[0][1] - coords[x][1]) > Math.abs(center[0][1] - coords[oneY[0]][1])) {
//                                threeY = twoY;
//                                twoY = oneY;
//                                oneY[0] = x;
//                            } else {
//                                threeY = twoY;
//                                twoY[0] = x;
//                            }
//                        } else {
//                            threeY[0] = x;
//                        }
//                    } else {
//                    }
//                }
//
//            }
//
//            /*for(int x=0; x<cows; x++) {
//                if(x==oneX||x==two||x== threeX) {
//                }
//                else {
//                    lowx = Math.min(lowx, coords[x][0]);
//                    lowy = Math.min(lowy, coords[x][1]);
//                    highx = Math.max(highx, coords[x][0]);
//                    highy = Math.max(highy, coords[x][1]);
//                }*/
//            //System.out.println(lowx+"\t\t"+lowy+"\t\t"+highx+"\t\t"+highy);
//
//            //area=(int)((int)(highx-lowx)*(int)(highy-lowy));
//            //System.out.println(Arrays.deepToString(coords)+"\n\n"+center[0][0]/7+"\t\t"+center[0][1]/7+"\t\t"+one+"\t\t"+two+"\t\t"+threeX);
//            //System.out.println(area);
//        }
    }
