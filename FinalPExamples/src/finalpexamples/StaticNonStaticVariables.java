/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpexamples;

/*
 *
 * @author Chicho
 */
public class StaticNonStaticVariables {
    
    static int a = 20;
    public int b;
    
public static int howToReference(int b){
    
    a = a * b;
    
    return a;
}

public static void errorOnPurpose(){
    try{
        int[] number2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            
            for (int i = 0; i < 12; i++){
                number2[i] = number2[i] - 1;
                System.out.println(number2[i]);
            }
    }catch (Throwable te){
                System.out.println("\nThis thing broke inside the errorOnPurpose");
    }
    
}

public void referenceNonStaticFunction(){
    System.out.println("The Non-Static Function has been called.");
}

public static void referenceStaticFunction(){
    System.out.println("The Static function has been called.");
}

}
