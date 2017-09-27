import java.util.Scanner;

/**
 * Created by smoya on 13/09/2017.
 */
public class VerificaValor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Automata cal = new Automata();
        System.out.println("Por favor ingrese el primer numero ");
        cal.numeroUno = sc.nextInt();
        System.out.println("Por favor ingrese el segundo numero");
        cal.numeroDos = sc.nextInt();
        System.out.println(cal.calculo(cal.numeroUno, cal.numeroDos));

    }
}
