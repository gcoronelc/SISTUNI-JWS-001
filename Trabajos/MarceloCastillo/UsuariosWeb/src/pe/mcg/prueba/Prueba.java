package pe.mcg.prueba;

import pe.mcg.ws.service.UsuarioEntity;
import pe.mcg.ws.service.UsuarioService;
import pe.mcg.ws.service.UsuarioServiceImpl;
import pe.mcg.ws.service.UsuarioServiceImplService;

public class Prueba {

	public static void main(String[] args) {

		UsuarioServiceImplService service = new UsuarioServiceImplService();
		
		UsuarioService operacion = service.getUsuarioServiceImplPort();
		
		//System.out.println(operacion.listarUsuarios().size());
		
		System.out.println(operacion.obtenerUsuario(2).getClave());
		/*
		for(UsuarioEntity usuario : operacion.listarUsuarios() ){
			System.out.println(usuario.getNombreCompleto() + " : " + usuario.getCorreo());
		}
*/
	}

}
