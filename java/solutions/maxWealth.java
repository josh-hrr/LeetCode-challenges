/*
        read each row value
        sum each value of the row
        add it to an arrayList 
        repeat until rows.length = 0 
        ask which value in the arrayList is greater
        
      
      */

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] array) { 
        ArrayList<Integer> myList = new ArrayList<>(); 
        
        int maxValueFromSums = 0;  
        for(int i = 0; i<array.length; i++){  
            int sum = 0; 
            for(int j = 0; j<array[i].length; j++){ 
                sum = sum + array[i][j];
                System.out.println(array[i][j]); 
            } 
            myList.add(sum);
            System.out.println("sum is: " + sum);
            System.out.println();
        }  
        for(int i = 0; i<myList.size(); i++){ 
            System.out.println("sums found: " + myList.get(i));
        }  
            maxValueFromSums = Collections.max(myList); 
            System.out.println();
            System.out.println("max wealth is: " + maxValueFromSums);

            return maxValueFromSums;
    }
}
