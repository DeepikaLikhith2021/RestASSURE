package CRUD_Operations;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProject {
	
	
	@Test
	public void getAllProjects() {
		
		
//			JavaUtility jlib=new JavaUtility();
//			JSONObject jObj=new JSONObject();
			//RequestSpecification req=RestAssured.given();
//			req.body(jObj);
			//req.contentType(ContentType.JSON);
			
			Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
		    // Response response = req.get("http://rmgtestingserver:8084/projects");
		 response.then().log().all();
		 int actStatus=response.getStatusCode();
		 Assert.assertEquals(200, actStatus);
		
	}

}


	