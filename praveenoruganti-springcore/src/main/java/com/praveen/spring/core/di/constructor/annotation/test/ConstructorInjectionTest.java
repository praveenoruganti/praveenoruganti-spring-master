package  com.praveen.spring.core.di.constructor.annotation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.praveen.spring.core.di.constructor.annotation.CIEmployee;
import com.praveen.spring.core.di.constructor.annotation.config.CIEmployeeConfig;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CIEmployeeConfig.class);
		CIEmployee emp1= (CIEmployee)context.getBean("ciemployee");
		System.out.println("Employee1 Id :"+emp1.getEmpId());
		System.out.println("Employee1 Name :"+emp1.getEmpName());
		System.out.println("Employee1 Salary :"+emp1.getEmpSal());
		System.out.println("Employee1 Department ID :" + emp1.getDept().getDeptId());
		System.out.println("Employee1 Department Name :" + emp1.getDept().getDeptName());
		
		context.close();

	}

}
