import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int n = ler.nextInt();
        if(n>17){
            System.out.println("Pode dirigir");
        }
        else if(n<18){
            System.out.println("Ainda não pode dirigir");
        }
    }
}
