/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class section05ex03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número:");
        int n2 = sc.nextInt();

        if( n1 % n2 == 0  || n2 % n1 == 0){
            System.out.println("são múltiplos");
        }
        else{
            System.out.println("não são múltiplos");
    }
        sc.close();
}
}
