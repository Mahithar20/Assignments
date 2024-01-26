package TwentythirdJan;

public class Employee {
    private String name;
    private String job_title;
    private double  salary;

    Employee (String name, String job_title, double salary){
        setName(name);
        setJob_title(job_title);
        setSalary(salary);
    }

    double calculateSalary(int percentage){
        salary = (this.salary + ((percentage/this.salary)*100));
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
