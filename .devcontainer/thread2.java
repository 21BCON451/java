class X implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
class Y implements Runnable{
    public void run(){
        System.out.println("end");
    }
}
public class CWH_thread2 {
    public static void main(String[] args) {
      X x1 = new X();
      Thread t1= new Thread(x1);
      t1.start();
      Y y1 = new Y();
      Thread t2= new Thread(y1);
      t2.start();
    }
}