import java.util.*;

public class sort_each_row
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
   
      int arr[][] = new int[3][3];
	  
	  System.out.println("Enter 2-d array elements");
	  for(int i=0;i<arr.length;i++)
	  {
	    for(int j=0;j<arr[i].length;j++)
		{
		   arr[i][j] = sc.nextInt();
		}
	  }
	  
	  
	  System.out.println("Display 2-d array");
	  for(int i=0;i<arr.length;i++)
      {
	    for(int j=0;j<arr[i].length;j++)
		{
		   System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	  }
	  
	  
	  // sort each row of matrix
	  for(int i=0;i<arr.length;i++)
	  {
		Arrays.sort(arr[i]);  
	  }
	  
	  
	  
	  System.out.println("After sorting elements");
	  System.out.println("Display 2-d array");
	  for(int i=0;i<arr.length;i++)
      {
	    for(int j=0;j<arr[i].length;j++)
		{
		   System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	  }
	  
	  
	  
	  
	  
   
   
   }
}