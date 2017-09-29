/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_1_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Isra
 */
public class Practice_1_fibonacci {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please write a number to calculate Fibonacci:");
        try{
            int number = in.nextInt();
            Number.calculateFib(number);
        }catch(Exception e){
            System.out.println("\nYou may type numbers only!\n");
        }
    }
}
