package CRUD_operation_With_BDD;

import org.json.simple.JSONObject;
import org.openqa.selenium.remote.RemoteWebDriver.When;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;


import PojoClass.JavaUtility;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import  io.restassured.http.ContentType;

public class CreateProject {
	
	
	@Test
	public void create123() {
		baseURI="http://rmgtestingserver";
		port=8084;
		JavaUtility jlib=new JavaUtility();
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "deepa");
		jObj.put("projectName", "xyz"+jlib.random());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
		//pre-conditions
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//actions
		.when()
		.post("/addProject")
		
	   //validations
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(4000L),TimeUnit.MILLISECONDS)
		.log().all();

	}

	
}
