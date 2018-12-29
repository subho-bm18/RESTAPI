package com.googlerestapi.com.rest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;







public class RestExtract {
	
	public static Response dogetReq(String endPoint)
	{
		RestAssured.defaultParser = Parser.JSON;
		return 
				given().headers("Content-Type",ContentType.JSON,
						"Accept",ContentType.JSON).
				when().get(endPoint).
				then().contentType(ContentType.JSON).extract().response();
		
	}
	
	public static void main(String args[])
	{
		
		Response resp = dogetReq("https://jsonplaceholder.typicode.com/users");
		int code=resp.getStatusCode();
		System.out.println("Status Code"+code);
		List<String> jsonresponse = resp.jsonPath().getList("$");
		Stream<List<String>> streamResp =  Stream.of(jsonresponse);
		//System.out.println(jsonresponse);
		//jsonresponse.stream().map(String::toUpperCase)
		//.peek(System.out::println).collect(toList());
		
		streamResp.forEach(s->System.out.println(s));
		
		List<String> jsonreponse1 =  resp.jsonPath().getList("username");
		System.out.println(jsonreponse1);
		List<String> jsonreponseadd =  resp.jsonPath().getList("address");
		System.out.println(jsonreponseadd);
		
		Map<String,String>company =  resp.jsonPath().getList("company");
        //String companyName= company.get("name");
        
        System.out.println(company);
        //System.out.println(companyName);


		//Map<String,String> jsonreponseadd =  resp.jsonPath().getList("address");
		//System.out.println(jsonreponseadd.get("geo"));
		
		
		

		
	}
	

}
