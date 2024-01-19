package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class UpdateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		
		//create session
		Session session = sf.openSession();
		
		Emp e =session.get(Emp.class, 1002);
		e.setSal(45000.0f);
		Transaction tr=session.beginTransaction();
		session.update(e);
		tr.commit();
		
		

	}

}
