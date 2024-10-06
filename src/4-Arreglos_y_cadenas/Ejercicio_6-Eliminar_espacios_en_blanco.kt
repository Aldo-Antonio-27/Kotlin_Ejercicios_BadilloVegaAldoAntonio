/* Eliminar espacios en blanco: Dada una cadena, elimina todos los espacios en blanco. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese la cadena de texto que desea imprimir sin espacios: ");
    var cadena= readln();

    //Se toma la variable y se utiliza la función " replace" para que sus espacios en blanco se remplacen por ningún carácter, asi juntando los elementos.
    var cadenaModificada= cadena.replace(" ", "")

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación de la variable ingresada sin espacios.
    println("");
    println("La cadena de texto impresa sin espacios es: " + cadenaModificada)
}