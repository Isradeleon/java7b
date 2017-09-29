/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_1_fibonacci;

/**
 *
 * @author Isra
 */
public class Number {
    public static void calculateFib(int number){
        if (number<=0) {
            System.out.println("0 : ZERO");
            return;
        }
        
        int acc=0; //accumulator
        
        int value=0; //aditional value
        
        int calculated; //result
        
        for (int i = 0; i < number; i++) {
            if (i==2) {
                System.out.println(String.valueOf(1)+" : ODD NUMBER");
            }else{
                calculated = value + acc;
                System.out.print(String.valueOf(calculated));
                if (calculated==0) {
                    System.out.print(" : ZERO");
                }else{
                    if (calculated%2 == 0) {
                        System.out.print(" : EVEN NUMBER");
                    }else{
                        System.out.print(" : ODD NUMBER");
                    }
                }
                System.out.print("\n");
                
                // Here is the number result. 
                // We had to use another condition to print the aditional number 1.
                if (i==0) {
                    acc=1;
                }else{
                    value=acc;
                    acc=calculated;
                }
            }
        }
    };
}
