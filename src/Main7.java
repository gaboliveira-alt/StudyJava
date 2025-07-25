import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado? ");
        var isEmancipad = scanner.nextBoolean();
        var canNotDrive = age >= 18 || isEmancipad && age >= 16;
        System.out.printf("Voce pode dirigir? [%s]", canNotDrive);
    }
}
