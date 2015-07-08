package shch.dao;

import shch.domain.User;

public interface UserDao {

	User find(String username, String password);

	void add(User user);
	void update(User user);

	User find(String username);

}