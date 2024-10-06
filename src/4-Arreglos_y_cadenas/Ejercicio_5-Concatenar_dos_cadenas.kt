/* Concatenar dos cadenas: Pide dos cadenas e imprímelas juntas. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese la primera cadena de texto que desea imprimir: ");
    var cadena1= readln();

    println("Ingrese la segunda cadena de texto que desea imprimir: ");
    var cadena2= readln();

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de las variables concatenadas.
    println("");
    println("Las cadenas de texto impresas juntas son: " + cadena1 + cadena2)
}