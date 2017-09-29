/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_3_collegeapp;

import java.util.Scanner;

/**
 *
 * @author Isra
 */
public class Practice_3_collegeapp {
    private static int option;
    private static Student aux;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input=new Scanner(System.in);
        System.out.println("\t** WELCOME TO RANDOM STUDENTS APP **");
        System.out.println("- How many students generate?");
        try{
            option=input.nextInt();
            if (option>0) {
                StudentOps.generateList(option);
                System.out.println(" -----------------------------------------------------------"
                +"--------------------------------------------------------------------");
                System.out.println(
                            "|\tMATR. \t|\t"
                            +"NOMBRE \t|\t"
                            +"AP. P. \t|\t"
                            +"AP. M. \t|\t"
                            +"U 1 \t|\t"
                            +"U 2 \t|\t"
                            +"U 3 \t|\t"
                            +"AVG \t|"
                    );
                System.out.println(" -----------------------------------------------------------"
                +"--------------------------------------------------------------------");
                for (int i = 0; i < StudentOps.STUDENTS_LIST.size(); i++) {
                    System.out.println(
                            "|\t"+String.valueOf(StudentOps.STUDENTS_LIST.get(i).getId())
                            +" \t|\t"+StudentOps.STUDENTS_LIST.get(i).getName()
                            +" \t|\t"+StudentOps.STUDENTS_LIST.get(i).getLastnameA()
                            +" \t|\t"+StudentOps.STUDENTS_LIST.get(i).getLastnameB()
                            +" \t|\t"+String.valueOf(StudentOps.STUDENTS_LIST.get(i).getU1())
                            +" \t|\t"+String.valueOf(StudentOps.STUDENTS_LIST.get(i).getU2())
                            +" \t|\t"+String.valueOf(StudentOps.STUDENTS_LIST.get(i).getU3())
                            +" \t|\t"+String.valueOf(StudentOps.STUDENTS_LIST.get(i).getAverage())
                            +" \t|"
                    );
                }
                System.out.println(" -----------------------------------------------------------"
                +"--------------------------------------------------------------------");
            
                System.out.println(" \tFINAL RESULTS:");
                aux=StudentOps.bestStudent();
                System.out.println(" \tBest student: "
                        +String.valueOf(aux.getAverage())+" "
                        +aux.getName()+" "
                        +aux.getLastnameA()+" "
                        +aux.getLastnameB());

                aux=StudentOps.worstStudent();
                System.out.println(" \tWorst: "
                        +String.valueOf(aux.getAverage())+" "
                        +aux.getName()+" "
                        +aux.getLastnameA()+" "
                        +aux.getLastnameB());

                System.out.println(" \tGeneral AVG: "
                        +String.valueOf(StudentOps.generalAVG()));
                System.out.println();
            }else{
                System.out.println("Well... there are no students! see ya!");
            }
        }catch(Exception e){
            System.out.println("** You should type valid numbers only! **");
        }
    }
    
}
