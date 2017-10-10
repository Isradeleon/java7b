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
public class ProductoRefrigerado extends Producto {
    private int cod_organismo;
    private String imp_exp;
    private Date almacenado;

    public ProductoRefrigerado() {}
    
    public long diasRefrigerado(){
        return (Ops.HOY.getTime()-this.almacenado.getTime()) / (1000*60*60*24);
    }
    
    public double mayoreoIVA(){
        if ("EXPORTADO".equals(this.imp_exp))
            return this.getCosto_m() * 1.203;
        // IMPORTADO
        return this.getCosto_m() * 1.16;
    }

    public int getCod_organismo() {
        return cod_organismo;
    }

    public void setCod_organismo(int cod_organismo) {
        this.cod_organismo = cod_organismo;
    }

    public String getImp_exp() {
        return imp_exp;
    }

    public void setImp_exp(String imp_exp) {
        this.imp_exp = imp_exp;
    }

    public Date getAlmacenado() {
        return almacenado;
    }

    public void setAlmacenado(Date almacenado) {
        this.almacenado = almacenado;
    }
}
