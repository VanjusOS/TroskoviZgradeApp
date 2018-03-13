/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author vanjus
 * 
 */


@Table
@Entity

public class Stanar extends Entitet implements Serializable {
    
    private String brojStana;    
    private String ime;
    private String prezime;
    private String brojClanova;
    private String dug;

    public Stanar() {
    }

    public Stanar(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getBrojStana() {
        return brojStana;
    }

    public void setBrojStana(String brojStana) {
        this.brojStana = brojStana;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(String brojClanova) {
        this.brojClanova = brojClanova;
    }

    public String getDug() {
        return dug;
    }

    public void setDug(String dug) {
        this.dug = dug;
    }
    
    

     }
    
    
