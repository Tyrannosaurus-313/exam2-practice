package problem1and2;

public class User {
	private String userName;
	private String email;
	private String password;
	
	public String getUserName() 	{ return userName; }
	public String getEmail() 		{ return email; }
	public String getPassword() 	{ return password; }

	public void setUserName(String userName) { this.userName = userName; }
	public void setEmail(String email) 		 { this.email = email; }
	public void setPassword(String password) { this.password = password; }
	
	public User() {}
	
	public User(String userName, String email, String password) {
		setUserName(userName);
		setEmail(email);
		setPassword(password);
	}
	
	public User(String[] line) {
		setUserName(line[0]);
		setEmail(line[1]);
		setPassword(line[2]);
	}
}
