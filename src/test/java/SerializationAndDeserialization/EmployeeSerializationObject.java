package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetailsWithSpouse;
import PojoClass.Spouse;

public class EmployeeSerializationObject {
	
@Test	
	public void EmployeeDetailsWithSpou() throws Throwable, JsonMappingException, IOException {
		long[] mbn= {7452556,7415854};
		Spouse sp=new Spouse("deepa",mbn);
		
		
		EmployeeDetailsWithSpouse eds=new EmployeeDetailsWithSpouse("deepa",6541252,sp);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./spouse.json"), eds);
		
		
	}

}
