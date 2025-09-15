import java.util.*;

public class two_d
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
	  
	  
   
   }
}