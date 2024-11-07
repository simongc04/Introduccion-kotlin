fun main() {
    val nombre: String = "Simon"

    saludar(nombre)

    val edad = 25
    println("Edad: $edad años")

    if (edad >= 18) {
        println("$nombre es mayor de edad.")
    } else {
        println("$nombre es menor de edad.")
    }
}

fun saludar(nombre: String) {
    println("¡Hola, $nombre!")
}
