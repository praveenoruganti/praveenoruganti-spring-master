package  com.praveen.spring.core.di.setter.annotation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.spring.core.di.setter.annotation.SIEmployee;
import com.praveen.spring.core.di.setter.annotation.config.SIEmployeeConfig;


public class SetterInjectionTest {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SIEmployeeConfig.class);
		SIEmployee emp1= (SIEmployee)context.getBean("siemployee");
		System.out.println("Employee1 Id :"+emp1.getEmpId());
		System.out.println("Employee1 Name :"+emp1.getEmpName());
		System.out.println("Employee1 Salary :"+emp1.getEmpSal());
		System.out.println("Employee1 Department ID :" + emp1.getDept().getDeptId());
		System.out.println("Employee1 Department Name :" + emp1.getDept().getDeptName());
		
		context.close();

	}

}
