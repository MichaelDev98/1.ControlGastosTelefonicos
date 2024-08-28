import java.util.Scanner

class CabinaTelefonica(val numeroCabina: Int) {
    private var llamadasRealizadas = 0
    private var duracionTotalMinutos = 0
    private var costoTotalPesos = 0.0

    fun registrarLlamada(tipoLlamada: String, duracionMinutos: Int) {
        llamadasRealizadas++
        duracionTotalMinutos += duracionMinutos
        costoTotalPesos += calcularCostoLlamada(tipoLlamada, duracionMinutos)
    }

    fun mostrarInformacionCabina() {
        println("Cabina $numeroCabina:")
        println("Llamadas realizadas: $llamadasRealizadas")
        println("Duración total (minutos): $duracionTotalMinutos")
        println("Costo total (pesos): $costoTotalPesos")
    }

    private fun calcularCostoLlamada(tipoLlamada: String, duracionMinutos: Int): Double {
        return when (tipoLlamada) {
            "local" -> duracionMinutos * 50.0
            "larga distancia" -> duracionMinutos * 350.0
            "celular" -> duracionMinutos * 150.0
            else -> {
                println("Tipo de llamada inválido. Se considerará costo cero.")
                0.0
            }
        }
    }

    fun reiniciarCabina() {
        llamadasRealizadas = 0
        duracionTotalMinutos = 0
        costoTotalPesos = 0.0
    }
}
