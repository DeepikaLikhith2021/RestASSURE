package CRUD_operation_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject {
	
	@Test
	public void getsingle123() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
         when()
		.delete("/projects/TY_PROJ_5228")
		
		.then()
		.assertThat()
		.statusCode(204)
		.contentType(ContentType.JSON)
		.log().all();
         
         
         
   }

}
