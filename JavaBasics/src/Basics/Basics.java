package Basics;

public class Basics {
    public static void main(String[] args) {
        String firstName = "Gurjinder";

        int num = 686;

        System.out.println(firstName + "\t" + num );

        double num2 =  num * 2;

       System.out.println(Math.max(num, num2));

       // ternary operator 
       int age = 26;
       String result = (age>18) ? "can vote" : "Can't vote";
       System.out.println(result);

    }
}
