package DTO;

public class User {
	private String fname;
	private String lname;
	private int age;
	private String email;
	private long contact;
	private String adress;
	
	public User() {
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", age=" + age + ", email=" + email + ", contact="
				+ contact + ", adress=" + adress + "]";
	}
	
	
	
	
	
}
