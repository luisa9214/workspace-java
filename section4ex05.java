/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Scanner;

public class section4ex05 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça 1:");
        int peca1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças:");
        int qnt1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça:");
        int vu1 = sc.nextInt();
        System.out.println("Digite o código da peça 2:");
        int peca2 = sc.nextInt();
        System.out.println("Digite a quantidade de peças:");
        int qnt2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça:");
        int vu2 = sc.nextInt();
        double vpg = qnt1 * vu1 + qnt2 * vu2;
        System.out.printf("Valor a pagar = %.2f%n" , vpg );
    }
}