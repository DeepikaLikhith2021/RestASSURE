package CRUD_Operations;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {
	
	@Test
	
	public void updateProject() {
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "deepa");
		jObj.put("projectName", "xyz1");
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		RequestSpecification req=RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		
	 Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_5095");
	 response.then().log().all();
	 int actstatus=response.getStatusCode();
	 Assert.assertEquals(actstatus, 200);
		
	}

}
