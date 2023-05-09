package CRUD_operation_With_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Cp {
	
@Test	
	
	public void create() {
	
	JSONObject jObj=new JSONObject();
	jObj.put("ssds", "scxc");
	
	
	
	given()
	.body(jObj)
	.contentType(ContentType.JSON);
	
	when()
	.post("gghj")
	
	
	.then()
	.assertThat()
	.statusCode(200)
.log().all();	
	
	
	
	
	
	
		
	}

}
