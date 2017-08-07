package com.sam.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person  implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	public Person() {
		super();
	}
	
	String first_name ;


	String pplid ;
	String desk ;
	public Person(String first_name, String pplid, String desk) {
		super();
		this.first_name = first_name;
		this.pplid = pplid;
		this.desk = desk;
	}

	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getPplid() {
		return pplid;
	}
	public void setPplid(String pplid) {
		this.pplid = pplid;
	}
	public String getDesk() {
		return desk;
	}
	public void setDesk(String desk) {
		this.desk = desk;
	} 
	@Override
	public String toString() {
		return "Person [first_name=" + first_name + "]";
	}

}
