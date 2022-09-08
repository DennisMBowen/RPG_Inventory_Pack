package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Backpack;
import model.Item;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
public class TestBackpack2 {
	Backpack backpackTwo = new Backpack(0, 40);
	Item testItem = new Item ("Spellbook", 5);
	Item testItemTwo = new Item ("Shield", 41);
	ArrayList<Item> testList = backpackTwo.getListOfItems();;
	
	@Before
	public void setUp() throws Exception {
	}
	
	//Test that declaring an Item object works correctly by using a notNull test
	@Test
	public void testItemObjectCreation() {
		assertNotNull(testItem);
	}
	
	//Test that the initial list of Items in a Backpack object is empty
	@Test
	public void testBackpackIsEmpty() {
		assertEquals(0, testList.size()); 
	}

	//Tests that the Add Item to Backpack works properly
	@Test
	public void testAddItemToBackpack() {
		backpackTwo.addItemToBackpack(testItem);
		assertEquals(1, testList.size()); 
	}
	
	//Tests that the item's weight was added to the backpack 
	@Test
	public void testWeightIncrease() {
		backpackTwo.addItemToBackpack(testItem);
		int testWeight = backpackTwo.getTotalWeight();
		assertEquals(5, testWeight);
	}
	
	//Tests that the list of Items is empty again for next test
	@Test
	public void testBackpackIsEmpty2() {
		assertEquals(0, testList.size()); 
	}
	
	//Tests that an overweight item is not added to the list
	@Test
	public void testAddOverweightItem() {
		backpackTwo.addItemToBackpack(testItemTwo);
		assertNotEquals(1, testList.size()); 
	}

}
