/* Área de un círculo: Escribe un programa que calcule el área de un círculo, dado su radio. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el radio del circulo: ");
    var radio= readln().toDouble();
    val pi : Double = 3.14159265;
    var area : Double;

    //Operaciones realizadas para obtener el resultado.
    area = (pi * (radio * radio))

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("El área del círculo es igual a: " + area);
}