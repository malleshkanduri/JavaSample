package tranformation;

import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import tranformation.testData.BuildTestData;
import tranformation.testData.StudentVO;

public class JsonToJava {
	static public void main(String str[]) throws JsonGenerationException, JsonMappingException, IOException {
		JsonToJava json = new JsonToJava();
		json.jsonStringToJava();
	}
	
	public String javaToJsonString() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		StringWriter writer = new StringWriter();
		
		mapper.writeValue(writer, BuildTestData.getStudentVo());
		System.out.println("Java to Json String - " + writer.toString());
		return writer.toString();
	}
	
	public void jsonStringToJava() throws JsonParseException, JsonMappingException, JsonGenerationException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		StudentVO studentVO = mapper.readValue(javaToJsonString(), StudentVO.class);
		System.out.println("Json String to Java - " + studentVO);
	}
}
