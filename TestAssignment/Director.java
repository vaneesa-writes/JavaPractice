package TestAssignment;

import java.text.NumberFormat;
import java.util.Locale;

public class Director extends Manager{
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        NumberFormat nf
                = NumberFormat.getInstance(Locale.US);
        return super.toString()+ " ,budget=" + nf.format(budget);
    }
}
