import java.util.Scanner;

public class Questao01 {
    /**
         * @param args
         */
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 numero:");
        int n = ler.nextInt();
        if(n<0){
            System.out.println(n+" é menor que zero");
        }
        else if(n > 0){
            System.out.println(n+" é maior que zero");
        }
        else{
            System.out.println(n+" é igual a zero");
            }
        }
}