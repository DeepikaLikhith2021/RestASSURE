package CRUD_Operations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTheProject {
	
	@Test
	
	public void deleteTheProject() {
		
		Response respo=RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_5101");
	respo.then().log().all();
	int actStatus=respo.getStatusCode();
	Assert.assertEquals(204, actStatus);
		
		
	}

}
