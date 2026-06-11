# Pruebas-java

Este artículo es un complemento a los cursos gratuitos de Java para Principiantes y Kotlin para Principiantes. La explicación la daré en Kotlin pero en Java aplica prácticamente lo mismo.

En Kotlin (Y la mayoría de los lenguajes de programación) podemos utilizar formatos para reemplazar variables dentro de los String, supongamos que queremos imprimir nuestro nombre, edad y peso, podríamos hacer algo así

val name: String = "Walter White"
val age: Int = 50
val weight: Double = 75.5

val description = "Me llamo " + name + ", tengo " + age + " años y peso " + weight " kg."
println(description)

// O mejor aún, en Kotlin podemos hacer esto
val description = "Me llamo $name, tengo $age años y peso $weight kg"
println(description)

// Ahora, si usamos el String format
val description = String.format("Me llamo %s, tengo %d años y peso %.2f kg", name, age, weight)
println(description)

Las 3 soluciones son correctas e imprimen lo mismo, pero la tercera es la más útil al usar Strings en Android donde tendrás que reemplazar variables porque te ayuda a tener código más limpio y soportar diferentes idiomas.

Si observas en la última opción, lo que hacemos es poner ciertos formatos dentro del String y luego al final, separados por coma, ponemos las variables que queremos que se reemplacen en el String: %s para otros strings como name, %d para enteros como age y %f para doubles y floats, en el .2 que ves en el %f el 2 es la cantidad de decimales que queremos que se impriman, así por ejemplo en este caso se imprimiría el peso como 75.50.

Aquí te dejo una tabla con los formatos más comunes, también pueden ser usados en Java:

Formato	Tipo de dato
%b	Boolean
%c	Char
%d	Integer
%e	Float en notación científica
%f	Float y Double (Agrega %.nf para forzar n decimales)
%o	Formato Octal
%s	Strings
%x	Formato Hexadecimal
Hay otros 3 o 4 formatos más pero son tan poco usuales que prefiero no abrumarte.

Si tienes dudas te invito a dejarlas en los comentarios, también te invito a suscribirte al blog, canal de Youtube, redes y todo lo que te venga en gana 🤪.