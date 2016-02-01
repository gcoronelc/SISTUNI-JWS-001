package pe.egcc.prueba;

import java.util.List;
import pe.egcc.model.ClienteModel;
import pe.egcc.service.EurekaService;

/**
 *
 * @author GustavoCoronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    EurekaService service = new EurekaService();
    List<ClienteModel> lista = service.obtenerClientes("E");
    for (ClienteModel model : lista) {
      System.out.println(model.getCodigo() + " | "
              + model.getNombre() + " | "
              + model.getPaterno() + " | "
              + model.getMaterno());
    }
  }

}
