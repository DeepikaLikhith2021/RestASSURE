package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetailsInArray;

public class SerializationWithArray {
	@Test
	public void employSerial() throws Throwable, JsonMappingException, IOException {
		long[] mobno= {7418525,74152585,9612626};
		EmployeeDetailsInArray empArr=new EmployeeDetailsInArray("deepa",125,"deepa@gmail.com",mobno);
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./empArray.json"), empArr);
		
	}

}
