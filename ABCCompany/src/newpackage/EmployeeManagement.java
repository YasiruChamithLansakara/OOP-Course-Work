
package newpackage;

class Employee
{
    private int empID;
    private String empName, department;
    private double salary, totalSalary;
    

    public Employee(int empID, String empName, String department, double salary)
    {
        setEmpID(empID);
        this.empName = empName;
        this.department = department;
        setSalary(salary);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        if(empID>0){
            this.empID = empID;
        }
        else{
            System.out.println("Employee ID must be a positive number!");
        }
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>=0){
            this.salary = salary;
        }
        else{
            System.out.println("Salary cannot be less than zero!");
        }
    }
    
    public void showDetails(){
        System.out.println("Employee ID: "+empID);
        System.out.println("Name: "+empName);
        System.out.println("Department: "+department);
        //System.out.println("Salary: "+totalSalary);
    }
        
    public double calculateBonus(){
        double bonus = 0;
        
        bonus = salary * 0.1;
        //totalSalary = salary + bonus;
        //System.out.println("Bonus: "+bonus);
        return bonus;
        
    }
    

    
}

public class EmployeeManagement {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "Prabhash", "IT", 50000);
        Employee emp2 = new Employee(2, "oshadi", "Finance", 20000);

        emp1.showDetails();
        emp1.calculateBonus();
        
        emp1.setEmpName("Praba");
        emp1.setDepartment("ENG");
        emp1.setSalary(60000);

        System.out.println("Updated details: ");
        emp1.showDetails();
        
        emp2.calculateBonus();
        emp2.showDetails();
        System.out.println("Bonus: "+emp2.calculateBonus());
        
    }
    
}
