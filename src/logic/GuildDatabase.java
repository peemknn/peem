package logic;

import java.util.ArrayList;

public class GuildDatabase {
	private ArrayList<Department> myDepartments;
	
	public GuildDatabase(){
		//TODO: Initialize myDepartments as a new arrayList of Departments.
		myDepartments = new ArrayList<Department>() ;
	}
	
	public boolean createDepartment(String name) {
		//TODO: If the submitted name is not in the list of departments,
		//create a new department, add it to myDepartments, and return true.
		Department newDepartment = new Department(name) ;
		if (!this.isExists(name)) {
			myDepartments.add(newDepartment) ;
			return true ;
		}
		//TODO: If the name IS in the list, then DO NOT create a new
		//department, and return false.
		
		//HINT: Look at the below method and think how you could use it here.
		
		return false;
	}
	
	public boolean isExists(String name) {
		//TODO: Create a boolean that verifies whether or not the submitted
		//name already exists in myDepartment
		for (Department eachDepartment : myDepartments) {
			if (eachDepartment.getName().equals(name)) {
				return true ;
			}
		}
		//TODO: Create a loop that cycles through each member of myDepartments.
		
		//TODO: If the name already exists in the list of departments, return true.
		//If not, return false.
		
		return false;
	}
	
	public ArrayList<GuildMember> removeDepartment(int index){
		//TODO: Remove a department at the given index from the list, and return a list containing all the members in that department.
		ArrayList<GuildMember> removed = myDepartments.get(index).getAllMembers() ;
		myDepartments.remove(index) ;
		return removed ;
	}
	
	//------------------------------------------
	//---do not edit anything below this line---
	//----but feel free to look at the code!----
	//------------------------------------------
	
	public Department getDepartment(int index) {
		return myDepartments.get(index);
	}
	
	public void printDepartments() {
		int i = 0;
		for (Department d : myDepartments) {
			System.out.println(i + ") " + d);
			i++;
		}
	}
	
	public int departmentCount() {
		return myDepartments.size();
	}
}
