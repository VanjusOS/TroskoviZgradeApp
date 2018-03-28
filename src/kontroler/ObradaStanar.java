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
    
    public List<Stanar> getStanari(String uvjet, int brojRezultata){
        return HibernateUtil.getSession().createQuery(
                " from Stanar a where a.obrisano=false "
                        + " and concat(a.ime,' ',a.prezime) like :uvjet ")
                .setString("uvjet", "%" + uvjet + "%")
                .setMaxResults(brojRezultata)
                .list();
    }
    
    public Stanar spremi(Stanar p) throws EdunovaException{
        
        if(p.getIme()==null || p.getIme().trim().length()==0){
            throw new EdunovaException("Ime obavezno","ime");
        }
        
        if(p.getPrezime()==null || p.getPrezime().trim().length()==0){
            throw new EdunovaException("Prezime obavezno", "prezime");
        }
        
        if(p.getBrojStana()==null || p.getBrojStana().trim().length()==0){
            throw new EdunovaException("Broj stana obavezno", "broj stana");
        }    
        
        if(p.getBrojClanova()==null || p.getBrojClanova().trim().length()==0){
            throw new EdunovaException("Broj članova obavezno", "broj članova");
        }
        if(p.getDug()==null){
            throw new EdunovaException("Unesi dug", "dug");
        }
        
        p = obrada.save(p);
        
        return p;
    }

    public Stanar obrisi(Stanar st){
        obrada.delete(st);
        return st;
    }
   
    
}
