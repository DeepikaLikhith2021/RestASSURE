package CRUD_operation_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.http.ContentType;

public class UpdateProject {
	
	
	@Test
	public void updateProject() {
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility jlib=new JavaUtility();
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "deepa");
		jObj.put("projectName", "xyz123sds4");
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		//pre-conditions
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//actions
		.when()
		.put("/projects/TY_PROJ_5232")
		
		
		//validations
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();

	}
}
