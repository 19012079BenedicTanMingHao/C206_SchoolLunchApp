import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private MenuItem mi1;
	private MenuItem mi2;
	private Order o1;
	private Order o2;
	private Bill b1;
	private Bill b2;
	
	private ArrayList<MenuItem> menuItemList;
	private ArrayList<MenuItem> choosenMenuList;
	private ArrayList<Order> orderList;
	private ArrayList<Bill> BillList;

	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		mi1 = new MenuItem("Japanese","Sushi",true,5.00);
		mi2 = new MenuItem("Western","Fish&Chips",false,8.50);
		o1 = new Order("19012079","13/11/20",choosenMenuList);
		o1 = new Order("19012345","01/09/20",choosenMenuList);
		b1 = new Bill("ryan",55.00,"12/12/20");
		b2 = new Bill("ben",35.00,"12/12/20");
		
		menuItemList = new ArrayList<MenuItem>();
		choosenMenuList = new ArrayList<MenuItem>();
		orderList = new ArrayList<Order>();
		BillList= new ArrayList<Bill>();
	}


	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	//Ming Hao [Order Portion] 
	@Test
	public void addOrderTest() {
		//Order list is not null, so that an Order can be added into the List - Boundary
		assertNotNull("Check if there is valid Order arraylist to add to", orderList);
		
	}
	
	public void deleteOrderTest() {
		//Order list is not null, so that an Order can be deleted from the List - Boundary
		assertNull("Check if there is valid Order arraylist to delete from", orderList);
	}
	
	public void viewAllOrderTest() {
		//Order list is not null, so that an Orders can be viewed from the List - Boundary
		assertNull("Check if there is valid Order arraylist to view from", orderList);
	}
	

	
	@After
	public void tearDown() throws Exception {
	
	}
	//LiangKok bill
	@Test
	public void addBillTest() {
		// Item list is not null, so that can add a new item - boundary
	    assertNotNull("Check if there is valid bill arraylist to add to", BillList);
	}
	@Test
	public void deleteBillTest() {
		// Item list is not null, so that the item can be delete from the list - boundary
	    assertNotNull("Check if there is valid bill arraylist to delete", BillList);
	}
	@Test
	public void viewBillTest() {
		// Item list is not null, so that the item can be view from the list - boundary
	    assertNotNull("Check if there is valid bill arraylist to view", BillList);
	}
}
