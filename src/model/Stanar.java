/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private BigDecimal dug;

    public BigDecimal getDug() {
        return dug;
    }

    public void setDug(BigDecimal dug) {
        this.dug = dug;
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

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
        
    }
    
    

     }
    
    
