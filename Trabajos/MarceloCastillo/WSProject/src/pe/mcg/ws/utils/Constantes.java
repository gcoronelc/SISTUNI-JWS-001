package pe.mcg.ws.utils;

import pe.mcg.ws.utils.Mensaje;

public class Constantes {


	public static final String RUTA_CONFIG_PROPERTIES = "connection";

	//PARAMETROS DE CONEXION A BASE DE DATOS
	public static final String jdbc_driver = Mensaje.getString("jdbc.driver");
	public static final String jdbc_url = Mensaje.getString("jdbc.url");
	public static final String jdbc_username = Mensaje.getString("jdbc.user");
	public static final String jdbc_password = Mensaje.getString("jdbc.password");
	
	public static final int CERO = 0;
	public static final int UNO = 1;
	public static final int DOS = 2;
	public static final int TRES = 3;
	public static final int CUATRO = 4;
}
