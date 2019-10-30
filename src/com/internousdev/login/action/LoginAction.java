package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String password;

	public String execute()throws SQLException{
		String ret="error";

		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();

/**		System.out.println("userName :"+ name);
		System.out.println("password :"+ password);
*/
		dto=dao.select(name,password);

/**		System.out.println("db_userName :"+ dto.getName());
		System.out.println("db_password :"+ dto.getPassword());
*/
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
			ret="success";
		}
	}
	return ret;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}
