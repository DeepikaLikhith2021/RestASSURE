package Different_ways_to_post_the_request;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.http.ContentType;

public class UsingHashMap {
	
	@Test
	
	public void map1() {
		baseURI="http://rmgtestingserver";
		port=8084;
		HashMap jObj=new HashMap();
		JavaUtility jlib=new JavaUtility();
		jObj.put("createdBy", "deepa");
		jObj.put("projectName", "xyz"+jlib.random());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 12);
		
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
		//.time(Matchers.lessThan(4000L),TimeUnit.MILLISECONDS)
		.log().all();
		
	}

}
