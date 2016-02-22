package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.ClienteModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba1 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista = service.obtenerClientes("E");
        for (ClienteModel model : lista)
        {
            System.out.println(model.getCODIGO() + "|" + model.getNOMBRE() + "|" + model.getPATERNO() + "|" + model.getMATERNO());
        }
        
    }
}
