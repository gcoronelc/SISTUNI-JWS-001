package pe.egcc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.db.AccesoDB;
import pe.egcc.model.ClienteModel;

/**
 *
 * @author GustavoCoronel
 */
public class EurekaService {
    
  public List<ClienteModel> obtenerClientesTodo() {
    List<ClienteModel> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno, "
              + "vch_cliematerno, vch_clienombre, chr_cliedni, "
              + "vch_clieciudad, vch_cliedireccion, "
              + "vch_clietelefono, vch_clieemail "
              + "from cliente "
              + "order by chr_cliecodigo desc"; 
      PreparedStatement pstm = cn.prepareStatement(sql);     
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        ClienteModel model = new ClienteModel();
        model.setCodigo(rs.getString("chr_cliecodigo"));
        model.setPaterno(rs.getString("vch_cliepaterno"));
        model.setMaterno(rs.getString("vch_cliematerno"));
        model.setNombre(rs.getString("vch_clienombre"));
        model.setDni(rs.getString("chr_cliedni"));
        model.setCiudad(rs.getString("vch_clieciudad"));
        model.setDireccion(rs.getString("vch_cliedireccion"));
        model.setTelefono(rs.getString("vch_clietelefono"));
        model.setEmail(rs.getString("vch_clieemail"));
        lista.add(model);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }

  public List<ClienteModel> obtenerClientes(String nombre) {
    List<ClienteModel> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno, "
              + "vch_cliematerno, vch_clienombre, chr_cliedni, "
              + "vch_clieciudad, vch_cliedireccion, "
              + "vch_clietelefono, vch_clieemail "
              + "from cliente "
              + "where vch_cliepaterno like ? "
              + "or vch_cliematerno like ? "
              + "or vch_clienombre like ? "
              + "order by chr_cliecodigo desc";   
      PreparedStatement pstm = cn.prepareStatement(sql);
      nombre += "%";
      pstm.setString(1, nombre);
      pstm.setString(2, nombre);
      pstm.setString(3, nombre);
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        ClienteModel model = new ClienteModel();
        model.setCodigo(rs.getString("chr_cliecodigo"));
        model.setPaterno(rs.getString("vch_cliepaterno"));
        model.setMaterno(rs.getString("vch_cliematerno"));
        model.setNombre(rs.getString("vch_clienombre"));
        model.setDni(rs.getString("chr_cliedni"));
        model.setCiudad(rs.getString("vch_clieciudad"));
        model.setDireccion(rs.getString("vch_cliedireccion"));
        model.setTelefono(rs.getString("vch_clietelefono"));
        model.setEmail(rs.getString("vch_clieemail"));
        lista.add(model);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }

 public String registraUsuario(String codigo,String paterno,String materno,String nombre,String dni,String ciudad,String direccion,String telefono,String email){
        String respuesta=null;   
        try {
            Connection accesoDB =AccesoDB.getConnection();
            
            PreparedStatement ps = accesoDB.prepareStatement("insert into cliente(chr_cliecodigo,vch_cliepaterno,vch_cliematerno, vch_clienombre, chr_cliedni,vch_clieciudad, vch_cliedireccion,vch_clietelefono,vch_clieemail)values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1,codigo);
            ps.setString(2,paterno);
            ps.setString(3,materno);
            ps.setString(4,nombre);
            ps.setString(5,dni);
            ps.setString(6,ciudad);
            ps.setString(7,direccion);
            ps.setString(8,telefono);
            ps.setString(9,email);

            int rs = ps.executeUpdate();

            if(rs>0){
                respuesta="Registro se guardo exitosamente.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
 
    public String actualizaUsuario(String paterno,String materno,String nombre,String ciudad,String direccion,String telefono,String email,String dni){
        String respuesta=null;   
        try {
            Connection accesoDB =AccesoDB.getConnection();
            
            PreparedStatement ps = accesoDB.prepareStatement("update cliente "
                + "set vch_cliepaterno  = ? "
                + ",vch_cliematerno  = ? "
                + ",vch_clienombre   = ? "
                + ",chr_cliedni      = ? "
                + ",vch_clieciudad   = ? "
                + ",vch_cliedireccion= ? "
                + ",vch_clietelefono = ? "
                + ",vch_clieemail    = ? "
                + "where chr_cliedni = ? ");
                        
            ps.setString(1,paterno);
            ps.setString(2,materno);
            ps.setString(3,nombre);            
            ps.setString(4,ciudad);
            ps.setString(5,direccion);
            ps.setString(6,telefono);
            ps.setString(7,email);
            ps.setString(8,dni);
            int rs = ps.executeUpdate();

            if(rs>0){
                respuesta="Registro se actualizo exitosamente.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
 
    public String eliminaUsuario(String dni){
        String respuesta=null;   
        try {
            Connection accesoDB =AccesoDB.getConnection();
            
            PreparedStatement ps = accesoDB.prepareStatement("delete from cliente where chr_cliedni = ? ");
            ps.setString(1, dni);           

            int rs = ps.executeUpdate();

            if(rs>0){
                respuesta="Registro se elimino exitosamente.";
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
}
