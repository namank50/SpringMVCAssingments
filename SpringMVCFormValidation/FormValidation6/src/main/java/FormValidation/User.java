package FormValidation;

import javax.validation.constraints.*;

public class User {
	
	@NotBlank(message="username cannot be blank")
	@Size(min=8,max=16,message="User Name must be in 8-16")
	String username;
	@NotBlank
	@Size(min=8,max=20,message="password must be 8 to 20")
	@Pattern(regexp="^[a-zA-Z0-9]{8}")
	String password;
	@Email
	String email;
	long contact;
	@NotNull
	String city;
	@Size(min=6,max=6,message="zip code must be of length 6")
	int zipCode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

}
