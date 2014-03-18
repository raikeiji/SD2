package Modul2;

public class Employee implements Comparable {

    private String lastName;
    private int salary;

    public Employee(String ln, int s) {
        this.lastName = ln;
        this.salary = s;
    }

    public int compareTo(Object o) {

        return this.getLastName().compareTo(((Employee) o).getLastName());
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getLastName();
    }
}
