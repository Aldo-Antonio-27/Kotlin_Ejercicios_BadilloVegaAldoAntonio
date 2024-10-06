/* Conversión de String a Int: Lee una cadena y conviértela a un entero, manejando posibles errores. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese una cadena: ");
    var cadena= readln().toString();

    //Manejo del error generado utilizando try y catch, impresión de texto guía para el usuario.
    try {
        var cadenaConvertidaInt= cadena.toInt();

        println("");
        println("La cadena ingresada convertida a entero es: " + cadenaConvertidaInt);

    } catch (e: Exception){
        println("");
        println("Error una variable string no se puede convertir a int. Por excepción si la variable string son números.");
    }
}