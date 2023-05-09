package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetails;

public class EmployeeDeserialization {
	
	@Test
	public void desirializationEmployee() {
		ObjectMapper omap=new ObjectMapper();
		//EmployeeDetails data=omap.readValues(new File("./emp.json"), omap);
		
	}

}
