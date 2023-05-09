package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetailsInArray;

public class DeserializationWithArray {
	@Test
	
	public void empDeserial() throws Throwable, JsonMappingException, IOException 
	{
		ObjectMapper omap=new ObjectMapper();
		EmployeeDetailsInArray data=omap.readValue(new File("./empArray.json"), EmployeeDetailsInArray.class);
		System.out.println(data.getName());
		System.out.println(data.getEmpId());
		System.out.println(data.getMailId());
		System.out.println(data.getMobno()[0]);
		
	}

}
