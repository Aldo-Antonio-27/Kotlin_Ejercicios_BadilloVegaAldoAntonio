/* Tabla de multiplicar: Pide un número e imprime su tabla de multiplicar del 1 al 10. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese el numero del que desea obtener su tabla de multiplicar: ");
    var numero= readln().toInt();

    //Guía visual para el usuario.
    println("");
    println("La tabla de multiplicar es: ");

    //Bucle for que se ejecuta 10 veces, en cada ciclo se multiplica el número actual del ciclo con el número ingresado y se imprime en consola.
    for (i in 1..10){
        println("$i * " + (i * numero));
    }
}