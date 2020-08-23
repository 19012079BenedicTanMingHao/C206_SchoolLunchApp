import java.util.ArrayList;

public class C206_CaseStudy {

	ArrayList<Order> orderList = new ArrayList<Order>();
	ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
	
	public static void main(String[] args) {
		

	}
	
	public static void addOrder(ArrayList<Order> orderList) {
		/*
		Mika's Created View Menu Item Method, this helps support my method as afterwards users can choose 
		their orders from the specified menu shown.
		*/
		//viewAllMenuItem(menuItemList);
		
		ArrayList<MenuItem> choosenMenuItemList = new ArrayList<MenuItem>();
		
		String studentId = Helper.readString("Please Enter Your Student ID > ");
		String orderDate = Helper.readString("Please Enter Order's Delievery Date [dd/mm/yy] > ");
		int numOfOrder = Helper.readInt("Please Number Of Items You Wish to Order > ");
		
		if(numOfOrder > menuItemList.size() | numOfOrder <= 0 ) {
			System.out.println("Invalid Number Of Orders Value Entered Please Try Again :(");
		}
		else {
			for(int i = 0 ; i < numOfOrder ; i++) {
				String itemToOrder = Helper.readString("Please Enter Name Of Item You Wish To Order From Above Menu > ");
				for(MenuItem Object : menuItemList) {
					if(Object.getname().equalsIgnoreCase(itemToOrder)) {
						choosenMenuItemList.add(Object);
					}
				}
			}
		}

		Order userOrderObject = new Order(studentId,orderDate,choosenMenuItemList);
		orderList.add(userOrderObject);
		
		if(orderList.add(userOrderObject) == true) {
			System.out.println("Order Successfully Placed!");
		}
		else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}
		
		
	}
	
	public void deleteOrder(ArrayList<Order> orderList) {
		
		boolean isDeleted = false;
		
		String orderDateToDelete = Helper.readString("Please Enter Order Date To Delete Order Placed On That Date [dd/mm/yy] > ");
		
		for(Order Object : orderList) {
			if(Object.getOrderDate().equalsIgnoreCase(orderDateToDelete)) {
				orderList.remove(Object);
				isDeleted = true;
			}
		}
		
		if(isDeleted == true) {
			System.out.println("Order Successfully Deleted!");
		}
		
		else {
			System.out.println("An Error Has Occured, Please Try Again!");
		}
			
	}

	public void viewAllOrder(ArrayList<Order> orderList) {
		
		String itemsOrdered = "";
		
		System.out.println(String.format("%-30s &-30s %-30s","STUDENT ID","DATE OF ORDER","ORDERS PLACED"));
		
		for(int i = 0 ; i < orderList.size() ; i++) {
			for(int x = 0 ; i < orderList.size() ; x++) {
				itemsOrdered = itemsOrdered + orderList.get(x).getItems().get(x).getname();
			}
			System.out.println(String.format("%-30s &-30s %-30s",orderList.get(i).getStudentId(),orderList.get(i).getOrderDate(),itemsOrdered));
		}
		
	}

}
