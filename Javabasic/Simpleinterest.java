 // Write a Java program to calculate simple interest.
 //Simple Interest = (P x T x R)/100

class Simpleinterest{
  public static void main(String[] arg){
     
    //Variable Declaration
      int p = 10000;
      int t = 5;
      int r = 5;
      int SI;

    // calculate simple interest
     SI=(p*t*r)/100;
     System.out.println("We need to find simple interest on " +p +" at the rate of " +r +" for " +t + " units of time is:\n" +SI); 
 }
}