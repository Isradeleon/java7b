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
public abstract class Producto {
    private Date caducidad;
    private int lote;
    private String nombre,fabricante;
    private double costo_m, costo_p;

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCosto_m() {
        return costo_m;
    }

    public void setCosto_m(double costo_m) {
        this.costo_m = costo_m;
    }

    public double getCosto_p() {
        return costo_p;
    }

    public void setCosto_p(double costo_p) {
        this.costo_p = costo_p;
    }
}
