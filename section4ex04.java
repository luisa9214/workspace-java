/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

import java.util.Scanner;

public class section4ex04 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nro do funcionário:");
        int nro = sc.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int qtnd = sc.nextInt();
        System.out.println("Informe o valor da hora trabalhada:");
        int hora = sc.nextInt();
        double salario = qtnd * hora;
        System.out.println("number = " + nro);
        System.out.printf("salary = %.2f%n" , salario );

    }
}