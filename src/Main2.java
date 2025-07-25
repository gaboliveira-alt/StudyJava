import java.util.Scanner;

public class Main2 {
    

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2? ");
        var result = scanner.nextInt();
        System.out.printf("O resultado é 4, você acertou? [%d]", result);
    }
}
