package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook1 {

	@Before
	public void Login() {
		System.out.println("I am login");
	}
	@After
	public void Logout() {
		System.out.println("I am logout");
	}
}
