package TestAssignment;
import java.text.*;
import java.util.Locale;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raisesalary(double increase){
        this.salary += increase;
    }

    @Override
    public String toString() {
        NumberFormat nf
                = NumberFormat.getInstance(Locale.US);
        return
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + nf.format(salary);
    }
}
