package restassureScripts;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SetupCheck {
	
	@Test
	public void setupCheck()
	{
		// this is httpd get method
		
	Response res =	RestAssured.get("https://reqres.in/api/users/2"); // you will send a request
		
	System.out.println(res.asString()); // convert the response into the string
	
	System.out.println(res.getStatusCode());
	
	
		
		
		
	}
	

}

output:
[RemoteTestNG] detected TestNG version 7.7.1
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
{"data":{"id":2,"email":"janet.weaver@reqres.in","first_name":"Janet","last_name":"Weaver","avatar":"https://reqres.in/img/faces/2-image.jpg"},"support":{"url":"https://reqres.in/#support-heading","text":"To keep ReqRes free, contributions towards server costs are appreciated!"}}
200
PASSED: restassureScripts.Script001SetupCheck.setupCheck

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================

