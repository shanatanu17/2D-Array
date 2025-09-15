import java.util.*;

public class find_sum_of_coloumn
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
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  int sum = 0;
		  for(int j=0;j<arr.length;j++)
		  {
			sum = sum + arr[j][i];  
		  }
		  System.out.println("Sum of col " + i + "is "+ sum);
	  }
  
  }
}