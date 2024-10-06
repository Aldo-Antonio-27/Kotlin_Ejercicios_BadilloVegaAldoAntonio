/* Mayúsculas a minúsculas: Convierte una cadena dada a minúsculas. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese la cadena de texto que desea convertir a minúsculas: ");
    var cadena= readln().toString();

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación con la función "toLowerCase" para que la cadena se imprima en minúsculas.
    println("");
    println("La cadena de texto ingresada convertida a minúsculas es: " + cadena.toLowerCase());
}