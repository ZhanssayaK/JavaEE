package first_ex.db;

public class Personal {
    private String name;
    private String surname;
    private String department;
    private double salary;
    private int id;

    public Personal(){}
    public Personal(String name, String surname, String department, double salary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
    public Personal(String name, String surname, String department, double salary, int id){
        this(name, surname, department, salary);
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
