package com.tharindu.itemservice.modal;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	BigDecimal salesPrice;
	BigDecimal unitPrice;
	@ManyToOne
	@JoinColumn
	ItemType itemType;
	String uOM;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public String getuOM() {
		return uOM;
	}
	public void setuOM(String uOM) {
		this.uOM = uOM;
	}

}
