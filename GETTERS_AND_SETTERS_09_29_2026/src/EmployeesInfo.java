public class EmployeesInfo {
    // Class Employees Information, this example use setters and getters in the main class
        public void runEmployees(){
            PersonsInfo myInfo = new PersonsInfo();
            myInfo.setName("John Doe");
            myInfo.setAddress("Planet Earth");
            myInfo.setAge(30);
            System.out.println("Name:" +myInfo.getName());
            System.out.println("Address:" +myInfo.getAddress());
            System.out.println("Age:" +myInfo.getAge());
        }
}
