package com.info.demo.SpringBootDemo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.info.demo.springbootdemo.SpringBootDemoApplication;
import org.skyscreamer.jsonassert.JSONAssert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeDetailsControllerTest {

	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testRetrieveStudentCourse() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/employee/details"),
				HttpMethod.GET, entity, String.class);

		
		//String expected = "{id:123, name:\"John\"}";
		String expectedJSON = "{\n" +
	            "  \"message\": \"Connection ok\",\n" +
	            "  \"status\": \"success\"\n" +
	            "}";
		
		JSONObject obj=new JSONObject();
		obj.put("id", 123);
		obj.put("name", "amit");
		
		JSONArray jarray=new JSONArray();
		jarray.put(jarray);

		JSONAssert.assertEquals(jarray.toString(), response.getBody(), false);
	}
	
	
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}






