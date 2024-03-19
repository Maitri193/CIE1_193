class Employee {

    private double salary;

    private String name;

    private int employeeId;



    public Employee(double salary, String name, int employeeId) {

        this.salary = salary;

        this.name = name;

        this.employeeId = employeeId;

    }



    public void displayEmployeeDetails() {

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Name: " + name);

        System.out.println("Salary: $" + salary);

    }

}



