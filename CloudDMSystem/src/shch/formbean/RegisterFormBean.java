package shch.formbean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;


public class RegisterFormBean {

	private String username;
	private String password;
	private String password2;
	private String email;
	private String birthday;
	
	private Map<String,String> errors = new HashMap();
	
	
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/*
	private String username;  �û�����Ϊ�գ�����Ҫ��3-8���ַ� abcdABcd
	private String password;  ���벻��Ϊ�գ�����Ҫ��3-8������
	private String password2; ��������Ҫһ��
	private String email;     ����Ϊ�գ���Ϊ��Ҫ��һ���Ϸ�������
	private String birthday;  ����Ϊ�գ���Ϊ��ʱ��Ҫ��һ���Ϸ�������
	 * 
	 */
	public boolean validate(){
		
		boolean isOk = true;
		
		if(this.username==null || this.username.trim().equals("") ){
			isOk = false;
			errors.put("username", "�û�����Ϊ�գ���");
		}else{
			if(!this.username.matches("[a-zA-Z]{3,8}")){
				isOk = false;
				errors.put("username", "�û��������3-8λ����ĸ����");
			}
		}
		
		
		if(this.password==null || this.password.trim().equals("")){
			isOk = false;
			errors.put("password", "���벻��Ϊ�գ���");
		}else{
			if(!this.password.matches("\\d{3,8}")){
				isOk = false;
				errors.put("password", "���������3-8λ�����֣���");
			}
		}
		
		//private String password2; ��������Ҫһ��
		if(this.password2!=null){
			if(!this.password2.equals(this.password)){
				isOk = false;
				errors.put("password2", "�������벻һ�£���");
			}
		}
		
		//private String email;     ����Ϊ�գ���Ϊ��Ҫ��һ���Ϸ�������
		// flx_itcast@sina.com.cn
		if(this.email!=null){
			if(!this.email.matches("\\w+@\\w+(\\.\\w+)+")){
				isOk = false;
				errors.put("email", "���䲻��һ���Ϸ����䣡��");
			}
		}
		
		
		//private String birthday;  ����Ϊ�գ���Ϊ��ʱ��Ҫ��һ���Ϸ�������
		if(this.birthday!=null){
			try{
				DateLocaleConverter conver = new DateLocaleConverter();
				conver.convert(this.birthday);
			}catch (Exception e) {
				isOk = false;
				errors.put("birthday", "���ձ���Ҫ��һ�����ڣ���");
			}
		}
		
		return isOk;
	}
	
	
	
}
