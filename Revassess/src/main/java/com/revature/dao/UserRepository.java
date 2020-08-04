package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.revature.config.ConnectionUtil;
import com.revature.model.User;


public class UserRepository implements CrudRepository {
	private ConnectionUtil cu = ConnectionUtil.getInstance();
	Connection conn = cu.connect(); 
	
	public User saveUser(User u) {
		String sql;
		return null;
	}
	public Set<User> findAll(){
		String sql;
		return null;
	}
	public User findById(int id) {
		String sql = "SELECT * FROM APP_USER WHERE ID = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(id));
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				User u = new User();
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	public boolean update(User u) {
		String sql;
		return false;
	}
	public boolean deleteById(int id) {
		String sql;
		return false;
	}
	
	
}