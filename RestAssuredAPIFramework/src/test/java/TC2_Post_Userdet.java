import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_Post_Userdet {
	
	@Test
	void RegisterSuccessful() {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RequestSpecification req = RestAssured.given();
		
		JSONObject reqp = new JSONObject();
		
		/*reqp.put("id", "23");
		reqp.put("employee_name", "Twenty Three");
		reqp.put("employee_salary", "23000");
		reqp.put("employee_age", "23");
		reqp.put("profile_image", "");*/
		
		reqp.put("name", "vvv");
		reqp.put("salary", "23000");
		reqp.put("age", "23");
		
		
		req.header("Content-Type", "application/json");
		req.body(reqp.toJSONString());
		
        Response res = req.request(Method.POST, "/create");
	//	Response res = req.request(Method.DELETE, "/");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
		System.out.println("pass v");
		System.out.println(res.getStatusLine());
	
		
		String r = res.getBody().asString();
		System.out.println(r);
		
		
		
		
	}
	

}
