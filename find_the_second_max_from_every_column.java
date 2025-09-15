import java.util.*;

public class find_the_second_max_from_every_column
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
			  //1. Extract every coloumn and store it in seperate array.
			  cols[j] = arr[j][i];
		  } 

          
             // . find second max form every coloumn
             int max = Integer.MIN_VALUE;

             for(int k = 0;k<cols.length;k++)
			 {
				 if(cols[k] > max)
				 {
					 max = cols[k];
				 }
			 }	

           // always intialize with -1 bcz , if the first element is maximum element and in second max if we initialize the arr[0] , then our code 
		   // gives us the wrong answer , so initialize secmax with -1;
           int secmax = -1;
		   
		   for(int l =0 ;l<cols.length;l++)
		   {
			   if(cols[l] != max && cols[l] > secmax)
			   {
				   secmax = cols[l];
			   }
		   }
		   
		   
		   System.out.println("Second max from each coloumn " + i  +"is " + secmax);

 		   
	  }
	  
	  
	  
   
   
   
   }
}