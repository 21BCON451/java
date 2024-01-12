class MyException extends Exception{
    String str1;
    MyException(String str2){
        str1= str2;
    }
    public String toString(){
        return("MyException occurred" +str1);
    }
}
public class Example1 {
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
                    throw new MyException("This is my error msg");
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}
