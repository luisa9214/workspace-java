import java.util.Scanner;

public class lista02 {

    public static void main(String[] args) {

        int cod = 123456;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        int senha = sc.nextInt();
        if (senha == cod) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
