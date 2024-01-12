// Write a Java program to swap two numbers by using the third variable.
 
class Swapwithvar{
  public static void main(String[] arg){
     //Declare variables
     int var1 = 10;
     int var2 = 50;
     int swap  =0;
     System.out.println("Before swapping var1 :" +var1);
     System.out.println("Before swapping var2 :" +var2);
    
     //perform swap
     swap = var1;
     var1 = var2;
     var2 = swap;
     System.out.println("After Swapping var1 :" +var1);
     System.out.println("After swapping var2 :" +var2);
  }
}