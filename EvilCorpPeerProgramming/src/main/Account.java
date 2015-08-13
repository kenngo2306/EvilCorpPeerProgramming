package main;

import java.util.GregorianCalendar;

public class Account
{
	private int ID;
	private long account_number;
	private String name;
	private int starting_balance;
	private GregorianCalendar birth_date;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStarting_balance() {
		return starting_balance;
	}
	public void setStarting_balance(int starting_balance) {
		this.starting_balance = starting_balance;
	}
	public GregorianCalendar getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(GregorianCalendar birth_date) {
		this.birth_date = birth_date;
	}
	
	
}
