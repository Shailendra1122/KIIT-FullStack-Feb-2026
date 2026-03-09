package day17;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeDriver {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
        try
        {
            List<Employee> employees = mapper.readValue(
            	//File("src/day17/products.json"),	//file is in the same folder as the java class
            	//new File("D:\\jsondata\\product1.json"),	   						//absolute path
                new File("myfolder/employee.json"),							       //relative path
                new TypeReference<List<Employee>>() {}
            );
            
          // System.out.println(products);
           for(Employee employee:employees)
        	   System.out.println(employee);
           
           
           //display name of all male employees
           System.out.println("LIST OF MALE EMPLOYEES");
           for(Employee employee:employees)
        	   if(employee.getGender().equalsIgnoreCase("male"))
        	   {
        		   System.out.println(employee.getName());
        	   }
       
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
