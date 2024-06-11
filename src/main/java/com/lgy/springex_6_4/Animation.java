package com.lgy.springex_6_4;

import java.util.ArrayList;

public class Animation {
	String title;
	int year;
	ArrayList<String> charater;
	
	public Animation(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public ArrayList<String> getCharater() {
		return charater;
	}
	public void setCharater(ArrayList<String> charater) {
		this.charater = charater;
	}
	
	
}
