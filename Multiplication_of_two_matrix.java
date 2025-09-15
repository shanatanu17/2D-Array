import java.util.*;

public class Multiplication_of_two_matrices
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);
	  
      int arr1[][] = new int[3][3];
	  int arr2[][] = new int[3][3];
	  int arr3[][] = new int[3][3];
	  
	  System.out.println("Enter Array1 elements ");
	  for(int i=0;i<arr1.length;i++)
	  {
	     for(int j=0;j<arr1[i].length;j++)
		 {
		    arr1[i][j] = sc.nextInt();
		 }
	  }
	  
	  
	  System.out.println("Enetr the array 2 elemets ");
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
	  
	  
	  System.out.println("Display the array 2 elements );
	  for(int i=0;i<arr2.length;i++)
	  {
	     for(int j=0;j<arr2[i].length;j++)
		 {
		    System.out.print(arr2[i][j]+" ");
		 }
		 System.out.println(); 
	  }
	  
	  
	  // perform the multiplication operation 
	  for(int i=0;i<arr1.length;i++)
	  {
	    for(int j=0;j<arr1[i].length;j++)
		{
		  int sum = 0;
		  for(int k=0;k<arr1[i].length;k++)
		  {
		     sum =sum + arr1[i][k] * arr2[k][j];
		  }
		  
		  arr3[i][j] = sum;
		}
	  }
	  
	  
	  System.out.println("Dipslay the array 3 elements ");
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