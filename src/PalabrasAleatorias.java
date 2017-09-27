/**
 * Created by smoya on 22/09/2017.
 */
public class PalabrasAleatorias {
    public static void main(String[] args){
        System.out.println("Genera al Azar piedra, papel o tijera");
        int mano = (int)(Math.random()*3);

        switch(mano){
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
                break;
        }
    }
}
