/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

import java.util.Scanner;

public class section05ex02 {

    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

    }}