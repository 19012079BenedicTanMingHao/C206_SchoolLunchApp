//UserAccount class -Qu Ji Fu
import java.util.ArrayList;
public class UserAccount {
	
	private String accountName;
	private String password;
	private int contactNo;

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	private ArrayList<UserAccount> accountList;
	
	public UserAccount(String accountName, String password) {
		this.accountName = accountName;
		this.password = password;
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

	public ArrayList<UserAccount> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<UserAccount> accountList) {
		this.accountList = accountList;
	}
	

}
