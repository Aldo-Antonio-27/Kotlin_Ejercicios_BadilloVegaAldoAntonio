/* Día de la semana: Pide un número del 1 al 7 y muestra el día de la semana correspondiente. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese un numero del 1 al 7 correspondiente al día de la semana que desee obtener: ");
    var numero= readln().toInt();

    //Condicional que determina el resultado a imprimir en consola, impresión del texto de resultado.
    println("");
    when (numero) {
        1 ->  println("El numero ingresado corresponde al día Lunes.");
        2 ->  println("El numero ingresado corresponde al día Martes.");
        3 ->  println("El numero ingresado corresponde al día Miércoles.");
        4 ->  println("El numero ingresado corresponde al día Jueves.");
        5 ->  println("El numero ingresado corresponde al día Viernes.");
        6 ->  println("El numero ingresado corresponde al día Sábado.");
        7 ->  println("El numero ingresado corresponde al día Domingo.");
        else -> println("El numero ingresado no corresponde a ningún día de la semana.");
    }
}