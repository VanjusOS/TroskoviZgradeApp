/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

/**
 *
 * @author Profesor
 */
public class EdunovaException extends Exception{
    
    private String komponenta;
    
    public  EdunovaException(String poruka,String komponenta){
        super(poruka);
        
        this.komponenta=komponenta;
    }

    public String getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(String komponenta) {
        this.komponenta = komponenta;
    }


    
}
