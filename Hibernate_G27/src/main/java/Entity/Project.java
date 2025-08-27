package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
	@Id
	private int pId;
	private String Name;
	@ManyToOne
	private Employee employee;
	
	public Project(int pId, String name, Employee employee) {
		super();
		this.pId = pId;
		Name = name;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project() {}
	
	public Project(int pId, String name) {
		super();
		this.pId = pId;
		Name = name;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}

