import java.util.ArrayList;

public class C206_CaseStudy {

	ArrayList<Order> orderList = new ArrayList<Order>();
	ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
	ArrayList<Bill> BillList = new ArrayList<Bill>();

	public static void main(String[] args) {

	}

	public static void addOrder(ArrayList<Order> orderList) {
		/*
		 * Mika's Created View Menu Item Method, this helps support my method as
		 * afterwards users can choose their orders from the specified menu shown.
		 */
		// viewAllMenuItem(menuItemList);

		ArrayList<MenuItem> choosenMenuItemList = new ArrayList<MenuItem>();
		String studentId = Helper.readString("Please Enter Your Student ID > ");
		String orderDate = Helper.readString("Please Enter Order's Delievery Date [dd/mm/yy] > ");
		int numOfOrder = Helper.readInt("Please Number Of Items You Wish to Order > ");

		if (numOfOrder > menuItemList.size() | numOfOrder <= 0) {
			System.out.println("Invalid Number Of Orders Value Entered Please Try Again :(");
		} else {
			for (int i = 0; i < numOfOrder; i++) {
				String itemToOrder = Helper
						.readString("Please Enter Name Of Item You Wish To Order From Above Menu > ");
				for (MenuItem Object : menuItemList) {
					if (Object.getname().equalsIgnoreCase(itemToOrder)) {
						choosenMenuItemList.add(Object);
					}
				}
			}
		}

		Order userOrderObject = new Order(studentId, orderDate, choosenMenuItemList);
		orderList.add(userOrderObject);

		if (orderList.add(userOrderObject) == true) {
			System.out.println("Order Successfully Placed!");
		} else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}

	}

	public void deleteOrder(ArrayList<Order> orderList) {

		boolean isDeleted = false;

		String orderDateToDelete = Helper
				.readString("Please Enter Order Date To Delete Order Placed On That Date [dd/mm/yy] > ");

		for (Order Object : orderList) {
			if (Object.getOrderDate().equalsIgnoreCase(orderDateToDelete)) {
				orderList.remove(Object);
				isDeleted = true;
			}
		}

		if (isDeleted == true) {
			System.out.println("Order Successfully Deleted!");
		}

		else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}

	}

	public void viewAllOrder(ArrayList<Order> orderList) {

		String itemsOrdered = "";

		System.out.println(String.format("%-30s &-30s %-30s", "STUDENT ID", "DATE OF ORDER", "ORDERS PLACED"));

		for (int i = 0; i < orderList.size(); i++) {
			for (int x = 0; i < orderList.size(); x++) {
				itemsOrdered = itemsOrdered + orderList.get(x).getItems().get(x).getname();
			}
			System.out.println(String.format("%-30s &-30s %-30s", orderList.get(i).getStudentId(),
					orderList.get(i).getOrderDate(), itemsOrdered));
		}

	}

	public static void addMenuItem(ArrayList<MenuItem> menuItemList) {

		System.out.println("ENTER NEW MENU ITEM NAME");
		String catagory = Helper.readString("Enter Item Catagory");
		String name = Helper.readString("Enter Item Name");
		boolean healthyChoice = Helper.readBoolean("Is it Healthier Choice? T/F");
		double price = Helper.readDouble("Enter Item Price");

		if (price > 0) {
			menuItemList.add(new MenuItem(catagory, name, healthyChoice, price));
			System.out.println("Menu Item Added");
		} else {
			System.out.println("Please Enter Valid Pricing ");

		}
	}

	public void deleteMenuItem(ArrayList<MenuItem> menuItemList) {

		boolean isDeleted = false;

		String MenuItemName = Helper.readString("Please Enter Menu Item name to delete it > ");

		for (MenuItem object : menuItemList) {
			if (Object.MenuItemName().equalsIgnoreCase(MenuItemName)) {
				menuItemList.remove(object);
				isDeleted = true;
			}
		}

		if (isDeleted == true) {
			System.out.println("Menu Item Successfully Deleted!");
		}

		else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}
	}

	public void viewMenuItem(ArrayList<MenuItem> menuItemList) {

		String output = String.format("%-30s &-30s %-30s", "CATEGORY", "ITEM NAME", "HEALTHY CHOICE", "PRICE");

		for (MenuItem Menu : menuItemList) {
			output += String.format("%-30s $%-15.2f %-15s %-10b\n", Menu.getcategory(), Menu.getname(),
					Menu.ishealthyChoice(), Menu.getprice());
		}
		System.out.print(output);
	}
<<<<<<< HEAD
	
=======

	public void UpdateMenuItem(ArrayList<MenuItem> menuItemList) {
		System.out.println("Update Menu Details");
		String customerName = Helper.readString("Please enter Item Name: ");
		int updateoption = 0;

		for (MenuItem ViewAll : menuItemList) {
			if (ViewAll.getname().equalsIgnoreCase(customerName)) {
				System.out.println(ViewAll.getname());
				System.out.println("1.Update Name");
				System.out.println("2.Update Price");
				System.out.println("3. Update both");
				updateoption = Helper.readInt("please enter option : ");

				// update Name
				if (updateoption == 1) {
					String name = Helper.readString("Please enter Name: ");
					if (customerName.equals("")) {
						System.out.println("name field cannot be empty");
					} else {
						ViewAll.setname(customerName);
						System.out.println("Customer Detail updated");

					}
				}
				// update price
				else if (updateoption == 2) {
					int price = Helper.readInt("Please enter Price: ");
					String NP = Integer.toString(price);

					if (NP.length() > 0) {
						ViewAll.setprice(price);
						System.out.println("Customer Detail updated");
					}
					if (NP.length() < 0) {
						System.out.println("Please Enter A Valid Price");
					}
				}
				// update both
				else if (updateoption == 3) {
					String name = Helper.readString("Please enter Name: ");
					int price = Helper.readInt("Please enter Price: ");
					String NP = Integer.toString(price);

					if (!customerName.equals("") && (NP.length() > 0)) {
						ViewAll.setname(name);
						ViewAll.setprice(price);
						System.out.println("Customer Detail updated");
					}
					if (customerName.equals("")) {
						System.out.println("Name field cannot be empty");
					}
					if (NP.length() < 0) {
						System.out.println("Please Enter A Valid Price");
					}

				} else {
					System.out.println("Error!! please enter a a valid intput");
				}

			} else {
				System.out.println("Customer not found");
			}
		}

	}

	public static void SearchItemName(ArrayList<MenuItem> MenuItemList) {

		String name = Helper.readString("Enter Name to search: > ");

		for (int i = 0; i < MenuItemList.size(); i++) {
			if (name.equalsIgnoreCase(MenuItemList.get(i).getname())) {
				System.out.println(String.format(" %-20s %-20s %-20s %-20s %-20s %-20s\n", "NAME", "CATEGORY", "PRICE",
						"MIN INCREMENT", "HEALTHY CHOICE"));
				System.out.println(String.format("%-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
						MenuItemList.get(i).getname(), MenuItemList.get(i).getcategory(),
						MenuItemList.get(i).getprice(), MenuItemList.get(i).ishealthyChoice()));

			} else {
				System.out.println("No results found");
			}

		}
	}

	public void viewAllBill(ArrayList<Bill> BillList) {
		String output = String.format("%-30s &-15s %-15s %-10s\n", "PAYEE", "TOTAL AMOUNT", "DUE DATE", "PAID");

		for (Bill Billing : BillList) {
			output += String.format("%-30s $%-15.2f %-15s %-10b\n", Billing.getPayee(), Billing.getTotalAmount(),
					Billing.getDueDate(), Billing.isPaid());
		}
		System.out.print(output);
	}

	public void AddBill(ArrayList<Bill> BillList) {
		System.out.println("ENTER NEW BILLING DETAILS");
		String payee = Helper.readString("Enter payee");
		double totalAmount = Helper.readDouble("Enter total amount");
		String dueDate = Helper.readString("Enter due date");

		BillList.add(new Bill(payee, totalAmount, dueDate));
	}

	public void deleteBillItem(ArrayList<Bill> BillList) {

		boolean isDeleted = false;

		String BillPayee = Helper.readString("Please Enter payee name to delete it > ");

		for (Bill Item : BillList) {
			if (Item.getPayee().equalsIgnoreCase(BillPayee)) {
				BillList.remove(Item);
				isDeleted = true;
			}
		}

		if (isDeleted == true) {
			System.out.println("Bill Item Successfully Deleted!");
		}

		else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}
	}

>>>>>>> branch 'master' of https://github.com/19012079BenedicTanMingHao/C206_SchoolLunchApp.git
}
