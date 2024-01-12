// Write a Java program to print the sum (addition), multiply, subtract, divide, and remainder of two numbers.

class calculator{
  public static void main(String[] arg){
      // variable for perform add,sub,div,remain.
      int num1 = 50;
      int num2 = 10;
      int res;
      
      // performing operations
      res = num1 + num2;
      System.out.println("ADD : "+res);

      res = num1 - num2;
      System.out.println("SUB : "+res);

      res = num1 * num2;
      System.out.println("MUL : "+res);

      res = num1 / num2;
      System.out.println("DIV : "+res);

      res = num1 % num2;
      System.out.println("Remainder : "+res);
    
     //results
      System.out.println("All DONE");
      
  }
}