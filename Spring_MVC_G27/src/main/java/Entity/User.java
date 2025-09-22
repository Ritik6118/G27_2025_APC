package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_from_spring_mvc")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserID;
	
	private String name;
	private String email;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
	
}
