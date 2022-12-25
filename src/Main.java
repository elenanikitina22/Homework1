public class Main {
    public static void main(String[] args) {

        printAllEmployees();
        System.out.println("Сумма зарплат в месяц: " + calculateAllSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + minimumSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maximumSalary());
        System.out.println("Среднее значение зарплат: " + averageSalary());
        printAllEmployeesNames();

    }

    // Создание записей о 10 сотрудниках

    private static final Employee[] employees = {
            new Employee("Зимин Всеволод Александрович", 1, 25000),
            new Employee("Иванова Полина Сергеевна", 2, 30000),
            new Employee("Калинина Майя Константиновна", 3, 35000),
            new Employee("Кузнецова Алёна Артёмовна", 4, 40000),
            new Employee("Молчанова София Егоровна", 5, 45000),
            new Employee("Нестеров Фёдор Петрович", 1, 50000),
            new Employee("Софронов Артём Максимович", 2, 55000),
            new Employee("Спиридонов Григорий Богданович", 3, 60000),
            new Employee("Федотов Алексей Никитич", 4, 70000),
            new Employee("Щербакова Анна Артёмовна", 5, 75000)
    };

    // Список всех сотрудников

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //  Сумма зарплат в месяц

    public static int calculateAllSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    // Сотрудник с минимальной зарплатой

    public static Employee minimumSalary() {
        Employee result = employees[0];
        int minimum = employees[0].getSalary();

        for (Employee employee : employees) {
            if (employee.getSalary() < minimum) {
                minimum = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Сотрудник с максимальной зарплатой

    public static Employee maximumSalary() {
        Employee result = employees[0];
        int maximum = employees[0].getSalary();

        for (Employee employee : employees) {
            if (employee.getSalary() > maximum) {
                maximum = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Среднее значение зарплат

    public static int averageSalary() {
        int average = 0;
        for (Employee employee : employees) {
            average = calculateAllSalaries() / employees.length;
        }
        return average;
    }

    // Ф. И. О. всех сотрудников

    public static void printAllEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

