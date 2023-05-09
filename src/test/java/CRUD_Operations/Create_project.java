package CRUD_Operations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_project {
	
	@Test
	public void project() {
		JavaUtility jlib=new JavaUtility();
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "deepa");
		jObj.put("projectName", "xyz"+jlib.random());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		
		RequestSpecification req=RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		
	 Response response = req.post("http://rmgtestingserver:8084/addProject");
	 response.then().log().all();
	 System.out.println(response.asString());
	 System.out.println(response.getStatusCode());
	 System.out.println(response.getContentType());
	 System.out.println(response.getStatusLine());
	 System.out.println(response.getTime());
	
	 
	 //1.giving the pre-requisite
	 //2.actions
	 //3.validations
	 
		
		
	}

}
