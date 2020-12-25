package lesson4;

//  1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
public class Employee {
    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

    //7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
    private int id;
    private static int idCount = 0;

    //  2 Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        id = ++idCount;
    }

    //  4 Вывести при помощи методов из пункта 3 ФИО и должность.
    public String getInfo() {
        return fio + " - " + position;
    }


    //  3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
