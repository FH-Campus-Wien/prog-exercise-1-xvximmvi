package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char l0 = 'Z';
        int l1 = 0xface;
        int l2 = 012;
        long l3 = 80L;
        float l4 = 44e-1f;
        float l5 = 5.5f;
        double l6 = 8.88e1;
        double l7 = 99.9;

        double[] l = {l0, l1, l2, l3, l4, l5, l6, l7};

        int sum = 0;
        for(int i = 0;i<=7;i++) {
            sum += (int)l[i];
        }
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        System.out.println(scan.nextInt() + scan.nextInt());
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x, y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scan.nextInt();
        System.out.print("y: ");
        y = scan.nextInt();

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1, n2;
        System.out.print("n1: ");
        n1 = scan.nextInt();
        System.out.print("n2: ");
        n2 = scan.nextInt();
        if(n1 > n2) {
            System.out.println("n1 > n2");
        }
        if(n1 < n2) {
            System.out.println("n2 > n1");
        }
        if(n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        int rev = scan.nextInt();
        if(rev < 0 || rev >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if(rev >= 0 && rev < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if(rev >= 20000 && rev < 50000) {
            System.out.println("Average Sales Revenue");
        }
        if(rev >= 50000 && rev < 80000) {
            System.out.println("Good Sales Revenue");
        }
        if(rev >= 80000 && rev < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int c = scan.nextInt();
        switch(c) {
            case 1:     System.out.println("Your Commission Rate was set to " + 0.01*c); break;
            case 2:     System.out.println("Your Commission Rate was set to " + 0.01*c); break;
            case 3:     System.out.println("Your Commission Rate was set to " + 0.01*c); break;
            case 4:     System.out.println("Your Commission Rate was set to " + 0.01*c); break;
            default:    System.out.println("Your Commission Rate was set to 0.0"); break;
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int y = scan.nextInt();
        if(y%4 == 0) {
            if(y%100 == 0) {
                if(y%400 == 0) {
                    System.out.println("Leapyear");
                }
                else {
                    System.out.println("Not a Leapyear");
                }
            }
            else {
                System.out.println("Not a Leapyear");
            }
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int x = scan.nextInt();
        int c = x % 10;
        int b = x / 10 % 10;
        int a = x / 100;
        System.out.println(c + "" + "" + b + "" + a);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}