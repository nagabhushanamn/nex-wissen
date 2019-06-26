package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.db.SQLConnectionFactory;
import com.app.model.Product;
import com.app.model.ProductType;

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
	public Optional<Product> findById(int id) {

		Connection connection = null;
		Product product = null;
		try {
			connection = SQLConnectionFactory.getConnection();

			String sql = "select * from PM.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setType(ProductType.valueOf(rs.getString("type")));
			}
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

		return Optional.ofNullable(product);

	}

	@Override
	public void delete(int id) {

		Connection connection = null;
		try {
			connection = SQLConnectionFactory.getConnection();

			String sql = "delete from PM.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			int count = ps.executeUpdate();
			if (count == 1)
				System.out.println("record deleted");

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
	public void update(int id, double price) {

		Connection connection = null;
		try {
			connection = SQLConnectionFactory.getConnection();

			String sql = "update PM.PRODUCTS p set p.price=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, price);
			ps.setInt(2, id);

			int count = ps.executeUpdate();
			if (count == 1)
				System.out.println("record updated");

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
	public List<Product> findAll() {
		Connection connection = null;
		List<Product> products = new ArrayList<>();
		try {
			connection = SQLConnectionFactory.getConnection();

			String sql = "select * from PM.PRODUCTS ";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setType(ProductType.valueOf(rs.getString("type")));
				products.add(product);
			}
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

		return products;

	}

}
