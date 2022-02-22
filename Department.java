package org.department;
import org.college.College;
public class Department extends College  {

	public void deptName() {

		System.out.println("Ece");}
	
	public static void main(String[] args) {
		Department depart = new Department();
depart.deptName();
	}

}
