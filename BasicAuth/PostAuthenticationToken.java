package BasicAuth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PostAuthenticationToken {

	public static void main(String[] args) {
		
		 baseURI="https://api.github.com";
		  
		 JSONObject obj=new JSONObject();
		   obj.put("name","BasicAuth");
		  
		  given().auth().oauth2("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")
		  .body(obj).contentType(ContentType.JSON)
		   .when().post("/user/repos")
		   .then().log().all();
	}

}
