/* Suma de dos números: Escribe un programa que solicite dos números al usuario y muestre su suma. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer valor: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo valor: ");
    var numero2= readln().toDouble();

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("La suma de los dos valores es igual a: " + (numero1 + numero2));
}