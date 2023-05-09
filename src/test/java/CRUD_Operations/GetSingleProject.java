package CRUD_Operations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	
	
	public void getSingle() {
		Response respo=RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_4889");
respo.then().log().all();
int actStatus=respo.getStatusCode();
Assert.assertEquals(200, actStatus);
	
	}

}
