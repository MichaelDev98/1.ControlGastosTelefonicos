import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val cabinas = List(5) { CabinaTelefonica(it + 1) }

    while (true) {
        println("Seleccione una cabina (1-5) o ingrese 0 para salir:")
        val seleccion = try {
            scanner.nextInt()
        } catch (e: Exception) {
            println("Error al leer la entrada. Intente nuevamente.")
            continue
        }

        if (seleccion == 0) {
            break
        } else if (seleccion in 1..5) {
            println("Tipo de llamada (local, larga distancia, celular):")
            val tipoLlamada = scanner.next().toLowerCase()

            println("Duración de la llamada (minutos):")
            val duracionMinutos = try {
                scanner.nextInt()
            } catch (e: Exception) {
                println("Error al leer la duración. Se considerará duración cero.")
                0
            }

            cabinas[seleccion - 1].registrarLlamada(tipoLlamada, duracionMinutos)
            cabinas[seleccion - 1].mostrarInformacionCabina()
        } else {
            println("Selección inválida. Intente nuevamente.")
        }
    }
}