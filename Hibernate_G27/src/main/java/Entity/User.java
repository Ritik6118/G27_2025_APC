package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	@Id
	private int Uid;
	private String name;
	@ManyToMany
	private List<User> friends;
	
	public User() {}
	public User(int uid, String name, List<User> friends) {
		super();
		Uid = uid;
		this.name = name;
		this.friends = friends;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getFriends() {
		return friends;
	}
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	
	
	
	
}
