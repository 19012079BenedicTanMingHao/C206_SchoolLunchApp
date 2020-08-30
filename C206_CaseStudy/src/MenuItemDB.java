import java.util.ArrayList;

public class MenuItemDB {

	static ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

	public static void main(String[] args) {

		int option = 0;
		while (option != 6) {
			MenuItemDB.ItemMenu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				// View all user
				MenuItemDB.viewMenuItem(menuItemList);

			} else if (option == 2) {
				// View all user
				MenuItemDB.addMenuItem(menuItemList);

			} else if (option == 3) {
				MenuItemDB.deleteMenuItem(menuItemList);

			} else if (option == 4) {
				MenuItemDB.SearchItemName(menuItemList);

			} else if (option == 5) {
				MenuItemDB.UpdateMenuItem(menuItemList);

			} else if (option == 6) {
				System.out.println("Thank you!");
			}

		}

	}

	public static void ItemMenu() {
		System.out.println("1. Display Item");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Search item");
		System.out.println("5. Update item");
		System.out.println("6. Quit");
		Helper.line(80, "-");

	}

	public static void addMenuItem(ArrayList<MenuItem> menuItemList) {

		System.out.println("ENTER NEW MENU ITEM NAME");
		String catagory = Helper.readString("Enter Item Catagory");
		String name = Helper.readString("Enter Item Name");
		boolean healthyChoice = Helper.readBoolean("Is it Healthier Choice? true/false");
		double price = Helper.readDouble("Enter Item Price");

		if (price > 0) {
			menuItemList.add(new MenuItem(catagory, name, healthyChoice, price));
			System.out.println("Menu Item Added");
		} else {
			System.out.println("Please Enter Valid Pricing ");

		}
	}

	public static void deleteMenuItem(ArrayList<MenuItem> menuItemList) {

		boolean isDeleted = false;

		String name = Helper.readString("Please Enter Menu Item name to delete it > ");

		for (int i = 0; i < menuItemList.size(); i++) {
			if (name.equalsIgnoreCase(menuItemList.get(i).getname())) {
				menuItemList.remove(i);
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

	public static void viewMenuItem(ArrayList<MenuItem> menuItemList) {

		String MenuList = String.format("%-30s  %-30s %-30s %-30s \n", "CATEGORY", "ITEM NAME", "HEALTHY CHOICE",
				"PRICE");

		for (int i = 0; i < menuItemList.size(); i++) {
			MenuList += menuItemList.get(i).toString();
		}
		System.out.print(MenuList);
	}

	public static void UpdateMenuItem(ArrayList<MenuItem> menuItemList) {
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
						"HEALTHY CHOICE"));
				System.out.println(String.format("%-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
						MenuItemList.get(i).getname(), MenuItemList.get(i).getcategory(),
						MenuItemList.get(i).getprice(), MenuItemList.get(i).ishealthyChoice()));

			} else {
				System.out.println("No results found");
			}

		}
	}
}