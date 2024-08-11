package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TESTDep 1: department insert ====");
		Department newDepartment = new Department(null,"Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("=== TESTDep 2: department update ====");
		Department department = new Department(6,"Food");
		departmentDao.update(department);
		System.out.println("Updated Completed! ");
		
		System.out.println("=== TESTDep 3: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed! ");
		
		System.out.println("=== TESTDep 4: department findById ====");
		department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("=== TESTDep 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
