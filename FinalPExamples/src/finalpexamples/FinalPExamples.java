/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chicho
 */
public class FinalPExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        /*Static vs Dynamic Class Variables
        Static class variables are those that doesn't change. Once the class is 
        loaded are they're saved in memory and there they will remain until
        another class or method makes a reference to it by referencing first
        the class that contains this static variable, such as
        ***********************************************************************/
        
        
        Scanner keyboard = new Scanner(System.in);
        
        // 'a' is 20, but I didn't instantiated it
        int b = keyboard.nextInt();
        System.out.println("Before the calculation, a is " + 
                StaticNonStaticVariables.a);
        // 'a' is the result of the multiplication
        int result = StaticNonStaticVariables.howToReference(b);
        System.out.println("After the calculation, a is " + 
                StaticNonStaticVariables.a);
        
        
        
        StaticNonStaticVariables.referenceStaticFunction();
      //StaticNonStaticVariables.referenceNonStaticFunction();
        
        StaticNonStaticVariables example = new StaticNonStaticVariables();
        example.referenceNonStaticFunction();
        
        
        /*Arrays, ArrayList, Enum
        Arrays are to set simple number with fixed values
        ArrayLists may be a bit trickier to Add Mmodify Delete data,
        but are more flexible and have the Wrap and Unrwap functionalities
        that let you encapsulate data to convert numeric strings
        The Enum list
        ***********************************************************************/
        
        
        int counter = 0;
        double currentMaxNumber = 0;
        List<Integer> intList = new ArrayList<Integer>();  
        
        for (Iterator<Integer> i = intList.iterator(); i.hasNext(); ) {
            if (counter == intList.size()) break;
            
            double currentNumber = intList.get(counter);

            if (currentMaxNumber < currentNumber) currentMaxNumber = currentNumber;
            counter++;

        }
        
        
        /*For Statement in  Array
        ***********************************************************************/
        int[] number ={11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        for (int i = 0; i <= 10; i++){
            number[i] = number[i] - 1;
            System.out.println(number[i]);
        }
        
        
        /*Try, Catch, Throw
        ***********************************************************************/
        try {
            StaticNonStaticVariables.errorOnPurpose();
        } catch (Exception e){
                System.out.println("ExamplesExceptions");
        } finally
        { System.out.println("\nThis errored out!\n\n");}
        
        
        /*Character Stream vs Byte Stream
        Using Character Stream has the advantage of operating directly on 
        Unicode characters. This means that the file will be written or based 
        in UTF which is a set of universal characters.
        ***********************************************************************/
        
        
        
        //Write data to an external file
        
        
        
    }
    
}
