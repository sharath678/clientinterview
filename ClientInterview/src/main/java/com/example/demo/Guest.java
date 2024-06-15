package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Guest_tb")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Guest_id;
	private String Guest_name;
	public Guest() {
		super();
	}
	public Guest(int guest_id, String guest_name) {
		super();
		Guest_id = guest_id;
		Guest_name = guest_name;
	}
	public int getGuest_id() {
		return Guest_id;
	}
	public void setGuest_id(int guest_id) {
		Guest_id = guest_id;
	}
	public String getGuest_name() {
		return Guest_name;
	}
	public void setGuest_name(String guest_name) {
		Guest_name = guest_name;
	}
	@Override
	public String toString() {
		return "Guest [Guest_id=" + Guest_id + ", Guest_name=" + Guest_name + "]";
	}
	
	
}
