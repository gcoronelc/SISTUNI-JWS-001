package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.MovimientoModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba6 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<MovimientoModel> lista = service.obtenerMovimiento("00200001");
        for(MovimientoModel model : lista)
        {
            System.out.println(model.getPATERNO() + "|" + model.getMATERNO()+ "|" + model.getNOMBRE()+ "|" + model.getMOVINUMERO()+ "|" + model.getMOVIIMPORTE());
        }
    }
}
