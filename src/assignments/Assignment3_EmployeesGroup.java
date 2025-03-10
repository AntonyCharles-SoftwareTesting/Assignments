package assignments;

public class Assignment3_EmployeesGroup {

	public static void main(String[] args) {
		
		Assignment3_Employees obj=new Assignment3_Employees ();
		
		String[] employeeNames = { obj.emp1, obj.emp2, obj.emp3 };
		int[] employeeIDs = { obj.emp_id1, obj.emp_id2, obj.emp_id3 };

		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);
		System.out.println(employeeNames[1] + " : " + employeeIDs[1]);
		System.out.println(employeeNames[2] + " : " + employeeIDs[2]);
	}

}
