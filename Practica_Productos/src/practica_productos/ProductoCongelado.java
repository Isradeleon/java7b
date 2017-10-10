/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_productos;

/**
 *
 * @author Isra
 */
public class ProductoCongelado extends Producto {
    private final int temp_r, temp_actual;

    public ProductoCongelado(int temp_r, int temp_actual) {
        this.temp_r = temp_r;
        this.temp_actual = temp_actual;
    }
    
    public boolean inadecuada(){
        return this.temp_r != this.temp_actual;
    }

    public int getTemp_r() {
        return temp_r;
    }

    public int getTemp_actual() {
        return temp_actual;
    }
}
