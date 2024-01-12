class Employee{
    Employee(String s, int i){
        System.out.println("Name of 1st person is : " +s);
        System.out.println("id of 1st person is : "+i);
    }
    Employee(String s, int i, int salary){
        System.out.println("Name of 2nd person is : " +s);
        System.out.println("id of 2nd person is : "+i);
        System.out.println("Salary of 2nd person is : "+salary);
    }
}

public class CWH_constructor {
    public static void main(String[] args){
        Employee E= new Employee("Shubham",1);
        Employee M= new Employee("Muskan",4,200000000);
    }
}