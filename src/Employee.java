import java.util.Scanner;

public class Employee {


    private int id;
    private String name;
    private String department;


//    public Employee(int id, String name, String department) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void collectDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee Department: ");
        department = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();

    }

    public void showDetails(){
        System.out.println("Employee Info:");
        System.out.println("Name: " + name + " | ID: " + id + " | Department: " + department);

    }

    TrainingModule tm = new TrainingModule("Java",20);

    public void displayTrainingModule(){
        System.out.println("Training Module: " +tm.getTitle()+" | Duration: "+tm.getDurationInHrs() + " hours");
    }
    public void calculateBonus(int base){

    }
    public void calculateBonus(int base, int rating){

    }
}
