package codingtonportal.model.inter.dao;

import codingtonportal.model.domain.Visitor;

public interface IVisitor {
	public void insertvisitor(Visitor visitor);
	public void loginvisitor(String Username, String Password);
	public void deletevisitor(Visitor visitor);
	public void updateinformation(Visitor visitor);
	public void updatepassword(Visitor visitor);
	public void registerevent(int IdUser, int IdEvent);
	public void unregisterevent(int IdUser, int IdEvent);
	public void searchevent(String Search);
	public void viewevent();
	
	
	}
