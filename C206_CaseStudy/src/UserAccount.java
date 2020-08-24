//UserAccount class -Qu Ji Fu
import java.util.ArrayList;
public class UserAccount {
	
	private String accountName;
	private String password;
	private int contactNo;
	private ArrayList<UserAccount> ParentList;
	private ArrayList<UserAccount> StudentList;
	private int studentID;
	private int creditBal;
	private String accountType; //student or parent

	public void ParentAccount(String accountName, int contactNo, String password, String accountType, int creditBal) {//creating parent account
		this.accountName = accountName;
		this.contactNo = contactNo;
		this.accountType = accountType;
		this.password = password;
		this.setCreditBal(creditBal);
	}
	public void StudentAccount(String accountName, int contactNo, String password, String accountType, int studentID) {//creating student account
		this.accountName = accountName;
		this.accountType = accountType;
		this.contactNo = contactNo;
		this.password = password;
		this.setStudentID(studentID);
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void updateAccount(String accountName, int contactNo) {
		this.accountName = accountName;
		this.contactNo = contactNo;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getCreditBal() {
		return creditBal;
	}

	public void setCreditBal(int creditBal) {
		this.creditBal = creditBal;
	}
	public void getStudentAccount(int studentID) {
		this.studentID = studentID;
	}

	public ArrayList<UserAccount> getStudentList() {
		return StudentList;
	}

	public void setStudentList(ArrayList<UserAccount> studentList) {
		StudentList = studentList;
	}

	public ArrayList<UserAccount> getParentList() {
		return ParentList;
	}
	public void setParentList(ArrayList<UserAccount> parentList) {
		ParentList = parentList;
	}
	
}
