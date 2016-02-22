package pe.mcg.ws.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class Mensaje 
{
	private static final String BUNDLE_NAME = Constantes.RUTA_CONFIG_PROPERTIES;
	private static final ResourceBundle RESOURCE_BUNDLE_NAME = ResourceBundle
			.getBundle(BUNDLE_NAME);

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE_NAME.getString(key);
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
		return null;
	}

}
