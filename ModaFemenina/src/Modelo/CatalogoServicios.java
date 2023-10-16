/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David
 */
public class CatalogoServicios {
    private int id_servicio;
    private String nom_ser;
    private double prec_ser;
    private String descr_ser;

    public CatalogoServicios(int id_servicio, String nom_ser, double prec_ser, String descr_ser) {
        this.id_servicio = id_servicio;
        this.nom_ser = nom_ser;
        this.prec_ser = prec_ser;
        this.descr_ser = descr_ser;
    }

    public CatalogoServicios(String nom_ser, double prec_ser, String descr_ser) {
        this.nom_ser = nom_ser;
        this.prec_ser = prec_ser;
        this.descr_ser = descr_ser;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNom_ser() {
        return nom_ser;
    }

    public void setNom_ser(String nom_ser) {
        this.nom_ser = nom_ser;
    }

    public double getPrec_ser() {
        return prec_ser;
    }

    public void setPrec_ser(double prec_ser) {
        this.prec_ser = prec_ser;
    }

    public String getDescr_ser() {
        return descr_ser;
    }

    public void setDescr_ser(String descr_ser) {
        this.descr_ser = descr_ser;
    }
    
    
}
