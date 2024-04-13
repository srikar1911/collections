package practice;

public class Employee2 {

    int id;
    String gender;
    Double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee2(int id, String gender, Double salary) {
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }
}
