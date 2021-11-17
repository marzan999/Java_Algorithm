
package algo_practice;

import java.util.Scanner;
public class selectionSort
{
   public void sorting()
   {
      int size, i, j, temp, small, index = 0, count=0;
      int arr[] = new int[50];
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter number of elements: ");
      size = scan.nextInt();
      System.out.print("Enter " + size + " integers: ");
      for(i=0; i<size; i++)
      {
         arr[i] = scan.nextInt();
      }
      for(i=0; i<(size-1); i++)
      {
         small = arr[i];
         for(j=(i+1); j<size; j++)
         {
            if(small>arr[j])
            {
               small = arr[j];
               count++;
               index = j;
            }
         }
         if(count!=0)
         {
            temp = arr[i];
            arr[i] = small;
            arr[index] = temp;
         }
         count=0;
      }
      System.out.print("Now the Array after Sorting is :\n");
      for(i=0; i<size; i++)
      {
         System.out.print(arr[i]+ "  ");
      }
   }
}