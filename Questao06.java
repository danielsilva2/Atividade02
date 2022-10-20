import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o peso:");
            double peso = ler.nextDouble();
            System.out.println("Digite a altura:");
            double altura = ler.nextDouble();
            double imc = peso / (altura * altura);
            System.out.println(imc);

            if (imc <= 19.9) {
                System.out.println("Abaixo do normal");
            } else if (imc >= 20.0 && imc <= 24.9){
                System.out.println("Normal");
            } else 
            if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Obesidade leve");
            } else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Obesidade moderada");
            } if (imc > 40.0) {
                System.out.println("Obesidade mórbida");
            }
        }
    }
}