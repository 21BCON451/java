import java.io.*;
public class output {
    public static void main(String[] args) {
        byte[] b = {'h','e','l','l','0'};
        try{
            FileInputStream fin = new FileInputStream("ab.txt");
            FileOutputStream fout = new FileOutputStream("ab.txt");
            fout.write(b);
            for(int i= 0 ; i<b.length; i++){
                System.out.println(" "+(char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}