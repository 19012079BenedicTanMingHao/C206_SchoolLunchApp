//Created By Mika
public class MenuItem {

	private String category;
	private String name;
	private boolean healthyChoice;
	private double price;

	public MenuItem(String category, String name, boolean healthyChoice, double price) {
		this.category = category;
		this.healthyChoice = healthyChoice;
		this.name = name;
		this.price = price;

	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public boolean ishealthyChoice() {
		return healthyChoice;
	}

	public void sethealthyChoice(boolean healthyChoice) {
		this.healthyChoice = healthyChoice;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getprice() {
		return name;
	}

	public void getprice(double price) {
		this.price = price;
	}

	public String toString() {
		return toString();
	}
}
