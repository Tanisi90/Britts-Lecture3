import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //print statement? - am I only looking for the value of two things???? If yes helpful
        //method? - yes
        //variables with Scanner

        int x = 5;
        double y = 6.0;
         //can my int store 11.0?

        int z = x + (int) y; // 11


        x++; //6 - x + 1 = 6; 

        System.out.println(x++); //6

        System.out.println(x); //7

        System.out.println(++x); //8 -  1 + x = 8

        z = z + x; //remember x is 8 not 5 we reassigned the value
        System.out.println(z); //19
        z += x;

        System.out.println(z);//27 19 + 8 = 27

        x = 10;

        //10 > 10?????? No
        // 10 >= 10????? True 
        // == stands for equal 
        //! stands for not x != 10 x is not equal to 10
        // || this symbol means or one or the other must prove true both don't need to prove true

        // P || Q =  O
        // T || T  = T
        // T || F = T
        // F || T = T
        // F || F = F
        if(x >= 10 || x < 25){
            System.out.println("I testing conditionals");
        }


        //&&  AND  both must be true

        // P && Q = O
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        String input = sc.nextLine();
        float value = Float.parseFloat(input);
        System.out.println(value);
        System.out.println("Enter another value");
        String input2 = sc.nextLine();
        float value2= Float.parseFloat(input2);
        System.out.println(value + value2);

        System.out.println("You entered the number " + value + " that is awesome");

        System.out.println("Hello there" + "What is your name");

        sc.close();

    }

    public static void add(double a, double b){
        //This is known downcasting - I am ok with the data-loss that may occur
        int sum = (int) (a+b);
        // return sum;
        // return a + b;

        System.out.println(sum);
    }
}