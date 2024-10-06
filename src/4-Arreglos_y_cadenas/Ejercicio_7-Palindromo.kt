/* Palíndromo: Escribe un programa que determine si una palabra es un palíndromo. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola, se convierte en minúsculas y se le quinta los espacios.
    println("Ingrese la palabra que quiere determinar si es un palindromo: ");
    var palabra= readln().toLowerCase().replace(" ", "");

    //Se toma la variable y se agrega a una lista, con la función "reversed" para que sus elementos se ordenen en el orden inverso.
    var palabraInvertida= palabra.toCharArray().toList().reversed()

    /*Condicional que toma la lista de la palabra y junta sus elementos, la convierte en minúsculas y le quita los espacios, compara la palabra
    invertida con la palabra ingresada y si son iguales imprime que la palabra es un palíndromo en caso contrario imprime que no lo es.*/
    if (palabraInvertida.joinToString("").toLowerCase().replace(" ", "") == palabra){
        println("");
        println("La palabra ingresada es un palindromo.");

    } else{
        println("");
        println("La palabra ingresada no es un palindromo.");
    }

    //Impresión de las variables en consola, texto guía para el usuario y ambas variables.
    println("");
    println("La palabra normal es: " + palabra);
    println("La palabra invertida es: " + palabraInvertida.joinToString("").toLowerCase().replace(" ", ""));
}