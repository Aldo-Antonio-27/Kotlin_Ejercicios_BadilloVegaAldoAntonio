/* Conversión de metros a kilómetros: Convierte una distancia dada en metros a kilómetros. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el número de metros que desea convertir: ");
    var metros= readln().toDouble();

    //Operaciones realizadas para obtener el resultado.
    var converison : Double;
    converison = (metros / 1000)

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("Los metros convertidos a kilómetros son igual a: " + converison);
}