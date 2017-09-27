import java.util.Scanner;

/**
 * Created by smoya on 12/09/2017.
 */
public class MayorQue {
    public static void main(String[] args){
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a comparar ");
        int numPrimero = n1.nextInt();
        int numSegundo = n2.nextInt();
        if (numPrimero > numSegundo){
            System.out.println("El numero "+numPrimero+" es mayor que "+numSegundo);
        }else
            System.out.println("El numero "+numSegundo+" es mayor que "+numPrimero);
    }
}
