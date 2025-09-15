import java.util.*;

public class Rotate_by_90_using_extra_space
{
  public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);
	 
	 int n = 3;
	 int arr[][] = new int[n][n];
	 
	 System.out.println("Enter the array values");
	 for(int i=0;i<arr.length;i++)
	 {
	   for(int j=0;j<arr[i].length;j++)
	   {
	     arr[i][j] = sc.nextInt();
	   }
	 }
	 
	 System.out.println("Display the 2-d matrix");
	 for(int i=0;i<arr.length;i++)
	 {
	   for(int j=0;j<arr[i].length;j++)
	   {
	     System.out.print(arr[i][j]+" ");
	   }
	   System.out.println();
	 }
	 
	 
	 // we take here, a seperate array which is of input size to store our rotated matrix
	 int ans[][] = new int[n][n];
	 
	 
	 for(int i=0;i<arr.length;i++)
	 {
		for(int j=0;j<arr[i].length;j++)
		{
		   ans[j][n-i-1] = arr[i][j];
		}			
		 System.out.println();
	 }
	 
	 
	 System.out.println("Answer array after rotating the original array");
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=0;j<arr[i].length;j++)
		 {
			 System.out.print(ans[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	 
	 
   
   
   }  
}