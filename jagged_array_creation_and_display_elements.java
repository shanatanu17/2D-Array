import java.util.*;


public class jagged_array_creation_and_display_elements
{
   public static void main(String ss[])
   {
	  Scanner sc = new Scanner(System.in);
      int arr[][] = new int[3][];
	  
	  arr[0]= new int[3];
	  arr[1]= new int[2];
	  arr[2]= new int[4];
	  
	  
	  System.out.println("Enter the array elements ");
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=0;j<arr[i].length;j++)
		 {
		    arr[i][j] = sc.nextInt();
		 }
	  }
	  
	  
	  // display the array elements
	  System.out.println("Jagged array elements are ");
	  for(int i=0;i<arr.length;i++)
	  {
	    for(int j=0;j<arr[i].length;j++)
		{
		   System.out.print("|"+ arr[i][j]+"|");
		}
		System.out.println();
	  }
   }
}