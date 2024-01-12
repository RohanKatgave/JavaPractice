//Write a Java program to print the ASCII value of a given character.
 
class Asciivalue{
   public static void main(String[] arg){
    
   //variables 
    char ch = 'D';
    int ascii = ch;

   // You can also cast char to int
    char castAscii = (char) ch;

    //
    System.out.println("ASCII Value of D : " +ascii + "\ncastAscii :" +castAscii);
  }
}