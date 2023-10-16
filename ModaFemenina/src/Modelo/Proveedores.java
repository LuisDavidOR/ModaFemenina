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
public class Proveedores {
    private int id_proveedores;
    private String nom_pro;
    private String apell_pro;
    private String tel_pro;
    private String direc_pro;
    private String correo_pro;
    private Date fecha_reg_pro;

    public Proveedores(int id_proveedores, String nom_pro, String apell_pro, String tel_pro, String direc_pro, String correo_pro, Date fecha_reg_pro) {
        this.id_proveedores = id_proveedores;
        this.nom_pro = nom_pro;
        this.apell_pro = apell_pro;
        this.tel_pro = tel_pro;
        this.direc_pro = direc_pro;
        this.correo_pro = correo_pro;
        this.fecha_reg_pro = fecha_reg_pro;
    }

    public Proveedores(String nom_pro, String apell_pro, String tel_pro, String direc_pro, String correo_pro, Date fecha_reg_pro) {
        this.nom_pro = nom_pro;
        this.apell_pro = apell_pro;
        this.tel_pro = tel_pro;
        this.direc_pro = direc_pro;
        this.correo_pro = correo_pro;
        this.fecha_reg_pro = fecha_reg_pro;
    }

    public int getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(int id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public String getApell_pro() {
        return apell_pro;
    }

    public void setApell_pro(String apell_pro) {
        this.apell_pro = apell_pro;
    }

    public String getTel_pro() {
        return tel_pro;
    }

    public void setTel_pro(String tel_pro) {
        this.tel_pro = tel_pro;
    }

    public String getDirec_pro() {
        return direc_pro;
    }

    public void setDirec_pro(String direc_pro) {
        this.direc_pro = direc_pro;
    }

    public String getCorreo_pro() {
        return correo_pro;
    }

    public void setCorreo_pro(String correo_pro) {
        this.correo_pro = correo_pro;
    }

    public Date getFecha_reg_pro() {
        return fecha_reg_pro;
    }

    public void setFecha_reg_pro(Date fecha_reg_pro) {
        this.fecha_reg_pro = fecha_reg_pro;
    }
    
    
}
