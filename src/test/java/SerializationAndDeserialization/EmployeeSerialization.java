package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetails;


public class EmployeeSerialization {
	@Test
	public void employeeseri() throws Throwable, JsonMappingException, IOException {
		EmployeeDetails data=new EmployeeDetails("deepa",123,"deepa@gmail.com",72591936);
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./emp.json"), data);
		
		
	}

}
