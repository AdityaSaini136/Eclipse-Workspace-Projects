package com.db.beans;

public class Employee {
 
	private int eid;
	private String ename;
	private String cmyname;
	
	public int geteid() {
		return eid;
	}
	public void seteid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCmyname() {
		return cmyname;
	}
	public void setCmyname(String cmyname) {
		this.cmyname = cmyname;
   }
   public Employee(int eid, String ename, String cmyname) {
   	super();
   	this.eid = eid;
   	this.ename = ename;
   	this.cmyname = cmyname;
   }
   @Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", cmyname=" + cmyname + "]";
	}
}