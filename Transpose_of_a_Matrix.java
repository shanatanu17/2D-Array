import java.util.*;

public class Transpose_of_a_Matrix
{
    public static void main(String ss[])
	{
	   Scanner sc = new Scanner(System.in);
	   
	   int arr[][] = new int[3][3];

       System.out.println("Enter the array elements");
       for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   arr[i][j] = sc.nextInt();
		   }
	   }
	   
	   
	   System.out.println("Original 2d array elements are ");
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
		   
		   System.out.println();
	   }
	   
	   
	   System.out.println("Transpose of a matrix is");
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   System.out.print(arr[j][i]+" ");
		   }
		   System.out.println();
	   }
	   
	   
	   

         	   

	   
	}
}