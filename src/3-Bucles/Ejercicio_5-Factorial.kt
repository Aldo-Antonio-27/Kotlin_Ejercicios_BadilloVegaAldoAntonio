/* Factorial: Calcula el factorial de un número dado. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el número del cual desea obtener el factorial: ");
    var numero= readln().toInt();
    var factorial : Int = 1;

    //Bucle while que se ejecuta tantas veces como el número ingresado, en cada ciclo se va multiplicando el número actual del ciclo y va disminuyendo.
    while (numero > 0){
        factorial= factorial * numero;

        numero--
    }

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado final de las multiplicaciones.
    println("");
    println("El factorial del número ingresado es: " + factorial)
}