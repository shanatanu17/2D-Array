import java.util.*;

public class spiral_order
{
public static void main(String ss[])
{
   Scanner sc = new Scanner(System.in);

   int n = 4;
   int m = 4;
   
   int arr[][] = new int[n][m];
   
   System.out.println("Enter array elements");
	  for(int i=0;i<arr.length;i++)
	  {
	    for(int j=0;j<arr[i].length;j++)
		{
		   arr[i][j] = sc.nextInt();
		}
	  }
	  
	  
	  System.out.println("Display array");
	  for(int i=0;i<arr.length;i++)
      {
	    for(int j=0;j<arr[i].length;j++)
		{
		   System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	  }
	  
	  
	  
	  
	  int top = 0;
	  int left = 0;
	  int right = n-1;
	  int bottom = m-1;
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  
	 
    // outer loop checks that , even if single row/col is remainning for traverse we need to run loop	 
	while(left<= right && top<=bottom)
	{
	  
	  
	  //1.left ---> right
	  for(int i=left;i<=right;i++)
	  {
		  list.add(arr[top][i]);
	  }
	  top++;
	  
	  
	  //2 . top---->bottom
	  for(int i=top;i<=bottom;i++)
	  {
		  list.add(arr[i][right]);
	  }
	  right--;
	  
	  
	  //3.right---->left
	  for(int i=right;i>=left;i--)
	  {
		  list.add(arr[bottom][i]);
	  }
	  bottom--;
	  
	  
	  //4.bottom--->top
	  for(int i=bottom;i>=top;i--)
	  {
		  list.add(arr[i][left]);
	  }
	  left++;
	  
	}
	
	
	// print the list 6, which contains the spiral order ..
	
	System.out.println("Spiral order ");
	for(int i=0;i<list.size();i++)
	{
		System.out.print(list.get(i)+" ");
	}
	
	System.out.println();
	
	
	System.out.println("Reverse of the spiral order ");
	Collections.reverse(list);
	
	for(int i=0;i<list.size();i++)
	{
		System.out.print(list.get(i)+" ");
	}
	
	
	
	
	
	
	
	  
	  
	  
	  



}

}