package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.ClienteModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba4 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista = service.busquedaCliente("00020");
        for (ClienteModel model : lista)
        {
            System.out.println(model.getPATERNO() + "|" + model.getMATERNO() + "|" + model.getNOMBRE());
        }
    }
}
