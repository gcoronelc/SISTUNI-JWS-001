package pe.egcc.app.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pe.egcc.app.dao.ClienteDao;
import pe.egcc.app.domain.ClienteModel;

@Path("clientes")
public class ClienteRest {

  private ClienteDao clienteDao;
  
  public ClienteRest() {
    clienteDao = new ClienteDao();
  }
  
  @GET
  @Produces({ MediaType.APPLICATION_JSON })
  public List<ClienteModel> getAll() {
    return this.clienteDao.getAll();
  }
  
  @GET
  @Path("traer")
  @Produces({ MediaType.APPLICATION_JSON })
  public List<ClienteModel> getClientes(
    @QueryParam("paterno")  String paterno,
    @QueryParam("materno")  String materno,
    @QueryParam("nombre")  String nombre) {

    ClienteModel model = new ClienteModel();
    model.setPaterno(paterno);
    model.setMaterno(materno);
    model.setNombre(nombre); 
    model.establecerVacios();
    return clienteDao.getClientes(model);
    
  }
  
}
