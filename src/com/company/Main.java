package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws RealNameExp {
        Scanner scanner=new Scanner(System.in);
        PasswordExp passwordExp=new PasswordExp();
        UserExp userExp=new UserExp();
        System.out.println("enter you user name");
        String name=scanner.nextLine();
        System.out.println("enter your password");
        int pass=scanner.nextInt();
        passwordExp.password(pass);
        userExp.username(name);
    }
}
