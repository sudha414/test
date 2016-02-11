package com.test.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
	//private static Logger log = Logger.getLogger(EmployeeDAO.class);	
	static Connection con = null;
	static Statement stmt =null;
	ResultSet rs = null;

	private static String driver = "com.mysql.jdbc.Driver";
	static String connectionURL = "jdbc:mysql://localhost/employee";
	/**
	 * 
	 * @param rs
	 * @param stmt
	 * @param con
	 */
	private void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
	/**
	 * 
	 */
	public EmployeeDAOImpl() {
		try{
			Class.forName(driver);//Loading a driver...
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
		}

		try{
			con = DriverManager.getConnection(connectionURL,"root","root");
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public List<EmployeeDO> getEmployees(){
		EmployeeDO empdo = null;
		
		List<EmployeeDO> empList = new ArrayList<EmployeeDO>();
		try{
			System.out.println("in DAO Impl ");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select id,age, firstname , lastname from employees");
			
			while(rs.next()){
				empdo = new EmployeeDO();
				empdo.setAge(rs.getInt("age"));
				empdo.setId(rs.getInt("id"));
				//empdo.setId(rs.getInt("id")+"");
				empdo.setFirstName(rs.getString("firstname"));
				empdo.setLastName(rs.getString("lastname"));
				
				
				empList.add(empdo);
			}

		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			closeConnections(rs,stmt,con);
		}
		
		return empList;		
	}
	public EmployeeDO getEmployeeDetails(int id){
		EmployeeDO empdo = new EmployeeDO();
		try{
			stmt = con.createStatement();
			System.out.println(" in Employee DAOImpl"+id);
			rs = stmt.executeQuery("select id,age, firstname , lastname from employees where id ="+id);
			while(rs.next()){
				empdo.setId(rs.getInt("id"));
				empdo.setAge(rs.getInt("age"));
				empdo.setFirstName(rs.getString("firstname"));
				empdo.setLastName(rs.getString("lastname"));
				
			}

		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			closeConnections(rs,stmt,con);
		}
		
		return empdo;
	}
	
}