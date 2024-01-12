import java.util.Scanner;

public class CWH_test4 {
    public static void main(String[] args){
        byte n1 , n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks");
        n1 = sc.nextByte();
        System.out.println("Enter your maths marks");
        n2 = sc.nextByte();
        System.out.println("Enter your chemistry marks");
        n3 = sc.nextByte();

        float avg = (n1+n2+n3)/3.0f;
        System.out.println("Your percentage is: " + avg);
        if(avg>=40 && n1>33 && n2>33 && n3>33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, Please try again.");
        }
    }
}
