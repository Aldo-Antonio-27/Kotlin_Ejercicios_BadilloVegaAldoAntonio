/* Conversión de grados Celsius a Fahrenheit: Crea un programa que convierta una temperatura dada en grados Celsius a Fahrenheit. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese los grados Celsius: ");
    var gradosCelsius= readln().toDouble();
    var converison : Double;

    //Operaciones realizadas para obtener el resultado.
    converison = ((gradosCelsius * 1.8) + 32)

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("La temperatura en grados Fahrenheit es igual a: " + converison + " F°");
}