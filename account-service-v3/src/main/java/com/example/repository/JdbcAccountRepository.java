package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.example.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static final Logger LOGGER = Logger.getLogger("App");

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		LOGGER.info("JdbcAccountRepository created with datasource");
	}

	@Override
	public Account load(String accNum) {
		LOGGER.info("loading account : " + accNum);
		Account account = new Account();
		try {
			Connection con = dataSource.getConnection();
			String sql = "select * from ACCOUNTS where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, accNum);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				account.setNumber(rs.getString("num"));
				account.setBalance(rs.getDouble("balance"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public Account update(Account account) {
		//
		LOGGER.info("updating account : " + account.getNumber());

		try {
			Connection con = dataSource.getConnection();
			String sql = "update ACCOUNTS set balance=? where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, account.getBalance());
			ps.setString(2, account.getNumber());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return account;
	}

}
