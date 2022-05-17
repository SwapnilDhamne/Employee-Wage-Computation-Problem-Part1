
public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Assignment - Employee Wage Computation Problem");
        System.out.println("----------------------------------------------");

        EmployeeWageComputationProblem empObj = new EmployeeWageComputationProblem(1);
        for (int day = 0; day < empObj.TOTAL_WORKING_DAYS ; day++) {
            empObj.wageCalculations();
        }
        empObj.displayDetails();


        EmployeeWageComputationProblem empObj2 = new EmployeeWageComputationProblem(2);
        for (int day = 0; day < empObj2.TOTAL_WORKING_DAYS ; day++) {
            empObj2.wageCalculations();
        }
        empObj2.displayDetails();

        System.out.println("----------------------------------------------");
    }
}