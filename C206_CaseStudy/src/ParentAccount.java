/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19022507, 29 Aug 2020 8:59:45 pm
 */

/**
 * @author 19022507
 *
 */
public class ParentAccount{
	private String password;
	private int contactNo;
	private double creditBal;
	private String accountName;
	

	public ParentAccount(String accountName, int contactNo, String password, double creditBal) {//creating parent account
		this.accountName = accountName;
		this.contactNo = contactNo;
		this.password = password;
		this.setCreditBal(creditBal);
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

	public double getCreditBal() {
		return creditBal;
	}

	public void setCreditBal(double creditBal) {
		this.creditBal = creditBal;
	}

}
