import java.util.*;

public class sort_each_col
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
	    int cols[] = new int[3];
		
	    for(int j=0;j<arr[i].length;j++)
		{
		   //1.Extract each col
		   cols[j] = arr[j][i];
		}
		
		//2. sort the col
		Arrays.sort(cols);
		   
		//3.store again that col in matrix..
		for(int k=0;k<cols.length;k++)
		{
		   arr[k][i]  =cols[k];
		}
	  }
	  
	  
	  
	  System.out.println(" Array after sorting each row ");
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