package aulajavaweb.http;

import java.io.IOException;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {

	public static void main(String...args) throws IOException {
		String url = "http://localhost:8080/aulajavaweb/rest/model/all";

		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			ClientResponse response = webResource.get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			
			System.out.println("Output from Server .... \n" + response.getEntity(String.class));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
