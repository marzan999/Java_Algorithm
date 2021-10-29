package algo_practice;

import java.util.*;

public class insertionSort
{
   public void sorting()
   {
       int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.print("Sorting Array using Insertion Sort Technique..\n");
       for(i=1; i<size; i++)
       {
           temp = arr[i];
           j = i - 1;
           while((temp < arr[j]) && (j >= 0))
           {
               arr[j+1] = arr[j];
               j = j - 1;
           }
           arr[j+1] = temp;
       }
	   
       System.out.print("Array after Sorting is : \n");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i] + "  ");
       }
   }
}