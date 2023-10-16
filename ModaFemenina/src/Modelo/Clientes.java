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
public class Clientes {
    private int id_clientes;
    private String nom_cli;
    private String apell_cli;
    private String tel_cli;
    private Date fec_reg_cli;
    private String correo_cli;

    public Clientes(int id_clientes, String nom_cli, String apell_cli, String tel_cli, Date fec_reg_cli, String correo_cli) {
        this.id_clientes = id_clientes;
        this.nom_cli = nom_cli;
        this.apell_cli = apell_cli;
        this.tel_cli = tel_cli;
        this.fec_reg_cli = fec_reg_cli;
        this.correo_cli = correo_cli;
    }

    public Clientes(String nom_cli, String apell_cli, String tel_cli, Date fec_reg_cli, String correo_cli) {
        this.nom_cli = nom_cli;
        this.apell_cli = apell_cli;
        this.tel_cli = tel_cli;
        this.fec_reg_cli = fec_reg_cli;
        this.correo_cli = correo_cli;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getApell_cli() {
        return apell_cli;
    }

    public void setApell_cli(String apell_cli) {
        this.apell_cli = apell_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public Date getFec_reg_cli() {
        return fec_reg_cli;
    }

    public void setFec_reg_cli(Date fec_reg_cli) {
        this.fec_reg_cli = fec_reg_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }
    
    
    
    
}
