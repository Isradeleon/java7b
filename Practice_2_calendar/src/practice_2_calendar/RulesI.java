/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2_calendar;

/**
 *
 * @author Isra
 */
public class RulesI {
    public static final Month[] Months={
        new Month("Jan",31),
        new Month("Feb",28),
        new Month("Mar",31),
        new Month("Apr",30),
        new Month("May",31),
        new Month("Jun",30),
        new Month("Jul",31),
        new Month("Aug",31),
        new Month("Sep",30),
        new Month("Oct",31),
        new Month("Nov",30),
        new Month("Dec",31)
    };
    
    public static int indexOf(Month m){
        for (int i = 0; i < Months.length; i++) {
            if (m.getName().equals(Months[i].getName())) {
                return i;
            }
        }
        return -1;
    }
}
