// Main Method
public class Main{
    public static void main (String[] xyz){
        EmployeesInfo run = new EmployeesInfo();
        run.runEmployees();

        PersonsInfo x = new PersonsInfo(5, "john");
        System.out.println(x.name+" "+x.age);
    }
}
