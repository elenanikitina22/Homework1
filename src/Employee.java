public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;

    private static int increment = 1;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = increment++;
    }

    // Сеттеры

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Геттеры

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Сотрудник " +
                "Ф.И.О. " + name +
                ", Отдел " + department +
                ", Зарплата " + salary +
                ", id " + id;
    }
}
