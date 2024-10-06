/* Ordenar tres números: Solicita tres números y muestra el mayor, el intermedio y el menor. */

fun main(){
    //Creación y asignación de variables, las variables se le solicitan al usuario en consola.
    println("Ingrese el primer numero: ");
    var numero1= readln().toDouble();

    println("Ingrese el segundo numero: ");
    var numero2= readln().toDouble();

    println("Ingrese el tercer numero: ");
    var numero3= readln().toDouble();

    //Resolución del problema, se crea una lista con los elementos en un array y se utiliza un metodo para que se ordenen de mayor a menor.
    var listaNumeros = arrayOf(numero1, numero2, numero3).sortedDescending();

    //Impresión de las variables en consola, texto guía para el usuario y la concatenación de las variables en el orden especificado.
    println("");
    println("El numero mayor es el número: " + listaNumeros[0]);
    println("El numero intermedio es el número: " + listaNumeros[1]);
    println("El numero menor es el número: " + listaNumeros[2]);
}