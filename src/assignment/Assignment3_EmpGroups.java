package assignment;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		
		Assignment3_Employees employees = new Assignment3_Employees();//object creation
		
		//Printing employees names and Ids
		for(int i=0;i<=2;i++) {
			System.out.println("Employee "+(i+1)+" name and Id are "+employees.Employee_names[i]+" and "+employees.Employee_Ids[i]);
		}

	}

}
