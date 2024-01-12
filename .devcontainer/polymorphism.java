class Animal{
    public void music(){
        System.out.println("Not interested");
    }
    public void voice(){
        System.out.println("Different animals have different voice");
    }
}
class Cat extends Animal{
    public void milk(){
        System.out.println("Interested in milk");
    }
    public void voice(){
        System.out.println("Meow-Meow");
    }
}

public class CWH_polymorphism {
    public static void main(String[] args){
        Animal obj = new Cat();// dynamic method dispatch or run time polymorphism
        obj.voice();
        obj.music();
        //obj.milk(); not allowed
    }
}
