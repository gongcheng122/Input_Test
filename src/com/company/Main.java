package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?");
        String name = in.nextLine();

        System.out.print("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello, "+name+". Next year, you'll be "+(age+1));


        String name1 = JOptionPane.showInputDialog("What is your name?");
        String inputage = JOptionPane.showInputDialog("How old are you?");
        int age1 = Integer.parseInt(inputage);
        System.out.println("Hello, "+name+". Next year, you'll be "+(age+1));
        System.exit(0);
    }
}
