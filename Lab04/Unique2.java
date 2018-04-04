// Lab 4.2: Unique.java
// Reads in 5 unique numbers.
import java.util.Scanner;

public class Unique2
{
   // gets 5 unique numbers from the user
   public void getNumbers()
   {
      Scanner input = new Scanner( System.in );

        /* Create an array of five elements*/ 
      int count = 0; // number of unique read
      ///ANSWER
      int[] numbers = new int[5]; //array of five elements
      int enteredNum; // counter for number input
      
      while( count != 5 ) // limits the unique number to the number of array elements
      {
         System.out.print( "\nEnter number: " );
         /* Write code here to retrieve the input from the user */
         ///ANSWER
         enteredNum = input.nextInt();
         
         // validate the input
         /* Write an if statement that validates the input */ 
         ///ANSWER
         if (enteredNum >= 10 && enteredNum <= 100){
            // flags whether this number already exists
            boolean containsNumber = false;
            
            /* Compare the user input to the unique numbers in the array using a for 
               statement. If the number is unique, store new number */
            ///ANSWER
            for (int x = 0; x < count; x++) {
            	if (enteredNum == numbers[x]) {
            		containsNumber = true;
            		break;
            	} else {
            		containsNumber = false;
            	}
            }
            /* add the user input to the array only if the number is not already 
               in the array */
            if ( !containsNumber )
            {
               /* Write code to add the number to the array and increment 
                  unique items input */
            	///ANSWER
            	numbers[count] = enteredNum;
            	count++;
            } // end if
            else 
               System.out.printf( "%d has already been entered\n",
                  enteredNum );
         } // end if
         else
            System.out.println( "number must be between 10 and 100" );
         
         // print the list of unique values
         /* Write code to output the contents of the array */
         ///ANSWER
         for (int y = 0; y < count; y++) {
        	 System.out.print(numbers[y] + " ");
         }
         
      } // end while   
      
      //closes scanner input
      input.close();
      
   } // end method getNumbers
} // end class Unique

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
