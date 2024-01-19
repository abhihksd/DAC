package apps;


import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class SaveEmp {

	public static void main(String[] args) {
		
		//create session factory
				//create the service
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
								
				//read the info hibernate.cfg.xml file
				Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
								
				//actually conn to database
				SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
				
				//create session
				Session session = sf.openSession();
				
				Emp emp=new Emp(1003,"Shubham",20000f,30);
				Transaction tr=session.beginTransaction();
				
				session.save(emp);
				tr.commit();
				session.close();
				sf.close();
	}

}
