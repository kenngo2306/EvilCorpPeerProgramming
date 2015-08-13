package main;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class Transaction
{
	private int ID;
	private String account_number;
	private String transaction_type_id;
	private String transaction_date;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
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
	public String getTransaction_type_id() {
		return transaction_type_id;
	}
	public void setTransaction_type_id(String transaction_type_id) {
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
	
	
	public void process_transaction(Account account){
		
		switch (transaction_type_id){
		case "1":
			account.setStarting_balance(account.getStarting_balance() + amount);
			break;
		case "2":
		case "3":
		case "4":
			account.setStarting_balance(account.getStarting_balance() - amount);
			if(account.getStarting_balance() < 0){ 
				account.setStarting_balance(account.getStarting_balance() - 35);
			}
			break;
		default: System.out.println("Invalid transaction type.");
		}
	}

}
