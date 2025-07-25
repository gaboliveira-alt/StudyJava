import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // var scanner = newScanner(System.in);
        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();
        // var name = scanner.next();
        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();
        // var age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);

        scanner.close();
    }
}
