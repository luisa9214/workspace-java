/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){

        System.out.println("Digite a area:");

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi =  3.14159;
        double a = pi * r * r;
        System.out.printf("area= %.4f%n", a);

        sc.close();
    }
}