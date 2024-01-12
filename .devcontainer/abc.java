package com.company;
import java.io.*;

public class ABC{
    public static void main(String[] args) throws Exception {
       String myString = System.console().readLine("Enter username: ");
        char[] myPassword = System.console().readPassword("Please enter your password: ");

        System.out.println("************VALIDATION PART**************");
        System.out.println("Your input username: "+myString);
        System.out.println("Your input Password name: "+myPassword);
        for(char x: myPassword){
            System.out.println(x);
        }
    }
}
