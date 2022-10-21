/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do b) a área do c) a área do d) a área do e) a área do
Exemplos: Entrada:
Entrada:
triângulo retângulo que tem A por base e C por altura. círculo de raio C. (pi = 3.14159)
trapézio que tem A e B por bases e C por altura. quadrado que tem lado B.
retângulo que tem lados A e B. */

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 valores:" );
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("área do triângulo: %.3f%n", triangulo);
        System.out.printf("área do círculo: %.3f%n", circulo);
        System.out.printf("área do trapézio: %.3f%n", trapezio);
        System.out.printf("área do quadrado: %.3f%n", quadrado);
        System.out.printf("área do retângulo: %.3f%n",retangulo);
    }
}