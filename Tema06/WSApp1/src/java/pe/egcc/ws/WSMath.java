
package pe.egcc.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.egcc.model.ClienteModel;
import pe.egcc.service.EurekaService;

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

  /**
   * Web service operation
   */
  @WebMethod(operationName = "getClientes")
  public List<ClienteModel> getClientes(@WebParam(name = "nombre") String nombre) {
    EurekaService service = new EurekaService();
    List<ClienteModel> lista;
    lista = service.obtenerClientes(nombre);
    return lista;
  }
}
