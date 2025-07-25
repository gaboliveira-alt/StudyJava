import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem? ");
        var age = scanner.nextInt();
        var canDrive = age > 17;
        System.out.printf("A idade é 18, você tem 18? [%s]", canDrive);
    }
    
}