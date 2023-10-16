/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David
 */
public class Empleados {
    private int id_empleados;
    private String nom_empl;
    private String apell_empl;
    private String cargo_empl;
    private String tel_empl;
    private String Correo_empl;

    public Empleados(int id_empleados, String nom_empl, String apell_empl, String cargo_empl, String tel_empl, String Correo_empl) {
        this.id_empleados = id_empleados;
        this.nom_empl = nom_empl;
        this.apell_empl = apell_empl;
        this.cargo_empl = cargo_empl;
        this.tel_empl = tel_empl;
        this.Correo_empl = Correo_empl;
    }

    public Empleados(String nom_empl, String apell_empl, String cargo_empl, String tel_empl, String Correo_empl) {
        this.nom_empl = nom_empl;
        this.apell_empl = apell_empl;
        this.cargo_empl = cargo_empl;
        this.tel_empl = tel_empl;
        this.Correo_empl = Correo_empl;
    }

    public int getId_empleados() {
        return id_empleados;
    }

    public void setId_empleados(int id_empleados) {
        this.id_empleados = id_empleados;
    }

    public String getNom_empl() {
        return nom_empl;
    }

    public void setNom_empl(String nom_empl) {
        this.nom_empl = nom_empl;
    }

    public String getApell_empl() {
        return apell_empl;
    }

    public void setApell_empl(String apell_empl) {
        this.apell_empl = apell_empl;
    }

    public String getCargo_empl() {
        return cargo_empl;
    }

    public void setCargo_empl(String cargo_empl) {
        this.cargo_empl = cargo_empl;
    }

    public String getTel_empl() {
        return tel_empl;
    }

    public void setTel_empl(String tel_empl) {
        this.tel_empl = tel_empl;
    }

    public String getCorreo_empl() {
        return Correo_empl;
    }

    public void setCorreo_empl(String Correo_empl) {
        this.Correo_empl = Correo_empl;
    }
    
    
}