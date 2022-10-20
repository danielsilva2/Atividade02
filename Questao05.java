import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int n = ler.nextInt();
        if(n>=16 && n<=17){
            System.out.println("Pode votar, mas não pode dirigir");
        }
        else if(n<=15){
            System.out.println("Não pode nem votar e nem dirigir");
        }
        else if(n>=18){
            System.out.println("Pode votar e pode dirigir");
        }
    }
}