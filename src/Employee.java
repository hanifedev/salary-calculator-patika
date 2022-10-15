public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int thisYear = 2021;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    @Override
    public String toString() {
        return "Name: " + name 
        + "\nSalary: " + salary 
        + "\nWork Hours: " + workHours 
        + "\nHire Year: " + hireYear 
        + "\nTax: " + tax() 
        + "\nBonus: " + bonus() 
        + "\nSalary Raise: " + raiseSalary() 
        + "\nSalary with Tax and Bonus: " +  (salary + bonus() - tax()) 
        + "\nTotal Salary: " + (salary + bonus());
    }

    private double tax() {
        if(this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    private double bonus() {
        if(this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    private double raiseSalary() {
        int experience = this.thisYear - this.hireYear;
        double salaryWithTaxAndBonus = this.salary + bonus() - tax();
        if(experience < 10) {
            return salaryWithTaxAndBonus * 0.05;
        } else if(experience >= 10 && experience < 20) {
            return salaryWithTaxAndBonus * 0.10;
        } else {
            return salaryWithTaxAndBonus * 0.15;
        }
    }
}
