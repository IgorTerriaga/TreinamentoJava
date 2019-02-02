package FixacaoListas;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return this.id;
    }

    public void IncreasySalary(double percent) {
        salary += salary * (percent / 100.0);
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }


}
