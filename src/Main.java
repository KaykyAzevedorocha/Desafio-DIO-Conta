import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Random numRandom = new Random();

        System.out.println("Bem vindo ao banco, vamos fazer seu cadastro");

        System.out.print("Digite seu nome: ");
        scan.next();
        String name = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scan.nextInt();

        System.out.print("Digite seu CPF sem digito: ");
        long cpf = scan.nextLong();

        int numAccount = numRandom.nextInt(100);

        System.out.println("Dados cadastrados com sucessso!");
        System.out.println("NOME: " + name);
        System.out.println("IDADE: " + age);
        System.out.println("CPF: " + cpf);
        System.out.println("O número da sua conta é: " + numAccount);
    }
}