package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double tax = 0;

        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }
        else if (salary <= 10000) {
            tax = 0.15;
        } else if (salary <= 20000) {
            tax = 0.18;
        } else {
            tax = 0.2;
        }

        double totalSalary = salary - salary * tax;
        System.out.println(totalSalary);
    }
}
