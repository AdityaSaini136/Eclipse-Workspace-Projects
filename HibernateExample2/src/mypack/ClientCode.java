package mypack;

import java.util.List;

public class ClientCode {
	public static void main(String[] args) {
		DaoImpl daoImpl = new DaoImpl();
//		Employee emp = new Employee("Sam", "HKMA");
//		Employee emp1 = new Employee("Dog", "Whatsp");
//		Employee emp2 = new Employee("Fog", "HP");
//		daoImpl.save(emp);
//		daoImpl.save(emp1);
//		daoImpl.save(emp2);
		//List<Employee> emplist = daoImpl.getAll();
		//List<Employee> listData = daoImpl.getData();
		//Integer deleteDataById = daoImpl.deleteDataById();
		boolean updateByeId = daoImpl.updateByeId(30);
		System.out.println(updateByeId);
	}
}
