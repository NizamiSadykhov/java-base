package lesson4;

public class Main {
    public static void main(String[] args) {
        //5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] employees = {
                new Employee("Александр Радионович Бородач", "Охранник", "123456789", 30000, 38),
                new Employee("Владимир Владимирович Путин", "Президент", "123456789", 400000, 68),
                new Employee("Дональд Трампов Баракообамович", "Добрый Дядя", "123456789", 500000, 74),
                new Employee("Перевалкина Екатерина Олеговна", "Красивая девочка", "123456789", 100000, 19),
                new Employee("Никита Джигурда Борисович", "Актер", "123456789", 39999, 59),
        };

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getAge() > 40) System.out.println(employee.getInfo());
        }
    }

    //6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    private static void upSalary(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getAge() > 35) {
                employee.setSalary(employee.getAge() + 10000);
            }
        }
    }
}
