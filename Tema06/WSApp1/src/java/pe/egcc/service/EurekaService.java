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
              + "or vch_clienombre like ? ";
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

}
