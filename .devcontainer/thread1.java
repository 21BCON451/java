class MyThr1 extends Thread {
    public void run() {

          while(true) {
              System.out.println("extending thread by thread method");

          }
        }
}

class MyThr2 extends Thread{
    public void run(){
           while(true) {
               System.out.println("Muskan making thread");
           }
    }
}
public class CWH_thread {
    public static void main(String[] args) {
        MyThr1 t1= new MyThr1();
        t1.setPriority(4);
        MyThr2 t2= new MyThr2();

        t1.start();
        t2.start();
    }
}
