package pe.mcg.ws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.mcg.ws.beans.UsuarioEntity;
import pe.mcg.ws.connection.AccesoDB;

public class UsuarioDAO {
	
	public List<UsuarioEntity> listarUsuarios(){
		List<UsuarioEntity> lstUsuarios = new ArrayList<>();
		Connection cn = null;
		 
		try{
			cn = AccesoDB.getConnection();
			String sql = "select id, usuario, nombre_completo, correo "
					+ " from usuario "
					+ " where estado = '1' ";
			PreparedStatement pstm = cn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()){
				UsuarioEntity usuario = new UsuarioEntity();
				usuario.setId(rs.getInt("id"));
				usuario.setUsuario(rs.getString("usuario"));
				//usuario.setClave(rs.getString("clave"));
				usuario.setNombreCompleto(rs.getString("nombre_completo"));
				usuario.setCorreo(rs.getString("correo"));
				lstUsuarios.add(usuario);
			}
			
			rs.close();
			pstm.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				cn.close();
			} catch(Exception e){
				
			}
		}
		
		return lstUsuarios;
	}
	
	public UsuarioEntity obtenerUsuario(Integer id){
		
		UsuarioEntity usuario = new UsuarioEntity();
		
		Connection cn = null;
		
		try{
			cn = AccesoDB.getConnection();
			String sql = "select id, usuario, nombre_completo, clave, correo "
					+ " from usuario "
					+ " where id like ? ";
			PreparedStatement pstm = cn.prepareStatement(sql);
			//pstm.setString(1, id);
			pstm.setLong(1, id);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()){
				//UsuarioEntity usuario = new UsuarioEntity();
				usuario.setId(rs.getInt("id"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setClave(rs.getString("clave"));
				usuario.setNombreCompleto(rs.getString("nombre_completo"));
				usuario.setCorreo(rs.getString("correo"));

			}
			
			rs.close();
			pstm.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				cn.close();
			} catch(Exception e){
				
			}
		}
		
		return usuario;
	}
	
	
public boolean insertarUsuario(UsuarioEntity usuario){
		
		Connection cn = null;
		boolean sw = false;
		
		try{
			cn = AccesoDB.getConnection();
			String sql = "INSERT INTO usuario("
					+ "usuario,"
					+ "clave,"
					+ "nombre_completo,"
					+ "correo,"
					+ "estado "
					+ " ) VALUES ("
					+ "'" + usuario.getUsuario() + "',"
					+ "'" + usuario.getClave() + "',"
					+ "'" + usuario.getNombreCompleto() + "',"
					+ "'" + usuario.getCorreo() + "',"
					+ "'1'" 
					+ ")";

			System.out.println(sql);
			
			PreparedStatement pstm = cn.prepareStatement(sql);
			sw = pstm.execute(sql);
			
			System.out.println("SW es " + sw);

			pstm.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				cn.close();
			} catch(Exception e){
				
			}
		}
		
		return sw;
	}
	
	public boolean actualizarUsuario(UsuarioEntity usuario){
		
		Connection cn = null;
		boolean sw = false;
		
		try{
			cn = AccesoDB.getConnection();
			
			String sql = "UPDATE usuario "
					+ "SET"
					+ " usuario = " + "'" + usuario.getUsuario() + "',"
					+ "clave = " + "'" + usuario.getClave() + "',"
					+ "nombre_completo = " + "'" + usuario.getNombreCompleto() + "',"
					+ "correo = " + "'" + usuario.getCorreo() + "'"
					+ " where "
					+ " id = " + usuario.getId();
	
			System.out.println(sql);
			
			PreparedStatement pstm = cn.prepareStatement(sql);
			int result = pstm.executeUpdate(sql);
			//sw = pstm.execute(sql);
			
			//System.out.println("Result es " + result);
			if(result == 1){
				sw = true;
			} else {
				sw = false;
			}
			
			//rs.close();
			pstm.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				cn.close();
			} catch(Exception e){
				
			}
		}
		
		return sw;
	}

	public boolean desactivarUsuario(UsuarioEntity usuario){
		
		Connection cn = null;
		boolean sw = false;
		
		try{
			cn = AccesoDB.getConnection();
			
			String sql = "UPDATE usuario "
					+ "SET "
					+ " estado = '0' "
					+ " where "
					+ " id = " + usuario.getId();
	
			System.out.println(sql);
			
			PreparedStatement pstm = cn.prepareStatement(sql);
			int result = pstm.executeUpdate(sql);
			//sw = pstm.execute(sql);
			
			//System.out.println("Result es " + result);
			if(result == 1){
				sw = true;
			} else {
				sw = false;
			}
			
			//rs.close();
			pstm.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try{
				cn.close();
			} catch(Exception e){
				
			}
		}
		
		return sw;
	}
	
}
