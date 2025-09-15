import java.util.*;

public class Rotate_by_90_without_extra_space
{
  public static void main(String ss[])
  {
    Scanner sc = new Scanner(System.in);
	 
	 
	 System.out.println("Enter a value of n");
	 
	 int n = sc.nextInt();
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
	 
	 System.out.println();
	 
	 // bcz of transpose we need to take extra space to store the transpose..
	 
	 
	 
	 
	 // 1 . take transpose
	 for(int i=0;i<arr.length;i++)
	 {
	   for(int j=0;j<arr[i].length;j++)
	   {
		   if(i < j)
		   {
	         int temp = arr[i][j];
			 arr[i][j] = arr[j][i];
			 arr[j][i] = temp;
		   }
		   else
		   {
			   arr[i][j] = arr[i][j];
			   arr[i][j] = arr[i][j];
		   }
	   }
	 }
	 
	 System.out.println("Array after transpose");
	 for(int i=0;i<arr.length;i++)
	 {
	   for(int j=0;j<arr[i].length;j++)
	   {
	     System.out.print(arr[i][j]+" ");
	   }
	   System.out.println();
	 }
	 
	 System.out.println();
	 
	 
	 
	 //2.reverse each row
	 for(int i=0;i<arr.length;i++)
	 {
		 
		 //2.1  take a seperate Integer row for each row
		 Integer row[] = new Integer[n];
		 
		 for(int j=0;j<arr[i].length;j++)
		 {
			
			row[j]  = arr[i][j];  
			 
		    //2.2  now, we need to reverse that row for that , convert this row(array into --> list)
		    List<Integer> list = Arrays.asList(row);
		    Collections.reverse(list);
		 }
		 
		    //2.3 now , we have to again store these values in matrix back
		    
			for(int j = 0;j<row.length;j++)
			{
				arr[i][j] = row[j];
			}
 
	 }
	 
	 
	 System.out.println("array after roataing by 90");
	 // 3.array after roataing by 90
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