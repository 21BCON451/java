import java.io.*;
class StudentInfo implements Serializable{
    String name;
    int id;
    String contact;
    StudentInfo(String n, int i, String c){
        this.name=n;
        this.id=i;
        this.contact=c;
    }


}
public class PQR {
    public static void main(String[] args) {
    try{
        StudentInfo si = new StudentInfo("Amit",105,"9785195759");
        FileOutputStream fout=new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(si);
        oos.close();
        fout.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
