import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC4_DataDriven_NewEmployee {
	
	@Test(dataProvider = "empdataprovider")
	public void AddNewEmp(String ename, String sal, String eage)
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		RequestSpecification req = RestAssured.given();
		
		JSONObject reqp = new JSONObject();
		
		reqp.put("name", ename);
		reqp.put("salary", sal);
		reqp.put("age", eage);
		
		
		req.header("Content-Type", "application/json");
		req.body(reqp.toJSONString());
		
		Response res = req.request(Method.POST, "/create");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println("pass");
		
		String r = res.getBody().asString();
		System.out.println(r);
		
		
	}

	@DataProvider(name="empdataprovider")
	String [][] NewEmpInfo()
	{
			
		String empdata[][] = {{"one","1000","11"}, {"two","2000","22"},{"three","3000","33"}};
		return empdata;
	}
}
