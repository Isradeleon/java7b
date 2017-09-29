/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_3_collegeapp;

/**
 *
 * @author Isra
 */
public class Student {
    private int id;
    private String name;
    private String lastnameA;
    private String lastnameB;
    private double u1;
    private double u2;
    private double u3;
    private double average;

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student() {}
    
    public Student(int id, String name, String lastnameA, String lastnameB, double u1, double u2, double u3) {
        this.id = id;
        this.name = name;
        this.lastnameA = lastnameA;
        this.lastnameB = lastnameB;
        this.u1 = u1;
        this.u2 = u2;
        this.u3 = u3;
        this.average=(u1+u2+u3)/3;
        this.average=Double.valueOf(StudentOps.DEC_FORMAT.format(this.average));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastnameA() {
        return lastnameA;
    }

    public void setLastnameA(String lastnameA) {
        this.lastnameA = lastnameA;
    }

    public String getLastnameB() {
        return lastnameB;
    }

    public void setLastnameB(String lastnameB) {
        this.lastnameB = lastnameB;
    }

    public double getU1() {
        return u1;
    }

    public void setU1(double u1) {
        this.u1 = u1;
    }

    public double getU2() {
        return u2;
    }

    public void setU2(double u2) {
        this.u2 = u2;
    }

    public double getU3() {
        return u3;
    }

    public void setU3(double u3) {
        this.u3 = u3;
    }
    
    
}
