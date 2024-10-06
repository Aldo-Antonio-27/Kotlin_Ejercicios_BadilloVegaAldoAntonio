/* Promedio de tres números: Solicita tres números y calcula su promedio. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer valor: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo valor: ");
    var numero2= readln().toDouble();

    println("Ingrese el tercer valor: ");
    var numero3= readln().toDouble();

    //Operaciones realizadas para obtener el resultado.
    var promedio : Double=((numero1 + numero2 + numero3) / 3);

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("El promedio de los tres números ingresados es: " + promedio);
}