
package pe.egcc.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author GustavoCoronel
 */
@WebService(serviceName = "WSMath")
public class WSMath {

  /**
   * This is a sample web service operation
   */
  @WebMethod(operationName = "hello")
  public String hello(@WebParam(name = "name") String txt) {
    return "Hello " + txt + " !";
  }

  /**
   * Web service operation
   */
  @WebMethod(operationName = "sumar")
  public int sumar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    int suma;
    suma = num1 + num2;
    return suma;
  }

  /**
   * Web service operation
   */
  @WebMethod(operationName = "restar")
  public int restar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    int resta;
    resta = num1 - num2;
    return resta;
  }
}
