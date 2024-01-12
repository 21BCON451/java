import java.io.*;

public class DeserializationTest {
    public static void main(String[] args) {
        StudentInfo si = null;
        try{
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
        si = (StudentInfo)in.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(si.name);
        System.out.println(si.id);
        System.out.println(si.contact);
    }
}