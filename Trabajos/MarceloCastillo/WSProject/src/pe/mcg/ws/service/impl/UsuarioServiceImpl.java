package pe.mcg.ws.service.impl;

import java.util.List;

import javax.jws.WebService;

import pe.mcg.ws.beans.UsuarioEntity;
import pe.mcg.ws.dao.UsuarioDAO;
import pe.mcg.ws.service.UsuarioService;

//@WebService(serviceName = "ProjectWebService", endpointInterface="pe.mcg.ws.service.UsuarioService", targetNamespace = "project.ws.mcg.pe")
@WebService(endpointInterface="pe.mcg.ws.service.UsuarioService", targetNamespace = "service.ws.mcg.pe")
public class UsuarioServiceImpl implements UsuarioService{

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@Override
	public List<UsuarioEntity> listarUsuarios() {
		return usuarioDAO.listarUsuarios();
	}
	 
	@Override
	public UsuarioEntity obtenerUsuario(Integer id) {
		return usuarioDAO.obtenerUsuario(id);
	}

	@Override
	public boolean insertarUsuario(UsuarioEntity usuario) {
		return usuarioDAO.insertarUsuario(usuario);
	}

	@Override
	public boolean actualizarUsuario(UsuarioEntity usuario) {
		return usuarioDAO.actualizarUsuario(usuario);
	}

	@Override
	public boolean desactivarUsuario(UsuarioEntity usuario) {
		return usuarioDAO.desactivarUsuario(usuario);
	}

}
