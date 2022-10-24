import java.util.Scanner;

public class main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são?");
        int hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("bom dia");
        }
        else if (hora < 18){
            System.out.println("boa tarde");
        }
        else {
            System.out.println("boa noite");
        }
    }
}