package problems.dsa.sorting;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,6,2,8,4,2,7,9,3};
        int temp;
        for(int x=0; x<array.length; x++){
            for(int y=0; y<array.length-1; y++)

                if(array[y]>array[y+1]){
                    temp = array[y];
                    array[y]=array[y+1];
                    array[y+1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}