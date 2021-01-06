import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC3_Get_Authentication {
	
	@Test
	public void userauth() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
		PreemptiveBasicAuthScheme pa= new PreemptiveBasicAuthScheme();
		pa.setUserName("ToolsQA");
		pa.setPassword("TestPassword");
		RestAssured.authentication=pa;
		
		RequestSpecification req = RestAssured.given();
		
		Response res = req.request(Method.GET, "/");
		
		System.out.println(res.getStatusCode());
		
	//	Assert.assertEquals(res.getStatusCode(), 201);
		
		//	System.out.println("tc pass kitta");
			
			SoftAssert sa = new SoftAssert();
			
			sa.assertEquals(res.getStatusCode(), 201);
			sa.fail();
			
		System.out.println("tc pass kitta");
			
		
		
		
	}

}
