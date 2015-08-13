package main;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class Transaction
{
	private int ID;
	private String account_number;
	private int transaction_type_id;
	private String transaction_date;
	private GregorianCalendar t_date;
	private set_date set ;

	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public int getTransaction_type_id() {
		return transaction_type_id;
	}
	public void setTransaction_type_id(int transaction_type_id) {
		this.transaction_type_id = transaction_type_id;
	}
	public GregorianCalendar getTransaction_date() {
		return t_date;
	}
	public void setTransaction_date(String transaction_date) {
		set = new set_date();
		set.setDate(transaction_date);
		t_date = new GregorianCalendar(set.getYear(),set.getMonth(),set.getDay()) ;
	}
	

}
