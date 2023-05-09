package CRUD_Operations;

import org.asynchttpclient.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Cp {
	
	@Test
	
	public void createProject() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("ghj", "fgh");
		
		
		RequestSpecification rest=RestAssured.given();
		
	}

}
