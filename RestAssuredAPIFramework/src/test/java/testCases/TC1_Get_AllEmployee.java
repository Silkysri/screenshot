package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;


public class TC1_Get_AllEmployee extends TestBase{

	@BeforeClass
	void getAllEmployees() throws InterruptedException
	{
		logger.info("started TC1_get all employeess......");
		
RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		req = RestAssured.given();
		res = req.get();
		res = req.request(Method.GET, "/employees");
		
	Thread.sleep(3);
	
	
	
	
		}
	@Test
	void checkstatuscode() {
		
		logger.info("checking status code......");
		
		logger.info("status code :  " + res.getStatusCode());
		
		Assert.assertEquals(res.getStatusCode(), 200);
	
		//System.out.println("Pass");
		
		
	}
	
	@Test
	void checkstatusline() {
logger.info("checking status Line......");
		
		logger.info("status line :  " + res.getStatusLine());
		
		Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK" );
		
	}
	
	@Test
	void checkstatusbody() {
		
		logger.info("checking status body......");
		
		
		logger.info("status body :  " + res.getBody().asString());
		String bo = res.getBody().asString();
		Assert.assertTrue(bo!=null);
		
		
		
		
		
	}	
	
	@Test
	void checkresponsetime() {
logger.info("checking response time......");
		
		logger.info("response time :  " + res.getTime());
		
		Assert.assertTrue(res.getTime()<=5000);
		
	}
	
	
}
