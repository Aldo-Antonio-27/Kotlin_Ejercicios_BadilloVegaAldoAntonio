/* Multiplicación sin multiplicar: Multiplica dos números sin usar el operador de multiplicación. */

fun main(){
    //Creación y asignación de variables, algunas de las variables se le solicitan al usuario en consola.
    println("Ingrese el primer numero: ");
    var numero1= readln().toInt();

    println("Ingrese el segundo numero: ");
    var numero2= readln().toInt();

    var totalMultiplicacion : Int = 0;
    var contador : Int;
    contador= numero2;

    //Bucle que realiza las operaciones necesarias para obtener el resultado, se suma el primer número tantas veces como marque el segundo número.
    while (contador > 0){
        totalMultiplicacion+= numero1;
        contador-= 1;
    }

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado.
    println("");
    println("El total de la multiplicación es: " + totalMultiplicacion);
}