//Write a Java program to swap two numbers without using the third variable.

class Swapwithout3rdvar{
  public static void main(String[] arg){
     //Declare variables
     int var1 = 10;
     int var2 = 50;
     System.out.println("Before swapping var1 :" +var1 + "\nAfter swapping var2 :"+ var2);
    
     //perform swap
     var1 = var1 + var2; //var1= 60
     var2 = var1 - var2; //60-50=10(var2)
     var1 = var1 - var2; //60-10=50(var1)
     System.out.println("After Swapping var1 :" +var1 + "\nAfter swapping var2 :"+ var2);
  }
}