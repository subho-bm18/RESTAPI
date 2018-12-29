package com.googlerestapi.com.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import io.restassured.http.ContentType;

public class RestAssuredSerialization {

	
@Test
public void testRestAssuredSerializationJSON() {

	 
	SerializationClass sc= new SerializationClass("Simba",201,"U/A","A+","29/12/2018","5");
	//Response res = 
	given().
	contentType("application/json").
	body(sc).
	when().
	post("http://localhost:8080/videogames").
	then().
    assertThat().statusCode (200);
    //System.out.println(statusCode ());
	
	
}

}
