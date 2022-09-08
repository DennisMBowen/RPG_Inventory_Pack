package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Backpack;
import model.Item;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */
public class TestBackpack1 {
	Backpack backpackOne = new Backpack(0, 10);
	Item item = new Item("Longsword", 10);
	
	@Before
	public void setUp() throws Exception {
	}

	//Test that declaring an Backpack object works correctly by using a notNull test
	@Test
	public void testAddItemToBackPack() {
		assertNotNull(backpackOne);
	}
	
	//Tests that the Within weight limit method is working correctly with under weight item
	@Test
	public void testBackpackWithinWeightLimit() {
		assertTrue(backpackOne.isUnderWeightLimit(item));
	}
	
	//Tests that the Within weight limit method is working correctly with over weight item
	@Test
	public void testBackpackOverWeightLimit() {
		item.setWeight(11);
		assertFalse(backpackOne.isUnderWeightLimit(item));
	}
	
	//Tests the Increase Weight Limit method
	@Test
	public void testIncreaseWeightLimit() {
		assertEquals(6, backpackOne.increaseTotalWeight(6));
	}
	
	

}
