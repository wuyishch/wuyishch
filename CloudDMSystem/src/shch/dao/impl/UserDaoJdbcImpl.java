package shch.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import shch.dao.UserDao;
import shch.domain.User;
import shch.exception.DaoException;
import shch.Utils.JdbcUtils;

public class UserDaoJdbcImpl implements UserDao {

	public void add(User user) {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "insert into users(id,username,password,email,birthday) values(?,?,?,?,?)";
			st = conn.prepareStatement(sql);
			st.setString(1, user.getId());
			st.setString(2, user.getUsername());
			st.setString(3, user.getPassword());
			st.setString(4, user.getEmail());
			st.setString(5, user.getPhone());
			st.setString(6, user.getCity());
			st.setDate(7, new java.sql.Date(user.getBirthday().getTime()));  //sql
			
			st.executeUpdate();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}

	}
	//username = ' or 1=1 or username='  java--class
	public User find(String username, String password) {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			
			String sql = "select * from users where username=? and password=?";
			st = conn.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			
			rs = st.executeQuery();  //
			if(rs.next()){
				User user = new User();
				user.setId(rs.getString("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setCity(rs.getString("city"));
				user.setBirthday(rs.getDate("birthday"));
				return user;
			}
			return null;
		}catch (Exception e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
	}

	public User find(String username) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "select * from users where username=?";
			st = conn.prepareStatement(sql);
			st.setString(1, username);
			
			rs = st.executeQuery();
			if(rs.next()){
				User user = new User();
				user.setId(rs.getString("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setCity(rs.getString("city"));
				user.setBirthday(rs.getDate("birthday"));
				return user;
			}
			return null;
		}catch (Exception e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
	}
public void update(User user) {
		
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try{
			conn = JdbcUtils.getConnection();
			String sql = "update users set username=?,password=?,email=?,phone=?,city=? where id=?";
			st = conn.prepareStatement(sql);
			st.setString(1, user.getUsername());
			st.setString(2, user.getPassword());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPhone());
			st.setString(5, user.getCity());
			st.setString(6, user.getId());
			st.executeUpdate();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}finally{
			JdbcUtils.release(conn, st, rs);
		}

	}

}
