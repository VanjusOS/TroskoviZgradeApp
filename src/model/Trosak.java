/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author vanjus
 */

@Table
@Entity

public class Trosak extends Entitet implements Serializable {

    
    private BigDecimal trosakCiscenje;
    private BigDecimal trosakStubisnaRasvjeta;
    private BigDecimal dodatniTrosak;
    private String mjesecTroska;

    public String getMjesecTroska() {
        return mjesecTroska;
    }

    public void setMjesecTroska(String mjesecTroska) {
        this.mjesecTroska = mjesecTroska;
    }
    

    public BigDecimal getTrosakCiscenje() {
        return trosakCiscenje;
    }

    public void setTrosakCiscenje(BigDecimal trosakCiscenje) {
        this.trosakCiscenje = trosakCiscenje;
    }

    public BigDecimal getTrosakStubisnaRasvjeta() {
        return trosakStubisnaRasvjeta;
    }

    public void setTrosakStubisnaRasvjeta(BigDecimal trosakStubisnaRasvjeta) {
        this.trosakStubisnaRasvjeta = trosakStubisnaRasvjeta;
    }

    public BigDecimal getDodatniTrosak() {
        return dodatniTrosak;
    }

    public void setDodatniTrosak(BigDecimal dodatniTrosak) {
        this.dodatniTrosak = dodatniTrosak;
    }

    

}
