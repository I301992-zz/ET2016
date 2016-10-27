package springcorepackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		IndianTiger a =  (IndianTiger) ac.getBean("indiantiger");
		System.out.println(a.getNamelist());
	}
}
