package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_JavaCollections1 {

	public static void main(String[] args) {
	
	List <String> empid = new ArrayList <String>();
	List <String> empname = new ArrayList <String>();
	List <Integer> empage = new ArrayList <Integer>();
	List <String> empgender = new ArrayList <String>();
	List <String> empdep = new ArrayList <String>();
	List <String> empposition = new ArrayList <String>();
	List <Integer> empsal = new ArrayList <Integer>();
	List <String> empemail = new ArrayList <String>();
	List <String> empcontactnum = new ArrayList <String>();
	
	empid.add("E001");
	empid.add("E002");
	empid.add("E003");
	empname.add("Alice Green");
	empname.add("Bob Johnson");
	empname.add("Carol White");
	empage.add(30);
	empage.add(35);
	empage.add(28);
	empgender.add("Female");
	empgender.add("Male");
	empgender.add("Female");
	empdep.add("Engineering");
	empdep.add("Marketing");
	empdep.add("SalesExecutive");
	empposition.add("Software Enggineer");
	empposition.add("Marketing Manager");
	empposition.add("Sales Executive");
	empsal.add(75,000);
	empsal.add(85,000);
	empsal.add(65,000);
	empemail.add("alice@example.com");
	empemail.add("bob@example.com");
	empemail.add("carol@example.com");
	empcontactnum.add("9876543213");
	empcontactnum.add("9876543214");
	empcontactnum.add("9876543215");
	
	
	System.out.println(empemail.get(1));
	

	}

}
