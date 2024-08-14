package guna.com;

import java.util.Scanner;

class Std {
    int regNo;
    String stName;
    int[] marks = new int[5];

    Std(int a, String b) {
        regNo = a;
        stName = b;
    }

    void getMarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for " + stName + ": ");
        for (int i = 0; i < 5; i++) {
            this.marks[i] = s.nextInt();
        }
    }

    void displayGrade() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += this.marks[i];
        }
        int avg = sum / 5;
        System.out.println("Regno: " + this.regNo);
        System.out.println("Name: " + this.stName);
        System.out.println("Total: " + sum);
        System.out.print("Grade: ");
        if (avg > 70) {
            System.out.println("A");
        } else if (avg >= 50) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}

public class Student {

    public static void main(String[] args) {
        Std m = new Std(5, "guna");
        m.getMarks();
        m.displayGrade();
    }
}
