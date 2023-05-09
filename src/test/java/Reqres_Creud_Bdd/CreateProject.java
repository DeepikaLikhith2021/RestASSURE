package Reqres_Creud_Bdd;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoClass.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class CreateProject {
	@Test
	public void create() {
		
		JSONObject jobj=new JSONObject();
		JavaUtility jlib=new JavaUtility();
		jobj.put("name", "morpheus"+jlib.random());
		jobj.put("job", "leader");
		
		
		given()
		.body(jobj).contentType(ContentType.JSON)
		
		.when().post("https://reqres.in/api/users")
		.then().log().all().assertThat().statusCode(201).time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);
		
		
		
	}

}
