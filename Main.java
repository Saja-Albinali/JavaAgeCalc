import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("enter birth year");
        int birthYear = scanner.nextInt();

        System.out.println("enter your birth month");
        int birthMonth = scanner.nextInt();

        System.out.println("enter you birth day");
        int birthDay = scanner.nextInt();

        Calendar currentDate = Calendar.getInstance();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear,birthMonth-1,birthDay);

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if (currentDate.get(Calendar.DAY_OF_YEAR)< birthDate.get(Calendar.DAY_OF_YEAR)){
            age = age   -1;
        }
        System.out.println("your age: " +age);

    }

}