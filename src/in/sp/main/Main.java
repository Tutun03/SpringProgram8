package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.student;
import in.sp.resource.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	student std1=(student)context.getBean("studenobj");
	std1.display();
	
}
}
