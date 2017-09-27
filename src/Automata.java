/**
 * Created by smoya on 12/09/2017.
 */
  class Automata {

        /**
         * Metodo para calcular el mayor de dos numeros ingresados
         */
        int numeroUno;
        int numeroDos;

//    contructor de la Clase, este metodo sirve para inicializar un objeto a un estado determinado.
//    Notece que los contructores tiene el mismo nombre que la clase y nunca tienen retorno ni especificado ni void
//    a diferencia de los metodos que pueden o no devolver un resultado.
      public Automata(){
          numeroUno = 0;
          numeroDos = 0;
        }
    public static String calculo (int n1, int n2){

        if(n1>n2) {

            return ("El numero "+n1+"  es Mayor que "+n2);
        }else {

            return ("El numero "+n2+"  es Mayor que "+n1);
        }

    }
}

