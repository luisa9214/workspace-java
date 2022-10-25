import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class lista03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if( numero >= 0){
            System.out.println("POSITIVO");
        }
        else {
            System.out.println("NEGATIVO");
    }
  }
}

