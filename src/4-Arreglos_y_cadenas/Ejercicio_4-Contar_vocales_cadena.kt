/* Contar vocales en una cadena: Dada una cadena, cuenta cuántas vocales contiene. */

fun main(){
    //Creación y asignación de la variable, la variable se le solicita al usuario en consola.
    println("Ingrese la cadena de texto de la que desea saber su número de vocales: ");
    var cadena= readln();

    //Se toman la variable y se agrega a un array separándola en elementos individuales, se declara un array con las vocales y una variable como contador.
    var listaCadena= cadena.toCharArray();
    var vocales= arrayOf("a", "e", "i", "o", "u", "á", "é", "í", "ó", "ú");
    var numeroVocales : Int = 0;

    //Bucle for anidado que se ejecuta tantas veces como elementos en la lista principal de elementos, en el bucle compara cada letra de la palabra ingresada.
    for (i in listaCadena){
        var vocalActual= i.toLowerCase().toString();

        /*Bucle for que se ejecuta tantas veces como elementos en la lista de vocales, se compara la primera letra de la palabra ingresada con cada elemento
        de la lista de vocales, se utiliza la función “toLowerCase” para hacer minúsculas todas las letras de la palabra principal, si la letra es vocal se
        suma uno a un contador de vocales.*/
        for (n in vocales){
            if (vocalActual == n){
                numeroVocales+= 1
            }
        }
    }

    //Impresión del resultado en consola, texto guía para el usuario y la concatenación del resultado final del contador de vocales.
    println("");
    println("El número de vocales de la cadena es: " + numeroVocales);
}