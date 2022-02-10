package ua.lviv.lgs.homework;

public class HourlySalaryEmployee implements Salary{

	@Override
	public void wage(int number) {
		System.out.println("The employee's salary per hour is " + number + " USD");
		
	}

}
