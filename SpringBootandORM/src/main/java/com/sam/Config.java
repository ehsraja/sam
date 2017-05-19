package com.sam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Config {
	
	public Config() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	

	private String profile ; 
	
	private String key ;
	
	private String value ;
	
	
	public Config(String profile, String key, String value) {
		super();
		this.profile = profile;
		this.key = key;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	} 
	
	
}