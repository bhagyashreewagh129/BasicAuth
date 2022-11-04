package Operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import io.restassured.http.ContentType;

public class GetByID extends BaseClass {
	@Test
	public void getById()
	{
		baseURI="http://localhost:8080";
		when()
		.get("/user/1")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().body("data.name", equalTo("Shree Patil"))
		.log().all();
	}

}
