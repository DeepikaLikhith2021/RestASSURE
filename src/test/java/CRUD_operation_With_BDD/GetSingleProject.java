package CRUD_operation_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class GetSingleProject {
	
	@Test
	public void getsingle123() {
		baseURI="http://rmgtestingserver";
		port=8084;


		
		when()
		.get("/projects/TY_PROJ_4663")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
		

}
}
