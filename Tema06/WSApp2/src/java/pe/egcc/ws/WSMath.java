/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pe.egcc.ejb.EJBMathLocal;

/**
 *
 * @author GustavoCoronel
 */
@WebService(serviceName = "WSMath")
public class WSMath {
  @EJB
  private EJBMathLocal ejbRef;// Add business logic below. (Right-click in editor and choose
  // "Insert Code > Add Web Service Operation")

  @WebMethod(operationName = "sumar")
  public int sumar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return ejbRef.sumar(num1, num2);
  }

  @WebMethod(operationName = "restar")
  public int restar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return ejbRef.restar(num1, num2);
  }
  
}
