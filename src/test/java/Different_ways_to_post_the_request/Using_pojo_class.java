package Different_ways_to_post_the_request;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Create_project.Create_project1;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Using_pojo_class {
	
	@Test
	public void creatingProject() throws Throwable, JsonMappingException, IOException {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		JSONObject jobj=new JSONObject();
		Create_project1 cp=new Create_project1("deepa1","xyz121234567","completed",12);
//		ObjectMapper omap=new ObjectMapper();
//		omap.writeValue(new File("./createprojectusingpojo.json"), cp);
		

given()
.body(cp).contentType(ContentType.JSON)

.when()
.post("/addProject")

.then()
.log().all();


		
		
//		
		
		
		
		
		
	}

}
