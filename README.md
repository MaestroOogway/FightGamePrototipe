# FightGamePrototipe

Extreme Fighter es un prototipo de videojuego de combate por consola desarrollado en Java, diseñado como ejemplo práctico de aplicación de patrones de diseño orientados a objetos.

Descripción general

El proyecto implementa una simulación básica de pelea entre luchadores con distintos atributos y habilidades.
El jugador puede seleccionar su personaje, realizar acciones como golpes, patadas, saltos, ataques especiales o combos, y ver los resultados directamente en la consola.

Este proyecto tiene un propósito académico y demostrativo, enfocado en mostrar cómo integrar distintos patrones de diseño dentro de una arquitectura modular en Java.

Patrones de diseño utilizados

El código implementa y combina varios patrones de diseño, entre ellos:

Factory Method / Creator: utilizado para crear los distintos tipos de luchadores y sus variantes.

Facade: aplicado en la gestión de combos mediante la interfaz MakeCombo.

State: usado para representar diferentes estados de los luchadores durante el combate (por ejemplo, EstadoBajo).

Cada patrón está documentado en un informe técnico complementario, que incluye diagramas de clases UML y la justificación de su implementación.

Ejecución del programa

Compilar el proyecto desde la carpeta src:

javac Combos/*.java Characters/*.java Engine/*.java PlayExtremeFighter.java


Ejecutar el programa:

java PlayExtremeFighter

Notas adicionales

El juego está diseñado para ejecutarse en consola.

El proyecto se encuentra en estado prototipo y puede ser extendido con nuevos personajes, poderes o modos de combate.

Existe un informe técnico que describe las decisiones del diseño propuesto.
