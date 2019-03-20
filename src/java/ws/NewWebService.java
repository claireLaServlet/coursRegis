/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import session.EjbTestEntitesLocal;

/**
 *
 * @author regis
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService
{

    @EJB
    private EjbTestEntitesLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod
    public String listerType(int capacite)
    {
        short cap = (short) capacite;
       return ejbRef.listerType(cap).toString();
    }
   
     @WebMethod
    public String delType (String cle)
    {
        return ejbRef.delType(cle);
    }
      
    
}
