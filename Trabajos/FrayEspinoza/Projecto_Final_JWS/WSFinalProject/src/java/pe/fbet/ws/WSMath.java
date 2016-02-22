/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.fbet.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.fbet.model.ClienteModel;
import pe.fbet.model.EmpleadoModel;
import pe.fbet.model.MovimientoModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY
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
    @WebMethod(operationName = "getClientes")
    public List<ClienteModel> getClientes(@WebParam(name = "nombre") String nombre) {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista;
        lista = service.obtenerClientes(nombre);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmpleados")
    public List<EmpleadoModel> getEmpleados(@WebParam(name = "nombre") String nombre) {
        EurekaService service = new EurekaService();
        List<EmpleadoModel> lista;
        lista = service.obtenerEmpleado(nombre);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCodemployed")
    public List<EmpleadoModel> getCodemployed(@WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<EmpleadoModel> lista;
        lista = service.buscarEmpleado(codigo);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCodclient")
    public List<ClienteModel> getCodclient(@WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista;
        lista = service.busquedaCliente(codigo);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCodmovimiento")
    public List<MovimientoModel> getCodmovimiento(@WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<MovimientoModel> lista;
        lista = service.buscarMovimiento(codigo);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMovimiento")
    public List<MovimientoModel> getMovimiento(@WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<MovimientoModel> lista;
        lista = service.obtenerMovimiento(codigo);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getInsertclient")
    public List<ClienteModel> getInsertclient(@WebParam(name = "n") String n, @WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2, @WebParam(name = "n3") String n3, @WebParam(name = "n4") String n4, @WebParam(name = "n5") String n5, @WebParam(name = "n6") String n6, @WebParam(name = "n7") String n7, @WebParam(name = "n8") String n8) {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista;
        lista = service.insertarCliente(n, n1, n2, n3, n4, n5, n6, n7, n8);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getDeleteclient")
    public List<ClienteModel> getDeleteclient(@WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista;
        lista = service.eliminarCliente(codigo);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUpdateClient")
    public List<ClienteModel> getUpdateClient(@WebParam(name = "n1") String n1, @WebParam(name = "n2") String n2, @WebParam(name = "n3") String n3, @WebParam(name = "n4") String n4, @WebParam(name = "n5") String n5, @WebParam(name = "n6") String n6, @WebParam(name = "n7") String n7, @WebParam(name = "n8") String n8, @WebParam(name = "codigo") String codigo) {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista;
        lista = service.actualizarCliente(n1, n2, n3, n4, n5, n6, n7, n8, codigo);
        return lista;
    }
}
