/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

import java.util.Scanner;

public class section5ex01 {

    public static void main(String[] args) {

        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n < 0){
            System.out.println("negativo");
        }
        else {
            System.out.println("positivo");
        }
    }

}
