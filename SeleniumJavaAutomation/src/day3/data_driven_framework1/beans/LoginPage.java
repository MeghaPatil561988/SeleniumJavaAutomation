package day3.data_driven_framework1.beans;

public class LoginPage {

	/*public LoginPage(String userName2, String password2) {
		
	}*/
	private String userName;
	public LoginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginPage [userName=" + userName + ", password=" + password + "]";
	}

	
}
