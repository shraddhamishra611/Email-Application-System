package Projects;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity = 100;
	private String alternateEmail;
	private String comName = "Google.com";
	private String changePassword;
	
	// Constructor to accept first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email account created for: " + this.firstname +" " + this.lastname);
		
		//call the method for the department setup
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = setPassword(8);
		System.out.println("Your password is: " + this.password);
		
		
	}
	
	// ask for department
	private String setDepartment() {
		System.out.print("Department codes:\n1) Sales \n2) Development \n3) Accounting \n0) None\nEnter department code ");
		Scanner scanner = new Scanner(System.in);
		int department = scanner.nextInt();
		scanner.close();
		if(department == 1) { return "Sales"; }
		else if(department == 2) { return "Development"; }
		else if(department == 3) { return "Accounting"; }
		else if(department == 0) { return " "; }
		else { return " ";}
		
	}
	
	// generate a random password
	private String setPassword(int length) {
		String passwordChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$*%!";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int random = (int) (Math.random() * passwordChar.length());
			password[i] = passwordChar.charAt(random);
			
		}
		return new String(password);
	}
	
	// set the mailbox capacity
	public int setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		return mailboxCapacity;
	}
	
	// set the alternate email
	public String setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
		return alternateEmail;
	}
	
	// change the password
	public String changePassword(String password) {
		this.changePassword = password;
		return changePassword;
	}
	
	public void info() {
		System.out.println("Name: " + this.firstname + " " + this.lastname);
		System.out.println("Email address is: " + this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() + "@" + this.department + "." + comName );
		System.out.println("Your mail box capacity is: " + mailboxCapacity + "mb");
	}
}
