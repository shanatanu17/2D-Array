 import java.util.*; 
 
 public class TwoD_array_creation_and_Display_Elements
 {
    public static void main(String ss[])
	{
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		
		System.out.println("Enter the array values");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Display array values");
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