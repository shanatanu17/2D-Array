import java.util.*;

public class Addition_of_two_arrays
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
	  int arr1[][] = new int[3][3];
	  int arr2[][] = new int[3][3];
	  
	  int arr3[][] = new int[3][3];
	  
	  System.out.println("Enter the array 1 elements");
	  for(int i=0;i<arr1.length;i++)
	  {
	     for(int j=0;j<arr1[i].length;j++)
		 {
		    arr1[i][j] = sc.nextInt();
		 }
	  }
	  
	  System.out.println("Enter the array 2 elements");
	  for(int i=0;i<arr2.length;i++)
	  {
	     for(int j=0;j<arr2[i].length;j++)
		 {
		    arr2[i][j] = sc.nextInt();
		 }
		 
	  }
	  
	  System.out.println("Display the array 1 elements ");
	  for(int i=0;i<arr1.length;i++)
	  {
	     for(int j=0;j<arr1[i].length;j++)
		 {
		    System.out.print(arr1[i][j]+" ");
		 }
		 System.out.println();
	  }
	  
	  
	  System.out.println("Display the array 2 elements ");
	  for(int i=0;i<arr2.length;i++)
	  {
	     for(int j=0;j<arr2[i].length;j++)
		 {
		    System.out.print(arr2[i][j]+" ");
		 }
		 System.out.println();
	  }
	  
	  
     
	 // perofrm the addtion of arr1 and arr2 elemets . 
	 for(int i=0;i<arr1.length;i++)
	 {
		 for(int j=0;j<arr1[i].length;j++)
		 {
			 arr3[i][j] = arr1[i][j] + arr2[i][j];
		 }
	 }
	 
	 
	 System.out.println("Array 3 elements after performing addition ");
	 for(int i=0;i<arr3.length;i++)
	 {
		 for(int j=0;j<arr3[i].length;j++)
			 {
				 System.out.print(arr3[i][j]+" ");
			 }
			 System.out.println();
	 }
	 
	 
	  
	  
	  
	  
	  
   }
}