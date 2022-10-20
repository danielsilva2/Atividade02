import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int n = ler.nextInt();
        if(n>15){
            System.out.println("Pode votar");
        }
        else if(n<16){
            System.out.println("Ainda não pode votar");
        }
    }
    }
