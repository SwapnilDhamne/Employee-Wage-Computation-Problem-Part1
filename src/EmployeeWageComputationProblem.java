public class EmployeeWageComputationProblem {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_FULL_DAY_HOUR = 8;
    static final int EMP_HALF_DAY_HOUR = 4;
    static final int TOTAL_WORKING_DAYS = 10;

    private int empId;
    private int empWagePerHour;
    private float empTotalPresentDays;
    private float empTotalAbsentDays;
    private int empTotalPresentFullDays;
    private int empTotalPresentHalfDays;

    EmployeeWageComputationProblem(int empId) {
        this.empId = empId;
    }

    public void wageCalculations() {
        double randomNum = Math.floor(Math.random() * 10) % 3;
        switch ((int) randomNum) {
            case IS_FULL_TIME:
                empWagePerHour += EMP_FULL_DAY_HOUR;
                empTotalPresentFullDays++;
                break;
            case IS_PART_TIME:
                empWagePerHour += EMP_HALF_DAY_HOUR;
                empTotalPresentHalfDays++;
                break;
        }
        empTotalPresentDays = empTotalPresentFullDays + (empTotalPresentHalfDays/2);
        empTotalAbsentDays = TOTAL_WORKING_DAYS - empTotalPresentDays;
    }

    public void displayDetails() {
        System.out.println("\n--------------------------------------");
        System.out.println("Employee Id: " + this.empId);
        System.out.println("--------------------------------------");
        System.out.println("Total days: " + TOTAL_WORKING_DAYS);
        System.out.println("Total absent days: " + this.empTotalAbsentDays);
        System.out.println("Total working hours: " + this.empWagePerHour);
        System.out.println("Total full days: " + this.empTotalPresentFullDays);
        System.out.println("Total half days: " + this.empTotalPresentHalfDays);
        System.out.println("Total present " + this.empTotalPresentDays + " days in a month and wage is " + this.empWagePerHour);
    }

}
