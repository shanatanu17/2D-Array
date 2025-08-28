import java.util.*;

public class Sort_the_coloumns_of_2d_array
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
      int arr[][]= new int[3][3];
	  
	  System.out.println("Enter the array elemets ");
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=0;j<arr[i].length;j++)
		 {
		    arr[i][j] = sc.nextInt(); 
		 }
	  }
	  
	  
	  System.out.println("Display the array elements ");
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=0;j<arr[i].length;j++)
		 {
		    System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	  }
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	    int cols[] = new int[3];
		
		// 1. extract out the each coloumn
	    for(int j=0;j<arr[i].length;j++)
		{
		    cols[j] = arr[j][i];
		}
		
		// 2. sort extracted coloumn
		Arrays.sort(cols);
		
		//3.now, put the sorted in their correct position in array.
		for(int k=0;k<arr[i].length;k++)
		{
		   arr[k][i] =  cols[k];
		}
	  }
	  
	  
	  System.out.println("Display the array after sorting the each coloumn ");
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