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
public class Month {
    private final String name;
    private int days_count;

    public Month(String name, int days) {
        this.name = name;
        this.days_count = days;
    }

    public String getName() {
        return name;
    }

    public int getDaysCount() {
        return days_count;
    }
    
    public void setDaysCount(int days_count) {
        this.days_count=days_count;
    }
}
