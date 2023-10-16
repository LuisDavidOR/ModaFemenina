/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author David
 */
public class Inventario {
    private int id_inventario;
    private String nom_prod;
    private String descr_prod;
    private double prec_comp_prod;
    private double prec_ven_prod;
    private int cant_prod;
    private Date fecha_reg_prod;

    public Inventario(int id_inventario, String nom_prod, String descr_prod, double prec_comp_prod, double prec_ven_prod, int cant_prod, Date fecha_reg_prod) {
        this.id_inventario = id_inventario;
        this.nom_prod = nom_prod;
        this.descr_prod = descr_prod;
        this.prec_comp_prod = prec_comp_prod;
        this.prec_ven_prod = prec_ven_prod;
        this.cant_prod = cant_prod;
        this.fecha_reg_prod = fecha_reg_prod;
    }

    public Inventario(String nom_prod, String descr_prod, double prec_comp_prod, double prec_ven_prod, int cant_prod, Date fecha_reg_prod) {
        this.nom_prod = nom_prod;
        this.descr_prod = descr_prod;
        this.prec_comp_prod = prec_comp_prod;
        this.prec_ven_prod = prec_ven_prod;
        this.cant_prod = cant_prod;
        this.fecha_reg_prod = fecha_reg_prod;
    }

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getDescr_prod() {
        return descr_prod;
    }

    public void setDescr_prod(String descr_prod) {
        this.descr_prod = descr_prod;
    }

    public double getPrec_comp_prod() {
        return prec_comp_prod;
    }

    public void setPrec_comp_prod(double prec_comp_prod) {
        this.prec_comp_prod = prec_comp_prod;
    }

    public double getPrec_ven_prod() {
        return prec_ven_prod;
    }

    public void setPrec_ven_prod(double prec_ven_prod) {
        this.prec_ven_prod = prec_ven_prod;
    }

    public int getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(int cant_prod) {
        this.cant_prod = cant_prod;
    }

    public Date getFecha_reg_prod() {
        return fecha_reg_prod;
    }

    public void setFecha_reg_prod(Date fecha_reg_prod) {
        this.fecha_reg_prod = fecha_reg_prod;
    }
}
