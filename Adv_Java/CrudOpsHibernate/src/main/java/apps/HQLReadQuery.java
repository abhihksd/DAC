package apps;

import org.hibernate.query.Query;

import entities.Emp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HQLReadQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
		
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		
		//create session
		Session session = sf.openSession();
		
		Transaction tr=session.beginTransaction();
		//Equery to select emps
//		Query q=session.createQuery("from Emp");
//		Select query
//		List<Emp> emps=q.getResultList();
//		for(Emp e: emps)
//		{
////			update Emp set salary=val where empno=val;
//			System.out.println("\n"+e.getEname()+" : "+e.getSal()+" : "+e.getDeptno());
//		}
		
		//Update Query
//		Query q=session.createQuery("update Emp set sal=:sl where empno=:eno");
//		q.setParameter("sl", 100.0f);
//		q.setParameter("eno", 1003);	
//		int n=q.executeUpdate();
		
		//U
//		Query q=session.createQuery("from Emp where sal between :val and :val2 ");
//		q.setParameter("val", 1500f);
//		q.setParameter("val2", 3000f);
//		List<Emp> emps=q.getResultList();
//		for(Emp e: emps)
//		{
//			System.out.println("\n"+e.getEname()+" : "+e.getSal()+" : "+e.getDeptno());
//		}
//		
		
		
		tr.commit();

	}

}
