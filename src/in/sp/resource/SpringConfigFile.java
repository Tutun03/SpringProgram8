package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.student;

@Configuration
public class SpringConfigFile {
@Bean("addobj")
public Address createAddressObj()
{
	Address add=new Address(200,"kolkata",700061);
	
	return add;
	
}

@Bean("studenobj")
public student studentobj()
{
	student std=new student(102,"aniket",createAddressObj());
	
	return std;
}

}
