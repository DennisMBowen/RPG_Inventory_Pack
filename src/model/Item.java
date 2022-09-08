package model;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 5, 2022
 */

public class Item {
	String name;
	Integer weight;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	//Default no-arg constructor
	public Item() {
		super();
	}
	
	//Constructor that takes name and weight parameters
	public Item(String name, Integer weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	//To String method
	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + "]";
	}
	
}
