package lab_ch10_darvis_2;

public class Ex10_14_PayrollSystemMod {
    public static void main(String[] args) {
        // create subclass objects
        Ex10_14_SalariedEmployee salariedEmployee = new Ex10_14_SalariedEmployee("Дима", "Фёдоров", "1", 120.00);
        Ex10_14_HourlyEmployee hourlyEmployee = new Ex10_14_HourlyEmployee("Мира", "Йовович", "2", 14, 48);
        Ex10_14_ComissionEmp commissionEmployee = new Ex10_14_ComissionEmp("Стеша", "Статова", "3", 7580, .06);
        Ex10_14_BasePlCommisionEmployee basePlusCommissionEmployee = new Ex10_14_BasePlCommisionEmployee("Митя", "Куртис",
                "4", 3250, .04, 300);
        Ex10_14_PieceWorker pieceWorker = new Ex10_14_PieceWorker("Витя", "Попкорн", "4", 10, 60);


        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "заработал", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "заработал", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "заработал", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "заработал",
                basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "заработал", pieceWorker.earnings());

        Ex10_14_Employee[] employees = new Ex10_14_Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;


        for (Ex10_14_Employee currentEmployee : employees) {
            System.out.println(currentEmployee);


            if (currentEmployee instanceof Ex10_14_BasePlCommisionEmployee) {
                Ex10_14_BasePlCommisionEmployee employee = (Ex10_14_BasePlCommisionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("зарплата +10%%: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("заработал $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Работник %d из %s%n", j + 1, employees[j].getClass().getSimpleName());
        }
    }
}
