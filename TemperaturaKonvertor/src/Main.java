import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        float rezultat, broj;
        int izbor;

        System.out.println("**********Temperature Converter **********");
        System.out.println("Select one of options 1.From Celsius to Fahrenheit 2.From Fahrenheit to Celsius: ");
        izbor = myObj.nextInt();
        if(izbor == 1) {
            System.out.println("You selected From Celsius to Fahrenheit");
        }else{
            System.out.println("You selected From Fahrenheit to Celsius");
        }

        System.out.println("Please enter number you want to be converted: ");
        broj = myObj.nextFloat();
        System.out.println("You selected: " + broj);
        switch (izbor){
            case 1:
                rezultat = broj * 9/5 + 32;
                System.out.printf("%.2fC is equal to %.2fF%n", broj, rezultat);
            break;
            case 2:
                rezultat = (broj - 32) * 5/9;
                System.out.printf("%.2fF is equal to %.2fC%n", broj, rezultat);
            break;
            default:
                System.out.println("Something went wrong");
            break;
        }
    }
}