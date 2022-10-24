/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

import java.util.Scanner;

public class section5ex04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora inicial do jogo:");
        int inicio = sc.nextInt();
        System.out.println("Digite a hora final do jogo:");
        int fim = sc.nextInt();

        int duracao;
        if (inicio < fim) {
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();


    }
}
