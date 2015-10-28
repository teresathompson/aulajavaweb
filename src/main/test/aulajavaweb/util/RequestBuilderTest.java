package aulajavaweb.util;

import org.jboss.resteasy.client.jaxrs.internal.ClientInvocationBuilder;
import org.junit.Test;

public class RequestBuilderTest {

	@Test
	public void test() {
		ClientInvocationBuilder request = (ClientInvocationBuilder) RequestBuilder.create("v2/5627c93f27000026276eec7f");
		String result = request.get(String.class);
		System.out.println(result);
	}
	
}
