package pe.mcg.presentacion;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import pe.mcg.bean.Usuario;
import pe.mcg.ws.service.UsuarioEntity;
import pe.mcg.ws.service.UsuarioService;
import pe.mcg.ws.service.UsuarioServiceImplService;

public class UsuarioMB {
	
	List<UsuarioEntity> lstUsuarios;
	UsuarioServiceImplService service;
	UsuarioService operacion;
	UsuarioEntity usuarioEntity;
	Usuario usuario;
	
	public UsuarioMB(){
		service = new UsuarioServiceImplService();
		operacion = service.getUsuarioServiceImplPort();
		usuarioEntity = new UsuarioEntity();
		this.setUsuario(new Usuario());
	}

    public List<UsuarioEntity> getLstUsuarios() {

		lstUsuarios = operacion.listarUsuarios();
		
		return lstUsuarios;
    }
	
    public void usuarioDel(ActionEvent event) { // como recoger prametro que uno envia de la vista mediante// las dos lineas siguientes
        FacesContext context = FacesContext.getCurrentInstance(); 
        String id = (String) context.getExternalContext().getRequestParameterMap().get("idusuario");
        usuarioEntity.setId(Integer.valueOf(id));
        boolean msg = operacion.desactivarUsuario(usuarioEntity);

        msgEnSession(msg);
    }
    
    public void seleccionarUsuario(ActionEvent event){
    	this.setUsuario(new Usuario());
        FacesContext context = FacesContext.getCurrentInstance();
        String id = (String) context.getExternalContext().getRequestParameterMap().get("idusuario");
        
    	usuarioEntity = operacion.obtenerUsuario(Integer.valueOf(id));
    	 
    	this.getUsuario().setId(usuarioEntity.getId());
    	this.getUsuario().setNombreCompleto(usuarioEntity.getNombreCompleto());
    	this.getUsuario().setUsuario(usuarioEntity.getUsuario());
    	this.getUsuario().setClave(usuarioEntity.getClave());
    	this.getUsuario().setCorreo(usuarioEntity.getCorreo());
    	
    }
    
    
    
    public String usuarioUpd() {

    	usuarioEntity = new UsuarioEntity();
    	
    	usuarioEntity.setId(this.getUsuario().getId());
    	usuarioEntity.setNombreCompleto(this.getUsuario().getNombreCompleto());
    	usuarioEntity.setClave(this.getUsuario().getClave());
    	usuarioEntity.setCorreo(this.getUsuario().getCorreo());
    	usuarioEntity.setUsuario(this.getUsuario().getUsuario());
    	
    	boolean msg = operacion.actualizarUsuario(usuarioEntity);
    	
    	msgEnSession(msg);
        
        return "usuarioUpd-mensaje";
    }
    
    public String usuarioIns() {
    	
    	usuarioEntity = new UsuarioEntity();
    	usuarioEntity.setNombreCompleto(this.getUsuario().getNombreCompleto());
    	usuarioEntity.setClave(this.getUsuario().getClave());
    	usuarioEntity.setCorreo(this.getUsuario().getCorreo());
    	usuarioEntity.setUsuario(this.getUsuario().getUsuario());
    	 	
    	operacion.insertarUsuario(usuarioEntity);
    	
        msgEnSession(true);

        return "usuarioIns-index";
    }
    
    private void msgEnSession(boolean msg) {
    	String result = "";
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        if (msg) {
        	result = "Solicitud atendida.";
        }

        session.setAttribute("msg", result);
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
}
