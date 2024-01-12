abstract class Parent2{
    public Parent2(){
        System.out.println("Mein base 2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}
class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
class Child3 extends Child2{
    public void th(){
        System.out.println("Good Bye");
    }
}
public class CWH_abstract {
    public static void main(String[] args){
        // abstract class are used when we want to achieve security and abstraction( hiding details).
        //a method that is declared without implementation is abstract method.
        Child2 c = new Child2();
        c.greet();
        c.greet2();
        c.sayHello();
        //c.th();//not allowed

    }
}