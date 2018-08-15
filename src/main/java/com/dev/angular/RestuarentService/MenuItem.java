package com.dev.angular.RestuarentService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu_item")
public class MenuItem {
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemID;
	
	@Column(name = "name")
	private String itemName;
	
	@Column(name = "price")
	private Float itemPrice;
	
	@Column(name = "spice_level")
	private Integer spicyLevel;
	
	public Integer getItemID() {
		return itemID;
	}
	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}	
	public Float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getSpicyLevel() {
		return spicyLevel;
	}
	public void setSpicyLevel(Integer spicyLevel) {
		this.spicyLevel = spicyLevel;
	}
	@Override
	public String toString() {
		return "MenuItem [itemID=" + itemID + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", spicyLevel="
				+ spicyLevel + "]";
	}
	
	
	
}
