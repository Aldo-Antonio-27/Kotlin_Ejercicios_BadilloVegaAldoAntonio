/* Revertir una cadena: Pide una cadena y muestra su reverso. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese la cadena de texto que desea invertir: ");
    var cadena= readln();

    //Se toma la variable y se agrega a una lista, con la función "reversed" para que sus elementos se ordenen en el orden inverso.
    var listaCadena= cadena.toCharArray().toList().reversed();

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la lista con la función "joinToString" para juntar los elementos.
    println("");
    println("El cadena de texto invertida es: " + listaCadena.joinToString(separator = ""));
}