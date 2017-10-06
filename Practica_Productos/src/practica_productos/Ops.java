/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_productos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Isra
 */
public class Ops {
    public static final ArrayList<Producto> LISTA=new ArrayList();
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    public static final Date TODAY = new Date();
    
    public static void generar(int cantidad){
        LISTA.clear();
        for (int i = 0; i < cantidad; i++) {
            LISTA.add(new ProductoCongelado(
                    
            ));
        }
    }
}
