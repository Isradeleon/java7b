/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2_calendar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Isra
 */
public class Practice_2_calendar {
    private static final TimeI date1=new TimeI();
    private static final TimeI date2=new TimeI();
    private static int aux;
    private static final Scanner input= new Scanner(System.in);
    private static ArrayList<Integer> leaps_results;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TimeI date_test1=new TimeI(25,RulesI.Months[11],2016);
        //TimeI date_test2=new TimeI(2,RulesI.Months[0],2017);
        //System.out.println("Res: "+String.valueOf(
        //        CalendarI.datesDaysDifference(date_test1,date_test2 )
        //));
        //System.out.println(String.valueOf(date_test1.daysToNewYear()));
        //System.out.println(String.valueOf(date_test2));
        //System.exit(1);
        int option=0;
        System.out.println("** Welcome to DatesApp **");
        do {    
            System.out.println("Please, type one of the following options:");
            System.out.println("\t1 - Dates days difference.");
            System.out.println("\t2 - Leap year.");
            System.out.println("\t3 - Leap date.");
            System.out.println("\t4 - Show next leap years list.");
            System.out.println("\t5 - Exit.");
            try{
                option=input.nextInt();
                if (option>=1 && option<=5) {
                    switch(option){
                        case 1:
                            System.out.print("\nFirst date:");
                            setDate(date1);
                            System.out.print("\nSecond date:");
                            setDate(date2);
                            System.out.println("\n\tThe days difference is: "+CalendarI.datesDaysDifference(date1, date2));
                            date1.setInvalid();
                            date2.setInvalid();
                            System.out.println();
                            break;
                            
                        case 2:
                            System.out.print("\nType the year:");
                            try{
                                aux=input.nextInt();
                                if (CalendarI.leapYear(aux))
                                    System.out.println("\n\tLEAP YEAR!");
                                else
                                    System.out.println("\n\tNOT A LEAP YEAR!");
                            }catch(Exception e){
                                System.out.println("\nError: you should type a number");
                                input.next();
                            }
                            break;
                            
                        case 3:
                            System.out.print("\nSet the date:");
                            setDate(date1);
                            if (CalendarI.leapYear(date1))
                                    System.out.println("\n\tLEAP YEAR!");
                                else
                                    System.out.println("\n\tNOT A LEAP YEAR!");
                            date1.setInvalid();
                            break;
                            
                        case 4:
                            aux=-1;
                            do {
                                System.out.print("\nYear (1900-3000):");
                                try{
                                    aux=input.nextInt();
                                    if (aux>=1900 && aux<=3000) {
                                        leaps_results=CalendarI.leapYearsTotal(aux,3000);
                                        if (leaps_results.size()>0) {
                                            System.out.println("\n\tPrinting results:");
                                            System.out.print("\n\t");
                                            int count=1;
                                            for (int i = 0; i < leaps_results.size(); i++) {
                                                System.out.print(String.valueOf(leaps_results.get(i)));
                                                if (i!=leaps_results.size()-1) {
                                                    System.out.print(",");
                                                }
                                                if (count%7==0) {
                                                    System.out.print("\n\t");
                                                }
                                                count++;
                                            }
                                            System.out.println("\n");
                                        }else{
                                            System.out.println("\n\tNo leap years to show!");
                                        }
                                    }else{
                                        System.out.println("\nError: you should type a year between 1900 - 3000");
                                        aux=-1;
                                    }
                                }catch(Exception e){
                                    System.out.println("\nError: you should type a number");
                                    input.next();
                                }
                            } while (aux==-1);
                            break;
                            
                        case 5:
                            System.out.println("\nBye!\n");
                            break;
                    }
                }
                
            }catch(Exception e){
                System.out.println("\nError: you should type a number");
                input.next();
            }
        } while (option!=5);
        
        System.out.println("Res: "+String.valueOf(CalendarI.datesDaysDifference(
                new TimeI(1,RulesI.Months[0],2017), new TimeI(1,RulesI.Months[0],2017)
        )));
        //TimeI t=new TimeI(1,RulesI.Months[9],2019);        
        //System.out.println("res: "+String.valueOf(t.daysToNewYear()));
    }
    
    private static void setDate(TimeI date){
        do {
            System.out.print("\nYear (1900-3000):");
            try{
                aux=input.nextInt();
                if (aux>=1900 && aux<=3000) {
                    date.setYear(aux);
                }else{
                    System.out.println("\nError: you should type a year between 1900 - 3000");
                }
            }catch(Exception e){
                System.out.println("\nError: you should type a number");
                input.next();
            }
        } while (date.getYear()==-1);
        
        do {
            System.out.print("\nMonth (1-12):");
            try{
                aux=input.nextInt();
                if (aux>=1 && aux<=12) {
                    date.setMonth(RulesI.Months[aux-1]);
                }else{
                    System.out.println("\nError: you should type a month between 1-12");
                }
            }catch(Exception e){
                System.out.println("\nError: you should type a number");
                input.next();
            }
        } while (RulesI.indexOf(date.getMonth())==-1);
        
        String option_days="1-"+date.getMonth().getDaysCount();
        int maxDay=date.getMonth().getDaysCount();
        if (date.isLeap() && date.getMonth().getName().equals("Feb")){
            option_days="1-29";
            maxDay=29;
        }
        
        do {
            System.out.print("\nDay ("+option_days+")("+date.getMonth().getName()+"):");
            try{
                aux=input.nextInt();
                if (aux>=1 && aux<=maxDay) {
                    date.setDay(aux);
                }else{
                    System.out.println("\nError: you should type a day between "+option_days);
                }
            }catch(Exception e){
                System.out.println("\nError: you should type a number");
                input.next();
            }
        } while (date.getDay()==-1);
    }
}
