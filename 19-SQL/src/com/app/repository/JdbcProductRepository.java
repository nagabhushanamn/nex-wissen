package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.db.SQLConnectionFactory;
import com.app.model.Product;

public class JdbcProductRepository implements ProductRepository {

	@Override
	public void save(Product product) {
		Connection connection = null;
		try {
			connection = SQLConnectionFactory.getConnection();

			String sql = "insert into PM.PRODUCTS(name,price,type) values(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setString(3, product.getType().name());

			int count = ps.executeUpdate();
			if (count == 1)
				System.out.println("New record inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void findById(int id) {

	}

	@Override
	public void delete(int id) {

	}

	@Override
	public void update(int id, double price) {

	}

	@Override
	public List<Product> findAl() {
		// TODO Auto-generated method stub
		return null;
	}

}
