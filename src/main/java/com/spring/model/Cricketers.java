package com.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cricketers {
	
	@Id
	private int cric_id;
	private String cric_name;
	private float average;
	private float strike_rate;
	public int getCric_id() {
		return cric_id;
	}
	public void setCric_id(int cric_id) {
		this.cric_id = cric_id;
	}
	public String getCric_name() {
		return cric_name;
	}
	public void setCric_name(String cric_name) {
		this.cric_name = cric_name;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public float getStrike_rate() {
		return strike_rate;
	}
	public void setStrike_rate(float strike_rate) {
		this.strike_rate = strike_rate;
	}
	@Override
	public String toString() {
		return "Cricketers [cric_id=" + cric_id + ", cric_name=" + cric_name + ", average=" + average + ", strike_rate="
				+ strike_rate + "]";
	}
	
	

}
