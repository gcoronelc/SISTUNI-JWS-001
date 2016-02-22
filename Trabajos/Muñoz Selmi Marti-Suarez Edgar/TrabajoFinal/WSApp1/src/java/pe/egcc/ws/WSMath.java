
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
  @WebMethod(operationName = "getClientesAll")
  public List<ClienteModel> getClientesAll() {
    EurekaService service = new EurekaService();
    List<ClienteModel> lista;
    lista = service.obtenerClientesTodo();
    return lista;
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
  
    @WebMethod(operationName = "Registrar")
    public String Registrar(
         @WebParam(name = "codigo")String codigo
        ,@WebParam(name = "paterno")String paterno
        ,@WebParam(name = "materno")String materno
        ,@WebParam(name = "nombre")String nombre
        ,@WebParam(name = "dni")String dni
        ,@WebParam(name = "ciudad")String ciudad
        ,@WebParam(name = "direccion")String direccion
        ,@WebParam(name = "telefono")String telefono
        ,@WebParam(name = "email")String email
    ) {
        EurekaService service = new EurekaService();
        String respuesta = service.registraUsuario(codigo,paterno,materno,nombre,dni,ciudad,direccion,telefono,email);
        return respuesta;
    }
    
    @WebMethod(operationName = "Actualizar")
    public String Actualizar(         
         @WebParam(name = "paterno")String paterno
        ,@WebParam(name = "materno")String materno
        ,@WebParam(name = "nombre")String nombre
        ,@WebParam(name = "dni")String dni
        ,@WebParam(name = "ciudad")String ciudad
        ,@WebParam(name = "direccion")String direccion
        ,@WebParam(name = "telefono")String telefono
        ,@WebParam(name = "email")String email
    ) {
        EurekaService service = new EurekaService();
        String respuesta = service.actualizaUsuario(paterno, materno, nombre, dni, ciudad, direccion, telefono, email);
        return respuesta;
    }
    
    @WebMethod(operationName = "Eliminar")
    public String Eliminar(@WebParam(name = "dni")String dni) 
    {
        EurekaService service = new EurekaService();
        String respuesta = service.eliminaUsuario(dni);
        return respuesta;
    }
  
}
