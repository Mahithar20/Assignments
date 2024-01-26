package TwentythirdJan;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mahitha","Java Developer", 120.5);
        System.out.println("Employee name is "+ employee1.getName());
        System.out.println("Employee Job title is "+ employee1.getJob_title());
        System.out.println("Employee Salary is "+ employee1.getSalary());
        System.out.println("employee salary after 5% increase is "+employee1.calculateSalary(5));
        int[] marks = {90,91,92,93,94,95};
        for(int i = 0; i<marks.length; i++){
            for(int j=i ; j <= i+3 ; j++){
                if(j<marks.length){
                    System.out.print(marks[j]+",");
                }
                else {
                    int m = j-(marks.length);
                    System.out.print(marks[m]+",");
                }
            }
            System.out.println();
        }
    }
}
