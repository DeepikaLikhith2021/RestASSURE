package Different_ways_to_post_the_request;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class JsonObject {
	
	@Test
	public void jsonObjectype() {
		baseURI="http://rmgtestingserver";
		port=8084;
		JSONObject jObj=new JSONObject();
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
