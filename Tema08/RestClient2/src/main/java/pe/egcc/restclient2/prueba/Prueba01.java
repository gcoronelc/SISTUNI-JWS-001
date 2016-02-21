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
public class Prueba01 {

  public static void main(String[] args) {

    try {
      
      Client client = Client.create();
      WebResource webResource = client.resource("http://localhost:8081/restcrud/rest/clientes/00004");
      ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }

      System.out.println("Output from Server .... \n");
      String rptaJson = response.getEntity(String.class);
      System.out.println(rptaJson);

    } catch (Exception e) {

    }
  }

}
