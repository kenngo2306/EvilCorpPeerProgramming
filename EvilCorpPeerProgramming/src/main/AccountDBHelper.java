package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDBHelper
{
	public  ArrayList<Account> getAllAccounts()
	{
		ArrayList<Account> accounts = new ArrayList<Account>();

        String sql = "select * from accounts";

        //creating PreparedStatement object to execute query
        ResultSet result = executeSQL(sql);
        try
        {
        	 while(result.next())
             {
             	Account account = new Account();
             	account.setAccount_number(result.getString("account_number"));
             	account.setID(result.getInt("ID"));
             	
             	
             	
             	//TODO add fields for accounts
             	accounts.add(account);
             }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
       
		
		return accounts;
	}
	
	
	public ResultSet executeSQL(String sql)
	{
		Connection conn = null;
		ResultSet result = null;
		try
		{
			conn =  DBConnection.getConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql);
			result = preStatement.executeQuery();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
