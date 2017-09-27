/**
 * Created by smoya on 16/09/2017.
 */

fun main(args: Array<String>) {
    /*
      Declaracion de variables en Kotlin (Para JVM)
    */
    val numeroUno: Int = 1 // Se declara y se inicializa la variable numero
    val numeroDos = 2 // Se inicializa la variable y se infiere el tipo
    val numeroTres: Int // Se declara el tipo de variable pero no se inicializa
        numeroTres = 20 // Se inicializa la variable

    for (name in args)
        println("Hello, $name!")
}