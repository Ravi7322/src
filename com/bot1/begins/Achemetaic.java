package com.bot1.begins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Achemetaic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/schooldetials1";
		String user = "root";
		String password = "root@123";
		Connection con = DriverManager.getConnection(url, user, password);
	}
}

