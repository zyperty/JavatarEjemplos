import java.util.Scanner;

/**
 * Created by smoya on 23/09/2017.
 */
public class MayorDeTres {
    public static void main(String[] args){
        int numeroUno = 0;
        int numeroDos = 0;
        int numeroTres = 0;
        int mayor = 0;
        Scanner datos = new Scanner(System.in);

        System.out.println("Por favor ingrese el primero Numero \n");
        numeroUno = datos.nextInt();
        System.out.println("Por favor ingrese el primero Segundo \n");
        numeroDos = datos.nextInt();
        System.out.println("Por favor ingrese el primero Segundo \n");
        numeroTres = datos.nextInt();

        System.out.println("El primer numero es "+numeroUno);
        System.out.println("El segundo numero es "+numeroDos);
        System.out.println("El tercer numero es "+numeroTres);

        if(numeroUno > numeroDos){
            if(numeroUno > numeroTres){
                mayor = numeroUno;
            }
        }else if (numeroDos > numeroTres){
            mayor = numeroDos;
        }
            mayor = numeroTres;
        System.out.println("El mayor de los tres numeros ingresados es "+mayor);
    }
}
