package com.example.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
import com.example.model.Txn;

@Repository("jdbcAccountRepository")
@Qualifier("jdbc")
public class JdbcAccountRepository implements AccountRepository {

	private static final Logger LOGGER = Logger.getLogger("App");

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		LOGGER.info("JdbcAccountRepository created with datasource");
	}

	@Override
	public Account load(String accNum) {
		LOGGER.info("loading account : " + accNum);
		String sql = "select * from ACCOUNTS where num=?";
		Account account = new Account();
		jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
			account.setNumber(rs.getString("num"));
			account.setBalance(rs.getDouble("balance"));
			return account;
		}, accNum);
		return account;
	}

	@Override
	public Account update(Account account) {
		LOGGER.info("updating account : " + account.getNumber());
		String sql = "update ACCOUNTS set balance=? where num=?";
		int rowCount = jdbcTemplate.update(sql, account.getBalance(), account.getNumber());
		return account;
	}

	@Override
	public void save(Txn txn) {
		String sql = "insert into TXNS(amount,closing_balance,date,type,acc_num) values (?,?,?,?,?)";
		jdbcTemplate.update(
				sql, 
				txn.getAmount(), 
				txn.getClosingBalance(), 
				txn.getLocalDateTime(), 
				txn.getType().name(),
				txn.getAccount().getNumber()
				);
	}

}
