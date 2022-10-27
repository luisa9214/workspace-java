import java.util.Locale;
import java.util.Scanner;

public class lista01 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String aluno = sc.next();
        double a, b, c, d;
        System.out.println("Digite a nota da matéria A:");
        a = sc.nextDouble();
        System.out.println("Digite a nota da matéria B:");
        b = sc.nextDouble();
        System.out.println("Digite a nota da matéria C:");
        c = sc.nextDouble();
        System.out.println("Digite a nota da matéria D:");
        d = sc.nextDouble();
        double media = (a + b + c + d) /4;
        System.out.printf("Aluno: %s Média: %.2f", aluno, media);
        sc.close();
    }
}
