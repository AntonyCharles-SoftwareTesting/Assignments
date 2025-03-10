package assignments;

public class Assignment2_ArrayPractice {

		public static void main(String[] args) {
	        // Declare and initialize a 3D array with semester data
	        String[][][] semesterData = {
	            { // Semester 1
	                {"Mathematics I", "78"},
	                {"Physics", "85"},
	                {"Chemistry", "91"},
	                {"Computer Programming", "74"},
	                {"Engineering Drawing", "88"},
	                {"Basic Electrical Eng.", "79"}
	            },
	            { // Semester 2
	                {"Mathematics II", "82"},
	                {"Mechanics", "77"},
	                {"Environmental Sci.", "93"},
	                {"Basic Electronics", "69"},
	                {"Engineering Physics", "84"},
	                {"Engineering Graphics", "90"}
	            },
	            { // Semester 3
	                {"Data Structures", "88"},
	                {"Discrete Mathematics", "81"},
	                {"Digital Electronics", "76"},
	                {"Operating Systems", "92"},
	                {"Signals and Systems", "85"},
	                {"Object-Oriented Prog.", "78"}
	            },
	            { // Semester 4
	                {"Algorithms", "91"},
	                {"Computer Networks", "73"},
	                {"Database Systems", "89"},
	                {"Microprocessors", "80"},
	                {"Communication Eng.", "76"},
	                {"Software Engineering", "87"}
	            },
	            { // Semester 5
	                {"Probability & Stats", "86"},
	                {"Machine Learning", "88"},
	                {"Compiler Design", "84"},
	                {"Theory of Computation", "95"},
	                {"Embedded Systems", "73"},
	                {"Computer Graphics", "90"}
	            }
	        };

	        
	        
	        
	        // Print Semester 3 - Subject 4 and Subject 5 Names
	        System.out.println("Semester 3 - Subject 4: " + semesterData[2][3][0]);
	        System.out.println("Semester 3 - Subject 5: " + semesterData[2][4][0]);

	        // Print Semester 5 - Subject 3 and Subject 6 Marks
	        System.out.println("Semester 5 - Subject 3 Marks: " + semesterData[4][2][1]);
	        System.out.println("Semester 5 - Subject 6 Marks: " + semesterData[4][5][1]);
	    }
	


	}


