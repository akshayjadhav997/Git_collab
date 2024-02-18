package Rest_Assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class post_pojo {
	public static void main(String[] args) {
		
	
	/*{
    "id": 6,"
    "email": "tracey.ramos@reqres.in",
    "first_name": "Tracey",
    "last_name": "Ramos",
    "avatar": "https://reqres.in/img/faces/6-image.jpg"
}
*/
	emppojo obj= new emppojo();
	obj.setAvatar("https://reqres.in/img/faces/6-image.jpg");
	obj.setEmail("tracey.ramos@reqres.in");
	obj.setFirst_name("Tracey");
	obj.setId(6);
	obj.setLast_name("Ramos");
	
	given().contentType(ContentType.JSON).body(obj).when().post("https://reqres.in/api/users");
	
	

}
}
