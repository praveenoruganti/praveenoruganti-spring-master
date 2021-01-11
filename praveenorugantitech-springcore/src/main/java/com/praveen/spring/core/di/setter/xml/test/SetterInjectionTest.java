package  com.praveen.spring.core.di.setter.xml.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.praveen.spring.core.di.setter.xml.SIEmployee;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		// Usage of BeanFactory
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanssetter.xml"));
		
		SIEmployee emp= (SIEmployee)factory.getBean("employee");
		
		System.out.println("Employee Id :"+emp.getEmpId());
		System.out.println("Employee Name :"+emp.getEmpName());
		System.out.println("Employee Salary :"+emp.getEmpSal());
		System.out.println("Employee Department ID :" + emp.getDept().getDeptId());
		System.out.println("Employee Department Name :" + emp.getDept().getDeptName());
		
		// Usage of ApplicationContext
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("beanssetter.xml");
		SIEmployee emp1= (SIEmployee)context.getBean("employee");
		
		System.out.println("Employee1 Id :"+emp1.getEmpId());
		System.out.println("Employee1 Name :"+emp1.getEmpName());
		System.out.println("Employee1 Salary :"+emp1.getEmpSal());
		System.out.println("Employee1 Department ID :" + emp1.getDept().getDeptId());
		System.out.println("Employee1 Department Name :" + emp1.getDept().getDeptName());
		
		context.close();

	}

}
