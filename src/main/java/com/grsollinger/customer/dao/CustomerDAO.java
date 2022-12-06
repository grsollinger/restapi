package com.grsollinger.customer.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grsollinger.core.dao.AbstractGenericDAO;
import com.grsollinger.customer.Customer;

@Component
public class CustomerDAO extends AbstractGenericDAO<Customer> {

	@Autowired
	private DataSource dataSource;
	private static final Logger LOGGER = LogManager.getLogger(CustomerDAO.class);

	@Override
	public Optional<Customer> get(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> lista = new ArrayList<>();
		String sql = "select * from test.customer";
		try {
			PreparedStatement ps = this.dataSource.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int pos = rs.getInt("id");
				String nombre = rs.getString("nombre");
				Customer customer = new Customer(pos, nombre);
				lista.add(customer);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			LOGGER.error("getAll()", ex);
		}
		return lista;
	}

	@Override
	public int save(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Customer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer t) {
		// TODO Auto-generated method stub

	}

}
