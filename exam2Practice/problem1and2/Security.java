package problem1and2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Security {
	private String fileLoc = "users.txt";
	private User[] users = new User[100];
	
	public User[] getUser() 	{ return users; }
	public String getFileLoc() 	{ return fileLoc; }
	
	public void loadUsers() throws FileNotFoundException, IOException {
		FileReader reader = new FileReader(fileLoc);
		Scanner scnr = new Scanner(reader);
		scnr.nextLine(); //Skip file header
		
		for (int i = 0; i < users.length; i++) {
			if (scnr.hasNext())
				users[i] = new User(scnr.nextLine().split(","));
		}
		
		scnr.close();
		reader.close();			
	}

	public void showUsers() {
		System.out.printf("UserName      Password      EMail\n");
		System.out.printf("-----------   ------------  --------------------\n");
		for (int i = 0; i < users.length && users[i] != null; i++) {
			System.out.printf("%-12s  %-12s  %-26s\n", 
					users[i].getUserName(), users[i].getPassword(), users[i].getEmail());
		}
	}
}
