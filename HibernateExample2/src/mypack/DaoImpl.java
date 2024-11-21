package mypack;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
@Transactional
//esme sab kaam Queries se Hora Hai==================
public class DaoImpl {
	public boolean save(Employee emp) {
		try {
			Session session = ConnectionPro.getConnection();
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Serializable save = session.save(emp);
			transaction.commit();
			System.out.println(save);
			System.out.println("save chl gya");
			session.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public List<Employee> getAll(){
		try {
			Session session = ConnectionPro.getConnection();
			Criteria criteria = session.createCriteria(Employee.class);
			List<Employee> employeelist = criteria.list();
			return employeelist;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<Employee> getData() {
		Session session = ConnectionPro.getConnection();
		Query fatchData = session.createQuery("from Employee");
		List <Employee>  empList = fatchData.list();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee.getId());
			System.out.println(employee.getEname());
			System.out.println(employee.getCmpyname());
		}
		return empList;
	}
	public  Integer deleteDataById() {
			Session session = ConnectionPro.getConnection(); 
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Query deleteQuery = session.createQuery("delete from Employee where id=31");
			int eup = deleteQuery.executeUpdate();
			System.out.println("Delete Query is run..");
			System.out.println(eup);
			if(eup>0) {
				System.out.println("Record deleted");
			}else {
				System.out.println("Record  not deleted");
			}
			transaction.commit();
		return eup;
	}
	public  boolean updateByeId(int id) {
		Session session = ConnectionPro.getConnection();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Query updateQuery = session.createQuery("update from Employee set cmpyname='Bata',ename='Arjun' where id=30");
		int eu = updateQuery.executeUpdate();
		if(eu>0) {
			System.out.println("record updated");
		}else {
			System.out.println("record not updated");
		}
		return true;
	}
}
