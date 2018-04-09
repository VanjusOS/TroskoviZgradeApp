/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import pomocno.HibernateUtil;
import view.Loading;
import view.PocetniIzbornik;

/**
 *
 * @author Admin
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSession();
        new Loading().setVisible(true);
     
 
    }
    
}
