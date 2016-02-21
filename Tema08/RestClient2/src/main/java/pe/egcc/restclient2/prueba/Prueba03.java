package pe.egcc.restclient2.prueba;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

  public static void main(String[] args) {

    try {

      Client client = Client.create();

      WebResource webResource = client.resource("http://localhost:8081/restcrud/rest/clientes");

      String input = "{\"codigo\":\"00024\",\"paterno\":\"CORONEL\",\"materno\":\"CASTILLO\",\"nombre\":\"ERIC GUSTAVO\",\"dni\":\"06914897\",\"ciudad\":\"CHICLAYO\",\"direccion\":\"LOS OLIVOS\",\"telefono\":\"9666-4457\",\"email\":\"gcoronel@algo.com\"}";

      ClientResponse response = webResource.type("application/json").put(ClientResponse.class, input);

      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }

      System.out.println("Output from Server .... \n");
      String output = response.getEntity(String.class);
      System.out.println(output);

    } catch (Exception e) {

      e.printStackTrace();

    }

  }

}
