package com.marmodpro;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
List<String>empNames;
Set<Integer>empId;
Map<String, Integer>degignadetail;
public Employee() {
	super();
}
public Employee(List<String> empNames, Set<Integer> empId, Map<String, Integer> degignadetail) {
	super();
	this.empNames = empNames;
	this.empId = empId;
	this.degignadetail = degignadetail;
}
public List<String> getEmpNames() {
	return empNames;
}
public void setEmpNames(List<String> empNames) {
	this.empNames = empNames;
}
public Set<Integer> getEmpId() {
	return empId;
}
public void setEmpId(Set<Integer> empId) {
	this.empId = empId;
}
public Map<String, Integer> getDegignadetail() {
	return degignadetail;
}
public void setDegignadetail(Map<String, Integer> degignadetail) {
	this.degignadetail = degignadetail;
}
public void printEmploye() {
	System.out.println(empNames);
	System.out.println(empId);
	System.out.println(degignadetail);
}




}
