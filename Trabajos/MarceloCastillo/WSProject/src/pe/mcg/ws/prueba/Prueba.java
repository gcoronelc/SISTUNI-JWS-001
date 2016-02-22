package pe.mcg.ws.prueba;

import java.util.List;

import pe.mcg.ws.beans.UsuarioEntity;
import pe.mcg.ws.service.impl.UsuarioServiceImpl;

public class Prueba {

	public static void main(String[] args){
		
		UsuarioServiceImpl usuarioSI = new UsuarioServiceImpl();
		
		List<UsuarioEntity> listaUsuario = usuarioSI.listarUsuarios();
		
		for(UsuarioEntity usuario : listaUsuario){
			System.out.println(usuario.getNombreCompleto());
		}
		
/*		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario = usuarioSI.obtenerUsuario(7);
		
		System.out.println(usuario.getNombreCompleto());
*/		
		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setUsuario("lcastillo");
		usuario.setClave("123456");
		usuario.setNombreCompleto("Luis Castillo");
		usuario.setCorreo("lcastillo@correo.com");
		
		boolean sw = usuarioSI.insertarUsuario(usuario);
		
		if(sw){
			System.out.println("Usuario " + usuario.getUsuario() + " agregado exitosamente.");
		} else {
			System.out.println("Error al agregar usuario");
		}
		
/*		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setId(6);
		usuario.setUsuario("jcastillo");
		usuario.setClave("123456");
		usuario.setNombreCompleto("Julio Castillo");
		
		boolean sw = usuarioSI.actualizarUsuario(usuario);
		
		if(sw){
			System.out.println("Usuario " + usuario.getUsuario() + " agregado exitosamente.");
		} else {
			System.out.println("Error al agregar usuario");
		}
*/		
/*		
		UsuarioEntity usuario = new UsuarioEntity();
		usuario.setId(6);
		
		boolean sw = usuarioSI.desactivarUsuario(usuario);
		
		if(sw){
			System.out.println("Usuario " + usuario.getUsuario() + " eliminado exitosamente.");
		} else {
			System.out.println("Error al eliminar usuario");
		}
*/
		
	}
	
}
