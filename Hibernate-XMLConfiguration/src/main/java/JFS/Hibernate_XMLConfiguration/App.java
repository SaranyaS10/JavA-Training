package JFS.Hibernate_XMLConfiguration;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{

	public static void main( String[] args )
    {
        Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Person.class).addAnnotatedClass(Student.class);
        ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
        Session session=sessionFactory.openSession();
        session.beginTransaction();
       // session.close();
        
       Student student=new Student();
      student.setSid(103);
      student.setAge(17);
      student.setName("madhu");
       session.save(student);
       
        
     Query q1=session.createQuery("from Person");
     List<Person> list=q1.list();
     q1.setFirstResult(0);
     q1.setFetchSize(1);
     for(Person p:list)
     {
    	 System.out.println(p);
     }
     
     Query q2=session.createQuery("from Person where pid>:id");
     q2.setInteger("id", 101);
     System.out.println("Directly printing from query results: \n"+q2.uniqueResult());
     Person p=(Person)q2.uniqueResult();
     System.out.println("After Assing to person variable\n");
     
     Query q3=session.createQuery("update Person set pname='Saranya' where pid=102");
     int rows_updated=q3.executeUpdate();
     System.out.println("The rows updated is "+rows_updated);
     
   
     
//     Query q5=session.createQuery("select pid from Person");
//     System.out.println(q5.uniqueResult());
     
//     Query q6=session.createQuery(" from Person p order by p.pid desc");
//     System.out.println(q6.uniqueResult());
        
 
     Query q7=session.createQuery("select sum(price) from Laptop");
     System.out.println("The sum of price is "+q7.uniqueResult());
     
     Query qr1=session.createQuery("select count(pid) from Person");
     System.out.println("The count of pid is "+qr1.uniqueResult());
     
//     Query q8=session.createQuery("from Person as p inner join p.Laptop as l");
//     List<?> list1=q8.list();
//     for(int i=0; i<list1.size(); i++) {
//			Object[] row = (Object[]) list1.get(i);
//    	 Person person=(Person) row[0];
//    	 Laptop laptop=(Laptop) row[1];
//    	 System.out.println("Person ID"+person.getPid()+"Person Name"+person.getPname()+"Laptop id"+laptop.getLid()+"Brand Name"+laptop.getBrandname());
//     }
  
     Query q4=session.createQuery("delete from Person  where pid=102");
     int rows_deleted=q4.executeUpdate();
     System.out.println("The rows updated is "+rows_deleted);
     
//     Query q9=session.createQuery("from Person  p left join Student s where p.pid=s.sid");
//     System.out.println(q9.uniqueResult());
     
//        Laptop laptop=new Laptop();
//        Laptop laptop1=new Laptop();
//        Person person=new Person();
//        Person person1=new Person();
//        
//        laptop.setLid(5);
//        laptop.setBrandname("Azus");
//        laptop.setPrice(50000);
//        laptop.getPerson().add(person1);
//        laptop1.setLid(6);
//        laptop1.setBrandname("Samsung");
//        laptop1.setPrice(56000);
//        laptop1.getPerson().add(person);
//       
//        
//        person.setPid(101);
//        person.setPname("Nivedha");
//        person.getLaptop().add(laptop1);
//        person1.setPid(102);
//        person1.setPname("Gayathri");
//        person.getLaptop().add(laptop);
//        
//        session.save(laptop);
//        session.save(laptop1);
//        session.save(person);
//        session.save(person1);
        
        session.getTransaction().commit();
       // session.delete(laptop);
        
     
        
    }
}
;