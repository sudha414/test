package com.test.jsp.employee;

import java.util.List;

public interface EmployeeDAO{
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public EmployeeDO getEmployeeDetails(int id);
	public List<EmployeeDO> getEmployees();
}
