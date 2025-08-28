import java.util.*;

public class Sort_each_row_in_2d_matrix
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
      int arr[][] = new int[3][3];
	  
	  System.out.println("Enter the array values ");
	  for(int i=0;i<arr.length;i++)
	  {
	    for(int j=0;j<arr[i].length;j++)
		{
		   arr[i][j] = sc.nextInt();
		}
	  }
	  
	  
	  System.out.println("Original array is");
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=0;j<arr[i].length;j++)
		 {
		    System.out.print(arr[i][j]+" ");
		 }
		 
		 System.out.println();
	  }
	  
	  
	  //sort the each of the array one by one
	  for(int i=0;i<arr.length;i++)
	  {
		  Arrays.sort(arr[i]);
	  }
	  
	  
	  System.out.println("Array after sorting the rows is");
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