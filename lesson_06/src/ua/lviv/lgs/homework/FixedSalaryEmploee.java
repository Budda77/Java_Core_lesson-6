package ua.lviv.lgs.homework;

public class FixedSalaryEmploee implements Salary{

	@Override
	public void wage(int number) {
		System.out.println("Fixed monthly salary of the employee is " + number + " USD");
		
	}

}
