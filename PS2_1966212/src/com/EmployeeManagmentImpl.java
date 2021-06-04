package com;

import java.util.*;

public abstract class EmployeeManagmentImpl implements EmployeeMan {

	private HashSet<BankEmployee> employeeset = new HashSet<BankEmployee>();
	public HashSet<BankEmployee> getEmployeeset(){
		return employeeset;
	}
	public void setEmployees(HashSet<BankEmployee> employees) {
		this.employeeset = employees;
	}
	
	boolean addEmployee(BankEmployee bank) {
		if(this.employeeset.add(bank)) {
			return true;
		}
		return false;
	}
}
