import java.util.Scanner;

public class Questao02 {
    private static int numero;
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero:");
            int n = ler.nextInt();
            System.out.println("Digite o segundo numero:");
            int n1 = ler.nextInt();
            System.out.println("Digite o terceiro numero:");
            int n2 = ler.nextInt();

            numero = n2;
      if (n > numero)
      numero = n;
      if (n1 > numero)
      numero = n1;
        }
        System.out.printf("O número maior é: %d", numero);
}}
