/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author regis
 */
@Local
public interface EjbTestEntitesLocal
{

  // String creerType (Short idconstr, String letype, short capacite);
   String delType (String cle);
   List<entites.Type> listerType (short capacite);
    
}
