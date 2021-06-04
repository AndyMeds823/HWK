package com;

public class BankEmployee {
	protected int id;
	protected String Name;
	protected String Branch;
	protected String Dept;
	protected double Salary;
	protected boolean Perm;

	public BankEmployee(){
		
	}
	public BankEmployee(int id){
		this.id=id;
	}
	public BankEmployee(int id, String Name, String Branch,String Dept, double Salary,boolean Perm){
		this(Name,Branch,Dept,Salary,Perm);
		this.id=id;
	}
	public BankEmployee(String Name,String Branch,String Dept,double Salary, boolean Perm){
		this.Name= Name;
		this.Branch=Branch;
		this.Dept=Dept;
		this.Salary=Salary;
		this.Perm=Perm;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getBranch(){
		return Branch;
	}
	public void setBranch(String Branch){
		this.Branch=Branch;
	}
	public String getDept(){
		return Dept;
	}
	public void setDept(String Dept){
		this.Dept=Dept;
	}
	public double getSalary(){
		return Salary;
	}
	public void setSalary(double Salary){
		this.Salary=Salary;
	}
	public boolean getPerm(){
		return Perm;
	}
	public void setPerm(boolean Perm){
		this.Perm=Perm;
	}

	
}
