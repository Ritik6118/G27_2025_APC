package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String name;
	@OneToMany
	private List<Project> projects;
	
	public Employee() {}
	
	public Employee(int empId, String name, List<Project> projects) {
		super();
		EmpId = empId;
		this.name = name;
		this.projects = projects;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
		
	
	
}
