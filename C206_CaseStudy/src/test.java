import java.util.ArrayList;


public class test {

	public static void main(String[] args) {
		ArrayList<ParentAccount> parentList = new ArrayList<ParentAccount>();
		ArrayList<StudentAccount> studentList = new ArrayList<StudentAccount>();
		parentList.add(new ParentAccount("gay", 97902040, "gaysex69", 58.55));
		studentList.add(new StudentAccount("benedict", 97902040, "gaysex42", 19022507));
		int option = 0;
		while (option != 7) {
			menu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				test.addParentAccount(parentList);
			}
			if (option ==2) {
				test.addStudentAccount(studentList);
			}
			if (option == 3) {
				test.viewAllParentAccount(parentList);
			}
			if (option ==4) {
				test.viewAllStudentAccount(studentList);
			}
			if (option == 5) {
				test.updateParentAccount(parentList);
			}
			if (option == 6) {
				test.updateStudentAccount(studentList);
			}
			if (option == 7) {
				test.searchStudentAccount(studentList);
			}
			if (option > 8 || option < 1) {
				System.out.println("Please enter a valid option");
			}
		}
		System.out.println("Thank you for using.");
		
	}
	public static String retrieveAllParentAccount(ArrayList<ParentAccount> parentList) {
		String output = "";

		for (int i = 0; i < parentList.size(); i++) {

			output += String.format("%-15s %-15d %-15s %-10.2f\n", parentList.get(i).getAccountName(), parentList.get(i).getContactNo(),
					parentList.get(i).getPassword(), parentList.get(i).getCreditBal());
			
	}
	return output;
}
	public static String retrieveAllStudentAccount(ArrayList<StudentAccount> studentList) {
		String output = "";
		for (int i = 0; i>studentList.size(); i++) {
			output += String.format("%-15s %-15d %-15s %-10d\n", studentList.get(i).getAccountName(),
					studentList.get(i).getContactNo(), studentList.get(i).getPassword(), studentList.get(i).getStudentID());
		}
		return output;
	}
	
	public static void viewAllParentAccount(ArrayList<ParentAccount> parentList) {
		test.setHeader("PARENT ACCOUNT LIST");
		String output = String.format("%-15s %-15s %-15s %-10s\n","ACCOUNT NAME", "CONTACT NUMBER", "PASSWORD", "CREDIT BALANCE" );
		output += retrieveAllParentAccount(parentList);
		System.out.println(output);
	}
	public static void viewAllStudentAccount(ArrayList<StudentAccount> studentList) {
		test.setHeader("STUDENT ACCOUNT LIST");
		String output = String.format("%-15s %-15s %-15s %-10s\n","ACCOUNT NAME", "CONTACT NUMBER", "PASSWORD", "STUDENT ID" );
		output += retrieveAllStudentAccount(studentList);
		System.out.println(output);
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	public static void addParentAccount(ArrayList<ParentAccount> parentList) {
		String name = Helper.readString("Enter User Account name > ");
		String password = Helper.readString("Enter password > ");
		int contactNo = Helper.readInt("Enter contact number > ");
		double creditBal = Helper.readDouble("Enter prepaid credit balance(if any) > ");
		int auth = 0;
		for(int i = 0;i<parentList.size();i++) {
			if(parentList.get(i).getAccountName().equalsIgnoreCase(name)) {
				auth = 1;
			}
		}
		if(auth == 1) {
			System.out.println("User account Name already exists!");
		}
		if (auth ==0) {
			parentList.add(new ParentAccount(name, contactNo, password, creditBal));
			System.out.println("User Account Added!");
			
		}
	}
	public static void addStudentAccount(ArrayList<StudentAccount> studentList) {
		String name = Helper.readString("Enter User Account Name > ");
		String password = Helper.readString("Enter password > ");
		int contactNo = Helper.readInt("Enter contact number > ");
		int studentID = Helper.readInt("Enter student ID > ");
		int auth = 0;
		for(int i = 0;i<studentList.size();i++) {
			if(studentList.get(i).getAccountName().equalsIgnoreCase(name)) {
				auth = 1;
			}
		}
		if(auth == 1) {
			System.out.println("User account Name already exists!");
		}
		if (auth ==0) {
			studentList.add(new StudentAccount(name, contactNo, password, studentID));
			System.out.println("User Account Added!");
			
		}
	}
	
	public static void updateParentAccount(ArrayList<ParentAccount> parentList) {
		String Oldname = Helper.readString("Enter name of user Account to update > ");
		int OldcontactNo = Helper.readInt("Enter old contact number > ");
		String Newname = Helper.readString("Enter the new name of user account > ");
		int NewcontactNo = Helper.readInt("Enter new contact number > ");
		int auth = 0;
		int no = 0;
		for(int i = 0;i<parentList.size();i++) {
			if(parentList.get(i).getAccountName().equalsIgnoreCase(Oldname)) {
				auth = 1;
				no = i;
			}
		}
		if(auth == 0) {
			System.out.println("User account Name is invalid!");
		}
		else {
			parentList.get(no).setAccountName(Newname);
			parentList.get(no).setContactNo(NewcontactNo);
			System.out.println("Account information updated!");
		}
	}
	public static void updateStudentAccount(ArrayList<StudentAccount> studentList) {
		String Oldname = Helper.readString("Enter name of user Account to update > ");
		int OldcontactNo = Helper.readInt("Enter old contact number > ");
		String Newname = Helper.readString("Enter the new name of user account > ");
		int NewcontactNo = Helper.readInt("Enter new contact number > ");
		int auth = 0;
		int no = 0;
		for(int i = 0;i<studentList.size();i++) {
			if(studentList.get(i).getAccountName().equalsIgnoreCase(Oldname)) {
				auth = 1;
				no = i;
			}
		}
		if(auth == 0) {
			System.out.println("User account Name is invalid!");
		}
		else {
			studentList.get(no).setAccountName(Newname);
			studentList.get(no).setContactNo(NewcontactNo);
			System.out.println("Account information updated!");
		}
	}
	
	public static void searchStudentAccount(ArrayList<StudentAccount> studentList) {
		int studentId = Helper.readInt("Enter student ID > ");
		int auth =0;
		int no = 0;
		for (int i = 0; i<studentList.size();i++) {
			if(studentList.get(i).getStudentID() == studentId) {
				auth =1;
				no = i;
			}
		}
		if (auth == 0) {
			System.out.println("User was not found/ Student Id was Invalid!");
		}
		else {
			System.out.println(studentList.get(no).getAccountName());
		}
	}

	public static void menu() {
		Helper.line(80, "=");
		System.out.println("menu test");
		Helper.line(80, "=");
		System.out.println("1. Add New Parent User Account");
		System.out.println("2. Add New Student User Account");
		System.out.println("3. View All Parent Accounts");
		System.out.println("4. View All Student Accounts");
		System.out.println("5. Update Parent Account");
		System.out.println("6. Update Student Account");
		System.out.println("7. Search for Student Account");
		System.out.println("8. Quit");
	
}
}




