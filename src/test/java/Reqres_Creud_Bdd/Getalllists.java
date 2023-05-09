package Reqres_Creud_Bdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Getalllists {
	@Test
	public void getall() {
		
		
		
		JSONObject jobj=new JSONObject();
		when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200);
		
		
		
		
	}

}
