/**
 * Created by smoya on 22/09/2017.
 */
public class NumAleatoreos01 {
    public static void main(String[] args){
        System.out.println("Se generan 30 numeros aleatoreos \n");
        for(int i = 1; i <= 30; i++){
            /* Se utiliza un parse para convertit los numeros decimales a numeros enteros*/
            System.out.println((int) (Math.random()*10) + " ");
        }
    }
}
