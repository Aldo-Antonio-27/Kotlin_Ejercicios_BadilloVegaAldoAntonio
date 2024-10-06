/* Condicional anidado: Pide un número del 1 al 12 y muestra el mes correspondiente. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese un numero del 1 al 12 correspondiente al mes que desee obtener: ");
    var numero= readln().toInt();

    //Condicional anidado que determina si el valor es válido y el resultado a imprimir en consola, impresión del texto de resultado.
    if(numero >= 1 && numero <= 12){
        println("");
        when (numero) {
            1 -> println("El número ingresado corresponde al mes de Enero.");
            2 -> println("El número ingresado corresponde al mes de Febrero.");
            3 -> println("El número ingresado corresponde al mes de Marzo.");
            4 -> println("El número ingresado corresponde al mes de Abril.");
            5 -> println("El número ingresado corresponde al mes de Mayo.");
            6 -> println("El número ingresado corresponde al mes de Junio.");
            7 -> println("El número ingresado corresponde al mes de Julio.");
            8 -> println("El número ingresado corresponde al mes de Agosto.");
            9 -> println("El número ingresado corresponde al mes de Septiembre.");
            10 -> println("El número ingresado corresponde al mes de Octubre.");
            11 -> println("El número ingresado corresponde al mes de Noviembre.");
            12 -> println("El número ingresado corresponde al mes de Diciembre.");
        }
    } else{
        println("");
        println("El número ingresado no corresponde a ningún mes.")
    }
}