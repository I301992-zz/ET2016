import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
		A a= (A) ac.getBean("a");
		System.out.println(a.getMsg());
		
	Location l= (Location) ac.getBean("location");		
		
	}

}
