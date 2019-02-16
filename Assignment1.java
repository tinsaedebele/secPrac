/**
 * Assinment1
 */
import java.util.*;

public class Assignment1 {
    /**
     * this methods is a spock problem with an output of actual sequence of a call made 
     */

    public static int c( int n, int k ) {
        if (k == 0) {
            System.out.println("c(" + n + "," + k + ") = 1");
           return 0 ; 
        }else if( k == n ){
            System.out.println("c(" + n + "," + k + ") = 1");
            return 1;
        }else if( k > n){
             System.out.println("c(" + n + "," + k + ") = 0");
             return 0;
        }else{
             int a = n - 1;
             int b = k - 1;
              System.out.println("c(" + n + "," + k + ") = c(" + a +"," + b +") + (" + a + "," + k + ")");
            return c(n - 1, k - 1) + c(n - 1, k);
        }
    }
    /**
     * this organizing a pardae
     */
    
    public static int P(int n) {
         switch (n) {
             case 1:
                 return 1;
             case 0: 
                return 0;
        default:
              return (P(n-1) + P(n-2));
         }
    }
    /**
     * writes a character repeatedly to form a line of n characters.
     */

   public static void writeLine(char cha, int n) {
        if (n <= 0) {
            System.out.println();
        } else {
            System.out.print(cha);
            writeLine(cha, n -1 );
      }
    
   }
   /**
    *uses writeLine to write m line of n characters each
     */
   
   public static void writeBlock(char ch, int n, int m) {
       if(m > 0) {
           writeLine(ch, n);
           writeBlock(ch, n, m-1);
       }else{
           System.out.println();
       }
   }
   /**
    * it takes an intgers and reverses the number to backway
    */

   public static void reverseDigits(int number) {
       
       if(number < 10){
        System.out.print(number);
        return;    
        }else{
             System.out.print(number % 10);
             reverseDigits(number/10);
        }
    
   }
  /**
   * this method uses a binarySearch to locate a document from a given a array of string 
   * 
   */
   public static int  myBinarySearch( String []anArray, int first, int last, String value ) {
      int index;
      if(first > last){
          index = -1;
      }else{
          int mid = (first + last)/2;
          if (value.equals(anArray[mid])) {
                index = mid;
          }else if (value.compareTo(anArray[mid]) < 0){
              index = myBinarySearch(anArray, first, mid - 1, value);
          }else{
              index = myBinarySearch(anArray, mid + 1, last, value);
          }
      }
      return index;
   }

    public static void main(String[] args) {
        String [] arr = {"20","25", "30", "45", "54"};
        char ch = '*';
        /**Questiong One calling the method to check if it is correcte  */
        System.out.println("Question One");
        c(6,5);
        /**Questiong Two calling the method to check if it is correcte  */
        System.out.println("Question Two");
        System.out.println("This is the value " + P(12));

        /**Questiong Three calling the method to check if it is correcte  */
        System.out.println("Question Three");
        writeLine(ch, 5);
        writeBlock(ch, 5, 5);

        /**Questiong Four calling the method to check if it is correcte  */
        System.out.println("Question Four");
        System.out.println("The number to be Reversed is : 1293486348.8");
        reverseDigits(1293486348);
        /**Questiong Five calling the method to check if it is correcte  */
        System.out.println();
        System.out.println("Question Five");
        System.out.println("The index for myBinarry search is " + myBinarySearch(arr,0, 4, "45"));
       
        
      
    }
}
