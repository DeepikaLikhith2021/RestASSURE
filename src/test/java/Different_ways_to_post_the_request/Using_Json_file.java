package Different_ways_to_post_the_request;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Using_Json_file {
	@Test
	
	    public void file() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		File file=new File("./emp.json");
		
		
		given()
		.body(file).contentType(ContentType.JSON)
		
		
		.when().post("/addProject")
		
		.then()
		.log().all();
		
		
		
		
		
		
		
		
	}

}
