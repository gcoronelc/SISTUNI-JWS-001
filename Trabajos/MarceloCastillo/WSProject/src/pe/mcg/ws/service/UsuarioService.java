package pe.mcg.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.mcg.ws.beans.UsuarioEntity;

@WebService(name = "UsuarioService", targetNamespace = "service.ws.mcg.pe")
public interface UsuarioService {

	@WebResult(name = "return")
	@WebMethod(operationName = "listarUsuarios", action = "urn:ListarUsuarios")
	@RequestWrapper(className = "pe.mcg.ws.service.jaxws.ListarUsuarios", localName = "listarUsuarios", targetNamespace = "service.ws.mcg.pe")
	@ResponseWrapper(className = "pe.mcg.ws.service.jaxws.ListarUsuariosResponse", localName = "listarUsuariosResponse", targetNamespace = "service.ws.mcg.pe")
	public List<UsuarioEntity> listarUsuarios();
	
	@WebResult(name = "return")
	@WebMethod(operationName = "obtenerUsuario", action = "urn:ObtenerUsuario")
	@RequestWrapper(className = "pe.mcg.ws.service.jaxws.ObtenerUsuario", localName = "obtenerUsuario", targetNamespace = "service.ws.mcg.pe")
	@ResponseWrapper(className = "pe.mcg.ws.service.jaxws.ObtenerUsuarioResponse", localName = "obtenerUsuarioResponse", targetNamespace = "service.ws.mcg.pe")
	public UsuarioEntity obtenerUsuario(@WebParam(name = "arg0") Integer id);
	
	@WebResult(name = "return")
	@WebMethod(operationName = "insertarUsuario", action = "urn:InsertarUsuario")
	@RequestWrapper(className = "pe.mcg.ws.service.jaxws.InsertarUsuario", localName = "insertarUsuario", targetNamespace = "service.ws.mcg.pe")
	@ResponseWrapper(className = "pe.mcg.ws.service.jaxws.InsertarUsuarioResponse", localName = "insertarUsuarioResponse", targetNamespace = "service.ws.mcg.pe")
	public boolean insertarUsuario(@WebParam(name = "arg0") UsuarioEntity usuario);
	
	@WebResult(name = "return")
	@WebMethod(operationName = "actualizarUsuario", action = "urn:ActualizarUsuario")
	@RequestWrapper(className = "pe.mcg.ws.service.jaxws.ActualizarUsuario", localName = "actualizarUsuario", targetNamespace = "service.ws.mcg.pe")
	@ResponseWrapper(className = "pe.mcg.ws.service.jaxws.ActualizarUsuarioResponse", localName = "actualizarUsuarioResponse", targetNamespace = "service.ws.mcg.pe")
	public boolean actualizarUsuario(@WebParam(name = "arg0") UsuarioEntity usuario);
	
	@WebResult(name = "return")
	@WebMethod(operationName = "desactivarUsuario", action = "urn:DesactivarUsuario")
	@RequestWrapper(className = "pe.mcg.ws.service.jaxws.DesactivarUsuario", localName = "desactivarUsuario", targetNamespace = "service.ws.mcg.pe")
	@ResponseWrapper(className = "pe.mcg.ws.service.jaxws.DesactivarUsuarioResponse", localName = "desactivarUsuarioResponse", targetNamespace = "service.ws.mcg.pe")
	public boolean desactivarUsuario(@WebParam(name = "arg0") UsuarioEntity usuario);

}
