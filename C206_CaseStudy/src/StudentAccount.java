/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19022507, 29 Aug 2020 9:02:32 pm
 */

/**
 * @author 19022507
 *
 */
public class StudentAccount {
	private String accountName;
	private String password;
	private int contactNo;
	private int studentID;

	
	public StudentAccount(String accountName, int contactNo, String password,  int studentID) {//creating student account
		this.accountName = accountName;
		this.contactNo = contactNo;
		this.password = password;
		this.setStudentID(studentID);
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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

}
