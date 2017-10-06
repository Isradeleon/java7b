/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_productos;

import java.util.Date;

/**
 *
 * @author Isra
 */
public class ProductoFresco extends Producto {
    private Date envasado;
    private String origen,transporte;
    
    public boolean proximaCaducidad(){
        
        return true;
    }
}
