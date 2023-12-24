//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import TestAssignment.Director;
import TestAssignment.EmployeeTest;

public class Main {
    public static void main(String[] args) {

        EmployeeTest employeeTestObject = new EmployeeTest();

        employeeTestObject.printEmployee(new Director(4,"ravi","9853",77.23,"software",9996.32));

    }
}