package shch.service.impl;

import shch.dao.UserDao;
import shch.dao.impl.UserDaoJdbcImpl;
import shch.domain.User;
import shch.exception.UserExistException;
import shch.service.BusinessService;
import shch.Utils.DaoFactory;

//���������
public class BusinessServiceImpl implements BusinessService {

	UserDao dao = DaoFactory.getInstance().createUserDao();
	
	//�ṩע�����
	public void registerUser(User user) throws UserExistException{
		
		if(dao.find(user.getUsername())!=null){
			//checked exception 
			//unchecked exception
			//�����ױ���ʱ�쳣��ԭ����������һ�����������쳣���Ը��û�һ���Ѻ���ʾ
			throw new UserExistException("ע����û����Ѵ��ڣ�����");
		}
		
		dao.add(user);
	}
 public void updateUser(User user) throws UserExistException{
		
		if(user.getId()==null){
			//checked exception 
			//unchecked exception
			//�����ױ���ʱ�쳣��ԭ����������һ�����������쳣���Ը��û�һ���Ѻ���ʾ
			throw new UserExistException("ע����û����Ѵ��ڣ�����");
		}
		
		dao.update(user);
	}
	
	
	public User loginUser(String username,String password){
		return dao.find(username, password);
	}
	
}
