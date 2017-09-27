import java.util.Scanner;

/**
 * Created by smoya on 07/09/2017.
 */
public class NumerosPrimos {
    /*Programa para determinar si un numero igresado es primo*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean esPrimo = false;
        for (int i = 2; i<=numero;i++){
            if (numero%i == 0){
                esPrimo = true;
            }
        }
        if (esPrimo){
            System.out.println("el numero "+numero+" es primo");
        }else
            System.out.println("el numero "+numero+" no es primo" );
    }

}
