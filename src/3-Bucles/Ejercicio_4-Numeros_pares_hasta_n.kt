/* Números pares hasta n: Pide un número n y muestra todos los números pares entre 1 y n. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el numero hasta el que desea obtener los números pares: ");
    var numero= readln().toInt();

    //Guía visual para el usuario.
    println("");
    println("Los numeros pares son: ")

    //Bucle for que se ejecuta tantas veces como el número ingresado.
    for (i in 1..numero){
        //En cada ciclo se verificar si el número actual del ciclo es par y si lo es se imprime en consola.
        if ((i % 2) == 0){
            println(i);
        }
    }
}