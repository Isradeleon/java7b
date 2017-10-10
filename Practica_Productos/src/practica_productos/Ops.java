/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_productos;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Isra
 */
public class Ops {
    public static final ArrayList<ProductoFresco> LISTA_FRESCOS=new ArrayList();
    public static final ArrayList<ProductoCongelado> LISTA_CONGELADOS=new ArrayList();
    public static final ArrayList<ProductoRefrigerado> LISTA_REFRIGERADOS=new ArrayList();
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    public static final DecimalFormat DEC_FORMAT = new DecimalFormat("#.##"); 
    public static final Date HOY = new Date();
    public static final Date AUX_DATE= new Date();
    public static final Random RAND = new Random();
    public static final long MILISEGUNDOS = 31536000000L;
    
    public static final String[] NOMBRES={
        "CARNE","LECHE","HUEVO","CERDO","RES","CABRA","COCODRILO","ELEFANTE",
        "YOGURT","POLLO","FILETE","COSTILLA","QUESO","CREMA"
    };
    public static final String[] FABRICANTES={
        "LALA","TYSON","SANTA CLARA","KIR","CARNES L","CARNITOS","FOOD"
    };
    
    public static final String[] ORIGENES={
        "MEXICO","USA","CHINA","JAPON","ALEMANIA"
    };
    public static final String[] TRANSPORTES={
        "AEREO","MARITIMO","TERRESTRE"
    };
    
    public static final String[] IMP_EXP={
        "IMPORTADO","EXPORTADO"
    };
    
    public static void generarFrescos(int cantidad){
        LISTA_FRESCOS.clear();
        for (int i = 0; i < cantidad; i++) {
            LISTA_FRESCOS.add(new ProductoFresco());
            
            AUX_DATE.setTime(RAND.longs(HOY.getTime(),HOY.getTime()+MILISEGUNDOS).findFirst().getAsLong());
            LISTA_FRESCOS.get(i).setCaducidad(new Date(AUX_DATE.getTime()));
            LISTA_FRESCOS.get(i).setLote(RAND.ints(1000,10000).findFirst().getAsInt());
            LISTA_FRESCOS.get(i).setNombre(NOMBRES[RAND.ints(0,NOMBRES.length).findFirst().getAsInt()]);
            LISTA_FRESCOS.get(i).setFabricante(FABRICANTES[RAND.ints(0,FABRICANTES.length).findFirst().getAsInt()]);
            LISTA_FRESCOS.get(i).setCosto_p(RAND.doubles(20,600).findAny().getAsDouble());
            LISTA_FRESCOS.get(i).setCosto_m( LISTA_FRESCOS.get(i).getCosto_p() * 0.80 );
            
            AUX_DATE.setTime(RAND.longs(HOY.getTime()-MILISEGUNDOS,HOY.getTime()).findFirst().getAsLong());
            LISTA_FRESCOS.get(i).setEnvasado(new Date(AUX_DATE.getTime()));
            LISTA_FRESCOS.get(i).setOrigen(ORIGENES[RAND.ints(0,ORIGENES.length).findFirst().getAsInt()]);
            LISTA_FRESCOS.get(i).setTransporte(TRANSPORTES[RAND.ints(0,TRANSPORTES.length).findFirst().getAsInt()]);
        }
    }
    
    public static void generarRefrigerados(int cantidad){
        LISTA_REFRIGERADOS.clear();
        for (int i = 0; i < cantidad; i++) {
            LISTA_REFRIGERADOS.add(new ProductoRefrigerado());
            
            AUX_DATE.setTime(RAND.longs(HOY.getTime(),HOY.getTime()+MILISEGUNDOS).findFirst().getAsLong());
            LISTA_REFRIGERADOS.get(i).setCaducidad(new Date(AUX_DATE.getTime()));
            LISTA_REFRIGERADOS.get(i).setLote(RAND.ints(1000,10000).findFirst().getAsInt());
            LISTA_REFRIGERADOS.get(i).setNombre(NOMBRES[RAND.ints(0,NOMBRES.length).findFirst().getAsInt()]);
            LISTA_REFRIGERADOS.get(i).setFabricante(FABRICANTES[RAND.ints(0,FABRICANTES.length).findFirst().getAsInt()]);
            LISTA_REFRIGERADOS.get(i).setCosto_p(RAND.doubles(20,600).findAny().getAsDouble());
            LISTA_REFRIGERADOS.get(i).setCosto_m( LISTA_REFRIGERADOS.get(i).getCosto_p() * 0.80 );
            
            LISTA_REFRIGERADOS.get(i).setCod_organismo(RAND.ints(1000,10000).findFirst().getAsInt());
            LISTA_REFRIGERADOS.get(i).setImp_exp(IMP_EXP[RAND.nextInt(2)]);
            AUX_DATE.setTime(RAND.longs(HOY.getTime()-(1000*60*60*24*10),HOY.getTime()).findFirst().getAsLong());
            LISTA_REFRIGERADOS.get(i).setAlmacenado(new Date(AUX_DATE.getTime()));
        }
    }
    
    public static void generarCongelados(int cantidad){
        LISTA_CONGELADOS.clear();
        for (int i = 0; i < cantidad; i++) {
            LISTA_CONGELADOS.add(new ProductoCongelado(RAND.nextInt(6),RAND.nextInt(6)));
            AUX_DATE.setTime(RAND.longs(HOY.getTime(),HOY.getTime()+MILISEGUNDOS).findFirst().getAsLong());
            LISTA_CONGELADOS.get(i).setCaducidad(new Date(AUX_DATE.getTime()));
            LISTA_CONGELADOS.get(i).setLote(RAND.ints(1000,10000).findFirst().getAsInt());
            LISTA_CONGELADOS.get(i).setNombre(NOMBRES[RAND.ints(0,NOMBRES.length).findFirst().getAsInt()]);
            LISTA_CONGELADOS.get(i).setFabricante(FABRICANTES[RAND.ints(0,FABRICANTES.length).findFirst().getAsInt()]);
            LISTA_CONGELADOS.get(i).setCosto_p(RAND.doubles(20,600).findAny().getAsDouble());
            LISTA_CONGELADOS.get(i).setCosto_m( LISTA_CONGELADOS.get(i).getCosto_p() * 0.80 );
        }
    }
}
