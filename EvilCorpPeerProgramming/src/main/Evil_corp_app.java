package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Evil_corp_app {
	public static void main(String [] args){
		
		//Identifying arraylist for both Account and transaction classes.
		ArrayList<Account> list_of_accounts = new ArrayList<Account> ();
		ArrayList<Transaction> list_of_transactions = new ArrayList<Transaction> ();
		
		//Initializing objects for both Account and transaction classes.
		Account account = new Account();
		Transaction transaction = new Transaction();
		
		Scanner key = new Scanner(System.in);
		Validator val = new Validator();
		
		//Initializing parameters for account class
		int ID = 0;
		String account_number;
		String name;
		String starting_balance;
		String birth_date;
		
		//Initializing parameters for transaction class.
		
		int transaction_ID = 0;
		//private String account_number;
		int transaction_type_id;
		double amount;
		String transaction_date;
		
		//Operator + for deposit, - for other transaction.
		String operator;
		
		System.out.println("Welcome to Evil Corp bank Accounts");
		
		while(true){

			
			//Entering account number or -1 to exit.
			System.out.println("Enter account number or -1 to exit entering account: ");
			account_number = key.next();
			key.nextLine();
		
			if(account_number == "-1"){break;}
			
			//Increment ID by one for each account added.
			
			ID++;
			account.setID(ID);
			account.setAccount_number(account_number);
	
			//Enter the account name.
			
			System.out.println("Enter the account name : ");
			name = key.next();
			key.nextLine();
			
			account.setName(name);
			
			//Enter Starting balance.
			System.out.println("Enter the starting balance : ");
			starting_balance = key.next();
			key.nextLine();
			balance_loop:
				while(true){
					if(val.validateIntWithRange(starting_balance, 1, 20)){
						break balance_loop;
					}else{System.out.println("Invalid account number, try again.");}
				}
	
			account.setStarting_balance(Double.parseDouble(starting_balance));
			
			//Enter birth date as the format "mm/dd/yyyy", no other formats accepted.
			System.out.println("Enter the date of birth : ");
			birth_date = key.next();
			key.nextLine();
			
			date_loop:
				while(true){
					if(val.validateDateWithFormat(birth_date)){
						break date_loop;
					}else{System.out.println("Invalid date, try again.");}
				
				}
			account.setBirth_date(birth_date);
			list_of_accounts.add(account);
			
		}
		
		
		System.out.println("Welcome to Evil Corp bank Transactions");

		
		while(true){
			System.out.println("Enter account number or -1 to exit transactions: ");
			account_number = key.next();
			key.nextLine();
			
			
			//Look for the account number and see if that in the database.
			transaction.setAccount_number(account_number);
			
			transaction_ID ++;
			transaction.setID(transaction_ID);
			
			System.out.println("Enter the transaction type: \n"
					+ "1 - Deposite.\n"
					+ "2 - Check.\n"
					+ "3 - Withdrawal.\n"
					+ "4 - Debit Card.");
			transaction_type_id = key.nextInt();
	
		
			
			transaction.setTransaction_type_id(transaction_type_id);
			
			System.out.println("Enter Transaction amount: ");
			amount = key.nextDouble();
	
			
			transaction.setAmount(Double.parseDouble(amount));
			
			
			System.out.println("Enter Transaction date: (MM/DD/YYYY)");
			
			transaction_date =  key.next();
			key.nextLine();
			
			transaction.setTransaction_date(transaction_date);
			
			//Process transaction.
			transaction.process_transaction(account);
			
			
			list_of_transactions.add(transaction);

		}
		
		//operator = (transaction_type_id == "2" || transaction_type_id == "3" || transaction_type_id == "4") ? "-" : "+";
		
		
	}
}
