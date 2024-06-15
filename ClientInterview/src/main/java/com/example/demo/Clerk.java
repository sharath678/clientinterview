package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="clerk_tb")
public class Clerk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clerk_id;
	private String clerk_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Guest> guest=new ArrayList<Guest>();

	public Clerk() {
		super();
	}

	public Clerk(int clerk_id, String clerk_name, List<Guest> guest) {
		super();
		this.clerk_id = clerk_id;
		this.clerk_name = clerk_name;
		this.guest = guest;
	}

	public int getClerk_id() {
		return clerk_id;
	}

	public void setClerk_id(int clerk_id) {
		this.clerk_id = clerk_id;
	}

	public String getClerk_name() {
		return clerk_name;
	}

	public void setClerk_name(String clerk_name) {
		this.clerk_name = clerk_name;
	}

	public List<Guest> getGuest() {
		return guest;
	}

	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}

	@Override
	public String toString() {
		return "Clerk [clerk_id=" + clerk_id + ", clerk_name=" + clerk_name + ", guest=" + guest + "]";
	}
	
	
}
