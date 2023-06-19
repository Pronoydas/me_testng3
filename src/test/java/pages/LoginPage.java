package pages;

public class LoginPage {
	String userName;
	String password;
	
	public void enterUserName(String userName) {
		System.out.println("Entering UserName : " +userName);
		this.userName=userName;
		
	}
	
	public void enterPassword(String password) {
		System.out.println("Entering password : " +password);
		this.password=password;
	}

	public boolean clickBtnLogin() {
		System.out.println("clicking on login button"+" "+userName +" "+ password);
		return true;
	}
}
