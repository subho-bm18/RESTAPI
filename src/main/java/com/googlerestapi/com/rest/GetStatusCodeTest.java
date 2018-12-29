package com.googlerestapi.com.rest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class GetStatusCodeTest {

  @BeforeClass
  public void setBaseUri () {

    RestAssured.baseURI = "https://maps.googleapis.com";
  }

  @Test
  public void testStatusCode () {
    
    Response res = 
    given ()
    .param ("query", "restaurants in mumbai")
    .param ("key", "Xyz")
    .when()
    .get ("/maps/api/place/textsearch/json");

    Assert.assertEquals (res.statusCode (), 200);
    System.out.println(res.statusCode ());
  }

@Test
public void testStatusCodeRestAssured () {

given ().param ("query", "restaurants in mumbai")
        .param ("key", "Xyz")
        .when()
        .get ("/maps/api/place/textsearch/json")
        .then ()
        .assertThat ().statusCode (200);
         //System.out.println(statusCode ());

}
}
