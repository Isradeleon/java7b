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
    private long a_caducir;

    public ProductoFresco() {}
    
    public boolean proximaCaducidad(){
        this.a_caducir=(this.getCaducidad().getTime()-Ops.HOY.getTime() )/ (1000*60*60*24);
        return this.a_caducir <= 5;
    }
    
    public double costoIVA(){
        switch(this.transporte){
            case "AEREO":
                return this.getCosto_m() * 1.16;
            
            case "MARITIMO":
                return this.getCosto_m() * 1.175;
                
            // Terrestre
            default:
                return this.getCosto_m() * 1.14;
        }
    }

    public Date getEnvasado() {
        return envasado;
    }

    public void setEnvasado(Date envasado) {
        this.envasado = envasado;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
}
