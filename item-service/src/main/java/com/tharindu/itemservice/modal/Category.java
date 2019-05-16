package com.tharindu.itemservice.modal;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@NotBlank(message="Name is mandotary")
	String name;
	@OneToMany(mappedBy ="category")
	
	@JsonIgnore
	List<ItemType> types;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ItemType> getTypes() {
		return types;
	}
	public void setTypes(List<ItemType> types) {
		this.types = types;
	}
	
	
	
	
	

}
