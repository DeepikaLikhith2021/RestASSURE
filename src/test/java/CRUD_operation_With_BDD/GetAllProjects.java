package CRUD_operation_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class GetAllProjects {
	@Test
	public void getall123() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
	    when()
		.get("/projects")
		
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();

	}


}
