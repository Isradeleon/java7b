/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_3_collegeapp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Isra
 */
public class StudentOps {
    public static final ArrayList<Student> STUDENTS_LIST=new ArrayList();
    private static final Random RAND = new Random();
    private static Student aux=new Student();
    private static double aux_avg;
    public static final DecimalFormat DEC_FORMAT = new DecimalFormat("#.##");
    
    public static void generateList(int number_of_students){
        STUDENTS_LIST.clear();
        for (int i = 0; i < number_of_students; i++) {
            STUDENTS_LIST.add(new Student(
                    15000+i,
                    NameAndLast.NAMES[RAND.nextInt(NameAndLast.NAMES.length)],
                    NameAndLast.LAST_NAMESA[RAND.nextInt(NameAndLast.LAST_NAMESA.length)],
                    NameAndLast.LAST_NAMESB[RAND.nextInt(NameAndLast.LAST_NAMESB.length)],
                    Double.valueOf(DEC_FORMAT.format(RAND.nextDouble()*100)),
                    Double.valueOf(DEC_FORMAT.format(RAND.nextDouble()*100)),
                    Double.valueOf(DEC_FORMAT.format(RAND.nextDouble()*100))
            ));
        }
    }
    
    public static double generalAVG(){
        aux_avg=0;
        for (int i = 0; i < STUDENTS_LIST.size(); i++) {
            aux_avg+=STUDENTS_LIST.get(i).getAverage();
        }
        aux_avg=aux_avg/STUDENTS_LIST.size();
        return Double.valueOf(DEC_FORMAT.format(aux_avg));
    }
    
    public static Student bestStudent(){
        aux.setAverage(0);
        for (int i = 0; i < STUDENTS_LIST.size(); i++) {
            if (STUDENTS_LIST.get(i).getAverage()>aux.getAverage()) {
                aux=STUDENTS_LIST.get(i);
            }
        }
        return aux;
    }
    
    public static Student worstStudent(){
        aux.setAverage(101);
        for (int i = 0; i < STUDENTS_LIST.size(); i++) {
            if (STUDENTS_LIST.get(i).getAverage()<aux.getAverage()) {
                aux=STUDENTS_LIST.get(i);
            }
        }
        return aux;
    }
}
