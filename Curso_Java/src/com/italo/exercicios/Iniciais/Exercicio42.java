package Curso_Java.src.com.italo.exercicios.Iniciais;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número ");
        int num2 = scan.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++){
            soma += i;

        }
        System.out.println("A soma é: " + soma);
    }
}