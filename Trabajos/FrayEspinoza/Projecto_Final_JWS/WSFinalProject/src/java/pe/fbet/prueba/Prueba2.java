package pe.fbet.prueba;

import java.util.List;
import pe.fbet.model.EmpleadoModel;
import pe.fbet.service.EurekaService;

/**
 *
 * @author FRAY ESPINOZA TARAZONA
 */
public class Prueba2 
{
    public static void main(String[] args) 
    {
        EurekaService service = new EurekaService();
        List<EmpleadoModel> lista = service.obtenerEmpleado("R");
        for (EmpleadoModel model : lista)
        {
            System.out.println(model.getCODIGO() + "|" + model.getPATERNO() + "|" + model.getMATERNO() + "|" + model.getNOMBRE());
        }
    }
}
