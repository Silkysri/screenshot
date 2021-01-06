import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC5_DDTExcel {
	
	@Test(dataProvider = "aempdataprovider")
	void AddNewEmp(String ename, String sal, String eage)
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

	@DataProvider(name="aempdataprovider")
	public String [][] NewEmpInfo() throws IOException
	{
	
		String path= System.getProperty("user.dir")+ "/src/test/java/EMPDATA.xls";
		
		int rowc= XLUtilsoo.getRowCount(path,"Sheet1");
		
		int colc = XLUtilsoo.getCellCount(path, "Sheet1", 1);
		
		
		String empdata[][] = new String[rowc][colc];
		
		for(int i=1; i<=rowc; i++)
		{
			for (int j=0;j<colc; j++)
			{
				empdata[i-1][j] = XLUtilsoo.getCellData(path, "Sheet1", i, j);
				
				
			String a = String.valueOf(empdata[i-1][j]);
			empdata[i-1][j]=a;
			
			System.out.println(empdata[i-1][j]);
			}
		}
			
		return (empdata);
		
		//String empdata[][] = {{"we","1000","11"}, {"twro","2000","22"},{"threeee","3000","33"}};
		//return empdata;
		
		
	}

}
