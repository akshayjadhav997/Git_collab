package Rest_Assured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;

public class Get {

public static void main(String[] args) {
	
	//https://api.github.com/users/zellwk/repos
	RestAssured response= new RestAssured();
	int accesst= 200;
	
	given().baseUri("https://api.github.com").auth().basic("username", "password")
    .when().get("users/zellwk/repos")
    .then().statusCode(accesst);
    
	int st = response.get("https://api.github.com/users/zellwk/repos").statusCode();
	System.out.println(st);
	//Assert 
	long time= response.get("https://api.github.com/users/zellwk/repos").getTime();
    System.out.println(time);	
    Assert.assertNotEquals(st, 200);
    String cokkies= response.given().when().get("https://api.github.com/users/zellwk/repos").getCookie(DEFAULT_BODY_ROOT_PATH);
    System.out.println(cokkies);
}
}
