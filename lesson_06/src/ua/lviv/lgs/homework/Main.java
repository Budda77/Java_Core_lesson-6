package ua.lviv.lgs.homework;

public class Main {
	public static void main(String[] args) {
		
		HourlySalaryEmployee employeePerHour = new HourlySalaryEmployee();	
		
		employeePerHour.wage(10);
		
		FixedSalaryEmploee employeePerMonth = new FixedSalaryEmploee();
		
		employeePerMonth.wage(1500);
		
	}

}
