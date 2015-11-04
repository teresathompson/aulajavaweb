package aulajavaweb.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

public final class RequestBuilder {
	
	public static Builder create(String path) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://www.mocky.io");		
		return target.path(path).request();
	}
	
}
