import java.util.*;

public class Calculate_Sum_of_coloumn
{
   public static void main(String ss[])
    {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		System.out.println("Enter the array elemets ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(" Display the array elements ");
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
			for(int j=0;j<arr[i].length;j++)
			{
				sum = sum + arr[j][i];
			}
			
			System.out.println("Sum of  " + (i) + " th coloumn is " + sum);
		}
		
      
	  
	  
	  
	  
	  
	}   
}