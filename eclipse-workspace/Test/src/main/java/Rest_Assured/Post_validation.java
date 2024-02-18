package Rest_Assured;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Post_validation {
public static void main(String[] args) {
	//RestAssured response= new RestAssured();
	/*
	 {
   "page": 2,
   "per_page": 6,
   "total": 12,
   "total_pages": 2,
   "data": [
       {
           "id": 7,
           "email": "michael.lawson@reqres.in",
           "first_name": "Michael",
           "last_name": "Lawson",
           "avatar": "https://reqres.in/img/faces/7-image.jpg"
       }
} 
	 */
	pojoc pj=new pojoc();
	pj.setAvatar("https://reqres.in/img/faces/7-image.jpg");
	pj.setEmail("michael.lawson@reqres.in");
	pj.setFirst_name("Michael");
	pj.setLast_name("Lawson");
	pj.setId(7);
	
	given().contentType(ContentType.JSON).body(pj).auth().none()
	.when().post("https://reqres.in/api/users")
	.then().statusCode(200);
}
}
