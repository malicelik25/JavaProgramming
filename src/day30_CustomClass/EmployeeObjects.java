package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ali", 'M', 29, 500, "Senior QA", 110000, false);

        Employee employee2 = new Employee();
        employee2.setInfo("Olya", 'F', 35, 200, "BA", 80000, true);

        Employee employee3 = new Employee();
        employee3.setInfo("Mehmet", 'M', 25, 510, "PO", 120000, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Hulya", 'F', 30, 600, "QA", 40000, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Oleksandr", 'M', 36, 300, "Developer", 100000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }

            if (employee.salary > max) {
                max = employee.salary;
            }

            if (employee.salary < min) {
                min = employee.salary;
            }

        }


        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }


}
