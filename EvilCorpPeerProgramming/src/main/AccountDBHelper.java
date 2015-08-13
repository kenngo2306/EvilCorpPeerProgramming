package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDBHelper
{
	public ArrayList<Account> getAllAccounts()
	{
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		return accounts;
	}
	
	private Connection getConnection()
	{
		Connection conn = null;
		try
		{
			conn =  DBConnection.getConnection();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
