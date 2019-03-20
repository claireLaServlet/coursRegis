/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entites.Constructeur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author regis
 */
@Stateless
public class EjbTestEntites implements EjbTestEntitesLocal
{

    @PersistenceContext
    EntityManager em;

    @Override
    public String delType (String cle)
    {
        String retour = "ok";
        try
        {
        
            entites.Type c = em.find(entites.Type.class, cle);

            em.remove(c);
            em.flush();
        }catch (Exception e)
        {
            retour = e.getMessage();
        }

        return retour;
    }
      
    
    
    @Override
    public List<entites.Type> listerType (short capacite)
    {
      
        String req = "select t from Type t where t.capacite = :p";
        List <entites.Type> retour = null;
        try
        {
         Query query = em.createQuery(req);
         query.setParameter("p", capacite);
         retour = query.getResultList();
        } catch (Exception e)
        {
            retour = null;
        }

        return retour;
    }

}
