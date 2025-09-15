import java.util.*;

public class Addition
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
   
      int arr1[][] = new int[3][3];
	  int arr2[][] = new int[3][3];
	  
	  System.out.println("Enter array1 elements");
	  for(int i=0;i<arr1.length;i++)
	  {
	    for(int j=0;j<arr1[i].length;j++)
		{
		   arr1[i][j] = sc.nextInt();
		}
	  }
	  
	  
	  System.out.println("Enter array2 elements");
	  for(int i=0;i<arr2.length;i++)
	  {
	    for(int j=0;j<arr2[i].length;j++)
		{
		   arr2[i][j] = sc.nextInt();
		}
	  }
	  
	  
	  System.out.println("Display array1 elements ");
	  for(int i=0;i<arr1.length;i++)
      {
	    for(int j=0;j<arr1[i].length;j++)
		{
		   System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	  }
	  
	  
	  System.out.println("Display array2 elements ");
	  for(int i=0;i<arr2.length;i++)
      {
	    for(int j=0;j<arr2[i].length;j++)
		{
		   System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	  }
	  
	  
	  int ans[][] = new int[3][3];
	  
	  
	  for(int i=0;i<arr1.length;i++)
	  {
		  for(int j=0;j<arr1[i].length;j++)
		  {
			  ans[i][j] = arr1[i][j] + arr2[i][j];
		  }
	  }
	  
	  
	 
	 System.out.println("Addition of 2 matrix is ");
	 for(int i=0;i<ans.length;i++)
      {
	    for(int j=0;j<ans[i].length;j++)
		{
		   System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	  }
   
   }
}