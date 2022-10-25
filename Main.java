import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "inválido";
                break;
        }

        System.out.println("o dia da semana é: "+ dia);
    }
}