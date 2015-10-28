package aulajavaweb.util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public final class RestClient {
	
	public enum RequestType {
		
		GET((byte) 1, "GET"),
		PUT((byte) 2, "PUT"),
		POST((byte) 3, "POST"),
		DELETE((byte) 4, "DELETE");
		
		private Byte code;
		private String description;
		
		private RequestType(byte c, String d) {
			code = c;
			description = d;
		}
		
		public Byte getCode() {
			return code;
		}
		
		public String getDescription() {
			return description;
		}
		
		public RequestType getByCode(int code) {
			return getByCode((byte) code);
		}
		
		public RequestType getByCode(byte code) {
			for(RequestType rt : values()) {
				if(rt.code == code) return rt; 
			}
			return null;
		}
		
		public RequestType getByDescription(String desc) {
			for(RequestType rt : values()) {
				if(rt.description.equalsIgnoreCase(desc)) return rt; 
			}
			return null;
		}
		
	}
	
	public static ClientResponse create(String url, String method) {
		Client client = Client.create();
		WebResource webResource = client.resource(url);
		if(method == null) {
			return webResource.get(ClientResponse.class);
		} else {
			return webResource.get(ClientResponse.class);
		}
	}
	
	private void validate(ClientResponse response) {
		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}
	}
	
	public <T> T get(ClientResponse response, Class<T> clazz) {
		validate(response);
		return response.getEntity(clazz);
	}

}
