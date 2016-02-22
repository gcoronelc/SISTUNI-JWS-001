package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.ClienteModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba9 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<ClienteModel> lista = service.actualizarCliente("ESPINOZA","TARAZONA","FRAY","47745604","LIMA","CALLE LOS CLAVELES ETAPA I","5200241","FRAYESPTAR_25@HOTMAIL.COM","00021");
        System.out.println("Datos del Cliente Actualizado");
        /*for(ClienteModel model : lista)
        {
            System.out.println("");
        }*/
    }
}
