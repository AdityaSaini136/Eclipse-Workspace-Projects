package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emplist")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ename;
	private String cmpyname;
	public Employee() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCmpyname() {
		return cmpyname;
	}
	public void setCmpyname(String cmpyname) {
		this.cmpyname = cmpyname;
	}
	public Employee(String ename, String cmpyname) {
		super();

		this.ename = ename;
		this.cmpyname = cmpyname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", cmpyname=" + cmpyname + "]/n";
	}
}