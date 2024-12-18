package model;

public class Customer {
    private String Name;
    private String Age;
    private String Address;
    private Double Salary;

    public Customer(String name, String age, String address, Double salary) {
        Name = name;
        Age = age;
        Address = address;
        Salary = salary;
    }

    public Customer() {
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Address='" + Address + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
