package shch.service;

import shch.domain.User;
import shch.exception.UserExistException;

public interface BusinessService {

	//�ṩע�����
	void registerUser(User user) throws UserExistException;
	void updateUser(User user) throws UserExistException;
	User loginUser(String username, String password);

}