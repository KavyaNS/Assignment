package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		//Storing row 1 data
		Map<String, String> employee1 = new HashMap<String, String>();
		employee1.put("Employee ID", "E001");
		employee1.put("Name", "Alice Green");
		employee1.put("Age", "30");
		employee1.put("Gender", "Female");
		employee1.put("Department", "Engineering");
		employee1.put("Position", "Software Engineer");
		employee1.put("Salary", "75,000");
		employee1.put("Email", "alice@example.com");
		employee1.put("Contact Number", "9876543213");
		
		//Storing row 2 data
		Map<String, String> employee2 = new HashMap<String, String>();
		employee2.put("Employee ID", "E002");
		employee2.put("Name", "Bob Johnson");
		employee2.put("Age", "35");
		employee2.put("Gender", "Male");
		employee2.put("Department", "Marketing");
		employee2.put("Position", "Marketing Manager");
		employee2.put("Salary", "85,000");
		employee2.put("Email", "bob@example.com");
		employee2.put("Contact Number", "9876543214");
		
		//Storing row 2 data
		Map<String, String> employee3 = new HashMap<String, String>();
		employee3.put("Employee ID", "E003");
		employee3.put("Name", "Carol White");
		employee3.put("Age", "28");
		employee3.put("Gender", "Female");
		employee3.put("Department", "Sales");
		employee3.put("Position", "Sales Executive");
		employee3.put("Salary", "65,000");
		employee3.put("Email", "carol@example.com");
		employee3.put("Contact Number", "9876543215");
		
		List<Map<String,String>> empList = new ArrayList<Map<String,String>>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		
		System.out.println("Email of employee 2 :"+empList.get(1).get("Email"));
		
		
		

	}

}
