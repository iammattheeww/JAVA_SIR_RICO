public class PersonsInfo {
    private String dataName;
    private String dataAddress;
    private int dataAge;

    public PersonsInfo() {

    }

    int age;
    String name;

    public PersonsInfo(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String setName(String myName){
        return dataName=myName;
    }
    public String setAddress(String myAddress){
        return dataAddress=myAddress;
    }
    public int setAge(int myAge){
        return dataAge=myAge;
    }
    public String getName(){
        return dataName;
    }
    public String getAddress(){
        return dataAddress;
    }
    public int getAge(){
        return dataAge;
    }
}
