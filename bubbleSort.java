
package algo_practice;

import java.util.Scanner;

public class bubbleSort {
    
    public void sorting() {
        
    int n, c, d, swap;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter number of elements: ");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers: ");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
   
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) 
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers: ");
 
    for (c = 0; c < n; c++)
      System.out.print(" " + array[c]);  
        System.out.println();
    }    
    
}

