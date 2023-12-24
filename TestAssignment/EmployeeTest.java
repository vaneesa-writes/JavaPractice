package TestAssignment;

public class EmployeeTest {
    Employee engineerObject = new Engineer(1,"ram","12345",120.23);
    Employee managerObject = new Manager(2,"raghu","7894",510.36,"cooking");
    Employee adminObject = new Admin(3,"roshan","45612",896.21);
    Employee directorObject = new Director(4,"ravi","9853",77.23,"software",9996.32);

    public void printEmployee(Employee employeeObject){
        System.out.println(employeeObject);
    }
}
