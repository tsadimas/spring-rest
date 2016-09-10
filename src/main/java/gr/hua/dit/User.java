package gr.hua.dit;


import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@XmlRootElement
public class User implements Serializable {

	private static final long serialVersionUID = -1355807851822025659L;
	
	@Size(min=2, max=30)
	private String name;
	
	@NotEmpty @Email
	private String email;
	private int id;
	private String country;
	private String password;
	
	
	private String phone;

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Name=" + this.name + ", Email=" + this.email + ", Country=" + this.country;
	}

}