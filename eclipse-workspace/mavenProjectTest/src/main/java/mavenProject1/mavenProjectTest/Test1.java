

package mavenProject1.mavenProjectTest;

import io.restassured.RestAssured;

public class Test1 {
	
	  public static void main(String[] args) {

	        System.out.println("Hello, World!");

	    RestAssured.baseURI = "https://api.github.com/users/zellwk/repos";

	    Response response = RestAssured.given().when().get("/post/1");

	    long responseTime = response.time();

	    System.out.println("Response time : "+responseTime +" milli seconds");

	    System.out.println("response body =");

	    System.out.println(response.getBody().asString());

	    int statusCode = response.getStatusCode();

	    if(statusCode == 201){

	        System.out.println("status code mathc ="+statusCode); 

	    }

	  }
}


