package com.gestorvisitas.webservice;

/**
* Clase de WebService de la aplicación.
* @version: 1.0, 2016
* @author: Abel Huarca.
*/
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.codehaus.jackson.map.ObjectMapper;

import com.gestorvisitas.config.MyBatisConnectionFactory;
import com.gestorvisitas.criteria.ClienteMapper;
import com.gestorvisitas.criteria.RolMapper;
import com.gestorvisitas.criteria.TipoMapper;
import com.gestorvisitas.criteria.UsuarioMapper;
import com.gestorvisitas.criteria.VisitaMapper;
import com.gestorvisitas.model.Cliente;
import com.gestorvisitas.model.ClienteExample;
import com.gestorvisitas.model.ClienteVO;
import com.gestorvisitas.model.Rol;
import com.gestorvisitas.model.Tipo;
import com.gestorvisitas.model.TipoExample;
import com.gestorvisitas.model.Usuario;
import com.gestorvisitas.model.UsuarioExample;
import com.gestorvisitas.model.Visita;
import com.gestorvisitas.model.VisitaExample;

@Path("/WebServices")
public class Servicios {
	
	private SqlSessionFactory sqlSessionFactory;
	private UsuarioMapper usuarioMapper;
	private UsuarioExample usuarioExample= new UsuarioExample();
	private ClienteMapper clienteMapper;
	private ClienteExample clienteExample= new ClienteExample();
	private TipoMapper tipoMapper;
	private TipoExample tipoExample= new TipoExample();
	private VisitaMapper visitaMapper;
	private VisitaExample visitaExample= new VisitaExample();
	private SqlSession session ;
	private String respuesta="";

	private  RolMapper rolMapper;
	
	public Servicios(){
	    sqlSessionFactory= MyBatisConnectionFactory.getSqlSessionFactory();	
	}
	
	/**
	 * Este método permite a el aplicativo movil , validar el usuario y la contraseña.
	 * @param recibe como parametro el usuario. 
	 * @param recibe como parametro la contraseña,
	 * @return "0" si no se valida : "1" cuando se valida el usuario y contraseña.
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public String login(
			   @QueryParam("usuario") String usuario,
			   @QueryParam("clave") String clave
			   ){
		   List<Usuario> listUsuario=new ArrayList<>();
		   session = sqlSessionFactory.openSession();
	        try {
	        	usuarioMapper=session.getMapper(UsuarioMapper.class);
	        	listUsuario = new ArrayList<>();
	            usuarioExample.createCriteria().andUsuCorreoEqualTo(usuario)
	            		.andUsuEstadoEqualTo(1).andUsuPasswordEqualTo(clave);
	            listUsuario= usuarioMapper.selectByExample(usuarioExample);
	            if (listUsuario.size()==1){
	            	String codigoS=String.valueOf(listUsuario.get(0).getUsuCodigo());
	            	respuesta=codigoS;
	            }
	            else {
	            	usuarioExample=new UsuarioExample();
	            	listUsuario= new ArrayList<>();
	            	usuarioExample.createCriteria().andUsuCorreoEqualTo(usuario).andUsuEstadoEqualTo(1);
	            	listUsuario=usuarioMapper.selectByExample(usuarioExample);
	            	 if (listUsuario.size()==0){
	 	            	 respuesta="0";
	 	            }
	            	 else {
	            		 respuesta="-1";
	            	 }
	            }
	        } finally {
	            session.close();
	        } 
	      return respuesta;
	   }

	
	/**
	 * Este método devuelve una lista de clientes activos.
	 * @return Retorna una lista de clientes..
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/listaClientes")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public List<ClienteVO> listClientes(){
		   List<Cliente> listaClientes=new ArrayList<>();
		   List<ClienteVO> listaClienteVO=new ArrayList<>();
		   session = sqlSessionFactory.openSession();
	        try {
	        		clienteMapper=session.getMapper(ClienteMapper.class);
	        		clienteExample.createCriteria().andCliEstadoEqualTo(1);
	        		clienteExample.setOrderByClause("cli_razon_social");
	        	listaClientes=clienteMapper.selectByExample(clienteExample);
	        	for (Cliente cli:listaClientes){
	        		ClienteVO clienteVO = new ClienteVO();
	        		clienteVO.setCliRuc(cli.getCliRuc());
	        		clienteVO.setCliRazonSocial(cli.getCliRazonSocial());
	        		listaClienteVO.add(clienteVO);
	        	}
	        } finally {
	            session.close();
	        } 
	      return listaClienteVO;
	   }

	/**
	 * Este método devuelve un objeto de tipo Cliente.
	 * @param recibe como parametro el RUC del cliente. 
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/clienteDetalle")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public Cliente clienteDetalle(
			@QueryParam("ruc") String ruc
			){
		   Cliente cliente= new Cliente();
		   session = sqlSessionFactory.openSession();
	        try {
	        	clienteMapper=session.getMapper(ClienteMapper.class);
	        	cliente=clienteMapper.selectByPrimaryKey(ruc);
	        } finally {
	            session.close();
	        } 
	      return cliente;
	   }
	
	/**
	 * Este método permite saber si hay una comunicación exitosa con el web services.
	 * @return "OK" para saber si hay comunicación.
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/prueba")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public String prueba(){
	      return "OK";
	   }
	
	
	/**
	 * Este método permite saber si un cliente esta en estado activo o desactivo.
	 * @return "OK" para saber si hay comunicación.
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/validarClienteActivo")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public int validarClienteActivo(@QueryParam("ruc") String ruc){
		   int validar=0;
		   Cliente cliente= new Cliente();
		   session = sqlSessionFactory.openSession();
	        try {
	        	clienteExample.clear();
	        	clienteExample.createCriteria().andCliRucEqualTo(ruc);
	        	clienteMapper=session.getMapper(ClienteMapper.class);
	        	cliente=clienteMapper.selectByPrimaryKey(ruc);
	        	session.commit();
	        	if (cliente.getCliEstado()==1){
	        		validar=1;
	        		
	        	}
	        	if (cliente.getCliEstado()==0){
	        		validar=0;
	        		
	        	}
	        }catch(Exception e){
	        	respuesta="Error";
	        	validar=-1;
	        } 
	        finally {
	            session.close();
	        } 
	        return validar;
	   }
	
	/**
	 * Este método permite actualizar la direccion de un cliente 	.
	 * @param recibe como parametro el RUC del cliente. 
	 * @param la direccion del cliente. 
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/regDireccionCliente")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public String regDireccionCliente(
			@QueryParam("ruc") String ruc,
			@QueryParam("direccion") String direccion
			){
		   Cliente cliente= new Cliente();
		   session = sqlSessionFactory.openSession();
	        try {
	        	clienteMapper=session.getMapper(ClienteMapper.class);
	        	cliente=clienteMapper.selectByPrimaryKey(ruc);
	        	cliente.setCliDireccion(direccion);
	        	clienteMapper.updateByPrimaryKey(cliente);
	        	session.commit();
	        	respuesta="Exito";
	        }catch(Exception e){
	        	respuesta="Error";
	        } 
	        finally {
	            session.close();
	        } 
	      return respuesta;
	   }
	
	/**
	 * Este método permite insertar una visita.
	 * @param recibe como parametro un objeto de tipo Visita.
	 * @return devuelve el Id de el registro insetado. 
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	
	@POST
	@Path("/guardarVisita")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String guardarVisita(Visita visita){	
	        try {
	 		    session = sqlSessionFactory.openSession();
	        	visitaMapper=session.getMapper(VisitaMapper.class);
	        	visita.setVisCodigo(null);
	        	visita.setVisFecAlta(new Date());
	        	visitaMapper.insert(visita);
	        	respuesta=String.valueOf(visita.getVisCodigo());
	        	session.commit();
	        }catch(Exception e){
	        	respuesta=""+e.getMessage();
	        } 
	        finally {
	            session.close();
	        } 
	      return respuesta;
	   }
	
	
	
	public RolMapper getRolMapper() {
		return rolMapper;
	}

	public void setRolMapper(RolMapper rolMapper) {
		this.rolMapper = rolMapper;
	}
	/**
	 * Este método permite cargar las listas de parametros.
	 * @param devuelve el Id de el registro insetado.
	 * @return lista de parametros. 
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/cargarListas")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public List<Tipo> cargarListas(){
		   List<Tipo> listaTipo= new ArrayList<>();
		   session = sqlSessionFactory.openSession();
	        try {
	        	tipoMapper=session.getMapper(TipoMapper.class);
	        	tipoExample.createCriteria().andTipEstadoEqualTo(1);
	        	listaTipo=tipoMapper.selectByExample(tipoExample);
	        	respuesta="Exito";
	        }catch(Exception e){
	        	respuesta="Error";
	        } 
	        finally {
	            session.close();
	        } 
	      return listaTipo;
	   }
	
	
	
	/**
	 * Este método permite mostrar la lista de visitas de un cliente.
	 * @param ruc del cliente.
	 * @return lista de Visitas. 
	 * @version 1.0, 2016
	 * @author Abel Huarca
	 */
	@GET
	@Path("/listaVisitas")
	@Produces(MediaType.APPLICATION_JSON+ ";charset=utf-8")
	public List<Visita> listaVisitas(
			@QueryParam("ruc") String ruc
			){
		   List<Visita> listaVisitas= new ArrayList<>();
		   session = sqlSessionFactory.openSession();
	        try {
	        	visitaMapper=session.getMapper(VisitaMapper.class);
	        	visitaExample.createCriteria().andCliRucEqualTo(ruc);
	        	visitaExample.setOrderByClause("vis_codigo desc");
	        	listaVisitas=visitaMapper.selectByExample(visitaExample);
	        	
	        	for (Visita vis : listaVisitas){
	        		
	        		System.out.println(vis.toString());
	        	}
	        	respuesta="Exito";
	        }catch(Exception e){
	        	respuesta="Error";
	        } 
	        finally {
	            session.close();
	        } 
	      return listaVisitas;
	   }
	
	
	public UsuarioMapper getUsuarioMapper() {
		return usuarioMapper;
	}
	public void setUsuarioMapper(UsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}
	public UsuarioExample getUsuarioExample() {
		return usuarioExample;
	}
	public void setUsuarioExample(UsuarioExample usuarioExample) {
		this.usuarioExample = usuarioExample;
	}
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public SqlSession getSession() {
		return session;
	}
	public void setSession(SqlSession session) {
		this.session = session;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public ClienteMapper getClienteMapper() {
		return clienteMapper;
	}

	public void setClienteMapper(ClienteMapper clienteMapper) {
		this.clienteMapper = clienteMapper;
	}

	public ClienteExample getClienteExample() {
		return clienteExample;
	}

	public void setClienteExample(ClienteExample clienteExample) {
		this.clienteExample = clienteExample;
	}

	public TipoMapper getTipoMapper() {
		return tipoMapper;
	}

	public void setTipoMapper(TipoMapper tipoMapper) {
		this.tipoMapper = tipoMapper;
	}

	public TipoExample getTipoExample() {
		return tipoExample;
	}

	public void setTipoExample(TipoExample tipoExample) {
		this.tipoExample = tipoExample;
	}

	public VisitaMapper getVisitaMapper() {
		return visitaMapper;
	}

	public void setVisitaMapper(VisitaMapper visitaMapper) {
		this.visitaMapper = visitaMapper;
	}

	public VisitaExample getVisitaExample() {
		return visitaExample;
	}

	public void setVisitaExample(VisitaExample visitaExample) {
		this.visitaExample = visitaExample;
	}
	
	
	
	
}
