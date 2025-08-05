//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean validateID(int id){
        System.out.println();
        return String.valueOf(id).length()==5;

    }
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.collectDetails();
        emp.showDetails();
        System.out.println("Valid ID: "+validateID(emp.getId()));
        emp.displayTrainingModule();

        StringAnalyzer sa = new StringAnalyzer();
        sa.reverseString();


        ArrayTasks at= new ArrayTasks();
        at.array();
        at.twoDArray();

        System.out.println("Command Line Arguments:");
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
    }

        }

