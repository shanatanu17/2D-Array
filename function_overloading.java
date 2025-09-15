public class function_overloading
{
   public static void main(String ss[])
   {
       add(10,20);
	   add(20.23,33.45);
   }
   
   public static void add(int a,int b)
   {
      System.out.println("Addition of 2 integers is " + (a+b));
   }
   
   
   public static void add(flaot a, float b)
   {
     System.out.println("Addition of 2 floats " + (a+b));
   }
}