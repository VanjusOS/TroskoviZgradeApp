/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import model.Stanar;
import pomocno.HibernateUtil;
import java.util.List;

/**
 *
 * @author Profesor
 */
public class ObradaStanar {
    
    private Obrada<Stanar> obrada;
    
    public ObradaStanar(){
        obrada = new Obrada<>();
    }
    
    public List<Stanar> getPolaznici(String uvjet){
        return HibernateUtil.getSession().createQuery(
                " from Polaznik a where a.obrisano=false "
                        + " and concat(a.ime,' ',a.prezime) like :uvjet ")
                .setString("uvjet", "%" + uvjet + "%")
                .setMaxResults(100)
                .list();
    }
    
    public Stanar spremi(Stanar p) throws EdunovaException{
        
        if(p.getIme()==null || p.getIme().trim().length()==0){
            throw new EdunovaException("Ime obavezno","ime");
        }
        
        if(p.getPrezime()==null || p.getPrezime().trim().length()==0){
            throw new EdunovaException("Prezime obacezno", "prezime");
        }
        
        
        
        p = obrada.save(p);
        
        return p;
    }

    public Stanar save(Stanar p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
