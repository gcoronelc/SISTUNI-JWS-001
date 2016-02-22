package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.ClienteModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba8 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista = service.eliminarCliente("00021");
        System.out.println("Cliente Eliminado");
        /*for(ClienteModel model : lista)
        {
            System.out.println("");
        }*/
    }
}
