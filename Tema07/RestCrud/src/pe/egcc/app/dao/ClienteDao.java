package pe.egcc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.egcc.app.db.AccesoDB;
import pe.egcc.app.domain.ClienteModel;

public class ClienteDao {

  public List<ClienteModel> getAll(){
    List<ClienteModel> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno, "
          + "vch_cliematerno, vch_clienombre, chr_cliedni, "
          + "vch_clieciudad, vch_cliedireccion, "
          + "vch_clietelefono, vch_clieemail "
          + "from cliente";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        ClienteModel bean = rowToBean(rs);
        lista.add(bean);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        cn.close();
      } catch (Exception e2) {
      }
    }
    return lista;
  }

  public List<ClienteModel> getClientes(ClienteModel model){
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
          + "and  vch_cliematerno like ? "
          + "and vch_clienombre like ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, model.getPaterno() + "%");
      pstm.setString(2, model.getMaterno() + "%");
      pstm.setString(3, model.getNombre() + "%");
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        ClienteModel bean = rowToBean(rs);
        lista.add(bean);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        cn.close();
      } catch (Exception e2) {
      }
    }
    return lista;
  }
  
  
  private ClienteModel rowToBean(ResultSet rs) throws SQLException {
    ClienteModel bean = new ClienteModel();
    bean.setCodigo(rs.getString("chr_cliecodigo"));
    bean.setPaterno(rs.getString("vch_cliepaterno"));
    bean.setMaterno(rs.getString("vch_cliematerno"));    
    bean.setNombre(rs.getString("vch_clienombre"));
    bean.setDni(rs.getString("chr_cliedni"));
    bean.setCiudad(rs.getString("vch_clieciudad"));
    bean.setDireccion(rs.getString("vch_cliedireccion"));
    bean.setTelefono(rs.getString("vch_clietelefono"));
    bean.setEmail(rs.getString("vch_clieemail"));
    return bean;
  }
  
}
