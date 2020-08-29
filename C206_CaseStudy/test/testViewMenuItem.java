import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testViewMenuItem {
	private MenuItem C1;
	private MenuItem C2;

	private ArrayList<MenuItem> MenuItemList;

	@Before
	public void SetUp() {
		// adding to arraylist
		MenuItemList = new ArrayList<MenuItem>();
		C1 = new MenuItem("Fish", "Fish Soup", true, 4.00);
		C2 = new MenuItem("Chicken", "Chicken Soup", false, 2.00);

		MenuItemList.add(C1);
	}

	@Test
	public void viewAllCustomerTEST() {
		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", MenuItemList);

		assertEquals("Test if  Cat values are added into Arraylist ", C1.getcategory(),
				MenuItemList.get(0).getcategory());
		assertEquals("Test if  name values are added into Arraylist ", C1.getname(), MenuItemList.get(0).getname());
		assertEquals("Test if  Boolean values are added into Arraylist ", C1.ishealthyChoice(),
				MenuItemList.get(0).ishealthyChoice());
		assertEquals("Test if  price values are added into Arraylist ", C1.getprice(), MenuItemList.get(0).getprice());

	}

	@Test
	public void addCustomerTEST() {
		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", MenuItemList);
		assertEquals("Test that CustomerList arraylist size is 0", 1, MenuItemList.size());

		// test if add to arraylist
		MenuItemList.add(C2);

		// check if customer added
		assertEquals("Test if  Cat values are added into Arraylist ", C2.getcategory(),
				MenuItemList.get(1).getcategory());
		assertEquals("Test if  name values are added into Arraylist ", C2.getname(), MenuItemList.get(1).getname());
		assertEquals("Test if  Boolean values are added into Arraylist ", C2.ishealthyChoice(),
				MenuItemList.get(1).ishealthyChoice());
		assertEquals("Test if  price values are added into Arraylist ", C2.getprice(), MenuItemList.get(1).getprice());
	}

	@Test
	public void delCustomerTEST() {
		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", MenuItemList);

		// check if arraylist has an item inside
		assertEquals("Test that CustomerList arraylist size is 1", 1, MenuItemList.size());

		// remove customer
		MenuItemList.remove(0);

		// Test if the code list has worked
		assertEquals("Test that CustomerList arraylist size is 1", 0, MenuItemList.size());

	}

	@Test
	public void updateCustomerTEST() {

		// check if arraryList is empty
		assertNotNull("check if arraryList is empty", MenuItemList);

		// new update for customer
		C1 = new MenuItem("Fish", "Fish Soup", true, 4.00);

		// update customer
		MenuItemList.set(0, C1);

		// check if customer updated.
		assertEquals("Test if  Cat values are added into Arraylist ", C1.getcategory(),
				MenuItemList.get(0).getcategory());
		assertEquals("Test if  name values are added into Arraylist ", C1.getname(), MenuItemList.get(0).getname());
		assertEquals("Test if  Boolean values are added into Arraylist ", C1.ishealthyChoice(),
				MenuItemList.get(0).ishealthyChoice());
		assertEquals("Test if  price values are added into Arraylist ", C1.getprice(), MenuItemList.get(0).getprice());
	}

	@After
	public void tearDown() throws Exception {
		C1 = null;
		C2 = null;

		MenuItemList = null;
	}

}
