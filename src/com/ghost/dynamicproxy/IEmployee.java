package com.ghost.dynamicproxy;

public interface IEmployee {
	
	public int getId();

	public String getName();

	public Double getSalary();

	public void setId(int id);

	public void setName(String name);

	public void setSalary(Double salary);

	public void getHike(Double hikeAmount);

	public void payCut(Double cutAmount);

}
