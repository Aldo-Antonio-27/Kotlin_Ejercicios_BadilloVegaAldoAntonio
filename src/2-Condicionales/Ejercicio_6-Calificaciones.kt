/* Calificación: Dada una calificación numérica (0-100), convierte y muestra la letra correspondiente (A, B, C, D o F). */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese su calificación: ");
    var calificacion= readln().toDouble();

    //Condicional que determina el resultado a imprimir en consola en base a la variable ingresada, impresión del texto de resultado.
    println("");
    when (calificacion) {
        in 0.0 .. 59.0 ->  println("Tu calificación es equivalente a una F.");
        in 60.0 .. 69.0 ->  println("Tu calificación es equivalente a una D.");
        in 70.0 .. 79.0 ->  println("Tu calificación es equivalente a una C.");
        in 80.0 .. 89.0 ->  println("Tu calificación es equivalente a una B.");
        in 90.0 .. 99.0 ->  println("Tu calificación es equivalente a una A.");
        100.0 ->  println("Tu calificación es equivalente a una A+.");
        else -> println("El valor ingresado no es válido.");
    }
}