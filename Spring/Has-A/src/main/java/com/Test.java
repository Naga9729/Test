package com;

public class Test {

	public static void main(String[] args) {

		Department dept=new Department();
		dept.setDeptId(102);
		dept.setDeptName("HR");
		
		Project proj=new Project();
		proj.setProjId("Ford001");
		proj.setProjName("Ford");
		proj.setLoc("Chennai");
		
		
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Praveen");
		emp.setSalary(764755);
		
		emp.setDept(dept);
		emp.setProj(proj);
		
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		System.out.println(emp.getDept().getDeptId());
		System.out.println(emp.getDept().getDeptName());
		
		System.out.println(emp.getProj().getProjId());
		System.out.println(emp.getProj().getProjName());
		System.out.println(emp.getProj().getLoc());
		
		
		
		
		
		
		
	}

}
