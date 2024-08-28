# Cabina-telefonica-APP
Descripción
La aplicación “Cabina Telefónica” permite registrar y gestionar llamadas telefónicas en diferentes cabinas. Los usuarios pueden ingresar el tipo de llamada (local, larga distancia o celular) y la duración en minutos para calcular el costo total y mostrar información detallada de cada cabina.

Funcionalidades:
1. Registro de Llamadas:
    El usuario selecciona una cabina (del 1 al 5).
    Ingresa el tipo de llamada (local, larga distancia o celular).
    Proporciona la duración de la llamada en minutos.
    La aplicación registra la llamada y actualiza los valores correspondientes.
2.	Mostrar Información de la Cabina: La aplicación muestra el número de llamadas realizadas, la duración y el costo totales de la cabina seleccionada.
3.	Reinicio de Valores: El usuario puede reiniciar los valores de una cabina (llamadas, duración y costo) a cero.

Instrucciones de Uso:
1.	Ejecuta la aplicación desde el archivo principal (main.kt).
2.	Selecciona una cabina (1 al 5) o ingresa 0 para salir.
3.	Ingresa el tipo de llamada (local, larga distancia o celular).
4.	Proporciona la duración de la llamada en minutos.
5.	La aplicación mostrará la información actualizada de la cabina.
6.	Repite los pasos 2 al 5 para registrar más llamadas o finaliza ingresando 0.

Manejo de Errores:
    Si se ingresa una selección inválida, se mostrará un mensaje de error.
    Si se ingresa un tipo de llamada no reconocido, se considerará costo cero.

Notas:
    Se debe tener instalado Kotlin como entorno de desarrollo para compilarlo
    Se pueden personalizar la cantidad de cabinas o los valores de tarifas según las necesidades.