package model;

import java.util.ArrayList;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */

public class Backpack {
	private Integer totalWeight;
	private Integer weightLimit;
	ArrayList<Item> listOfItems = new ArrayList <Item>();
	
	//Getters and Setters
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	public Integer getWeightLimit() {
		return weightLimit;
	}
	public void setWeightLimit(Integer weightLimit) {
		this.weightLimit = weightLimit;
	}
	public ArrayList<Item> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(ArrayList<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}
	
	//Default no-arg constructor
	public Backpack() {
		super();
	}
	
	//Non-default constructor using fields
	public Backpack(Integer totalWeight, Integer weightLimit) {
		super();
		this.totalWeight = totalWeight;
		this.weightLimit = weightLimit;
	}
	
	//To String Method
	@Override
	public String toString() {
		return "Backpack [totalWeight=" + totalWeight + ", weightLimit=" + weightLimit + ", listOfItems=" + listOfItems
				+ "]";
	}
	
	/**
	 * A method to check if an item's weight under the backpack's weight limit
	 * @param item
	 * @return Boolean if the item's weight would put the total weight over the backpack's weight limit
	 */
	public boolean isUnderWeightLimit(Item item) {
		return item.getWeight() + this.getTotalWeight() <= this.getWeightLimit();
	}
	
	
	/**
	 * A method to increase the backpack's total weight by an item's weight
	 * @param The weight of an item
	 * @return The new total weight of the backpack
	 */
	public int increaseTotalWeight(int itemWeight) {
		return this.getTotalWeight() + itemWeight;
	}
	
	/**
	 * A Method to add an item, including it's weight, to the backpack
	 * @param item
	 */
	public void addItemToBackpack(Item item) {
		if (isUnderWeightLimit(item)) {
			this.listOfItems.add(item);
			this.setTotalWeight(increaseTotalWeight(item.getWeight()));
		}
	}

}
