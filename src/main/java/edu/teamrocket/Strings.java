// los Strings en Java son un tipo de dato que se utiliza para almacenar cadenas de texto, una cadena de texto es una secuencia de caracteres, por ejemplo, "Hola Mundo" es una cadena de texto, y cada letra, espacio o símbolo que forma parte de esa cadena es un carácter, los Strings en Java se representan utilizando la clase String, y se pueden crear utilizando comillas dobles, por ejemplo se pueden guardar también en variables.


String saludo = "Hola Mundo y estoy progra,mando en Java"; // Declaramos una variable de tipo String llamada saludo y le asignamos el valor de "Hola Mundo y estoy programando en Java"

System.out.println(saludo); // Imprimimos en la consola el valor de la variable saludo

// La principal diferencia con las otras variables es la complejidad , las variables anteriormente explicadas las llamamos variables primitivas, y los Strings son variables de tipo referencia, esto significa que cuando se crea una variable de tipo String, en realidad se está creando un objeto de la clase String, y la variable lo que almacena es una referencia a ese objeto, por lo tanto, cuando se asigna un valor a una variable de tipo String, en realidad se está creando un nuevo objeto de la clase String con ese valor, y la variable lo que almacena es una referencia a ese nuevo objeto, por lo tanto, si se asigna un nuevo valor a la variable de tipo String, se está creando un nuevo objeto de la clase String con ese nuevo valor, y la variable lo que almacena es una referencia a ese nuevo objeto, por lo tanto, los Strings en Java son inmutables, esto significa que una vez creado un objeto de la clase String con un valor determinado, ese valor no puede ser cambiado, si se quiere cambiar el valor de un String, se debe crear un nuevo objeto de la clase String con el nuevo valor. 

// con  los Strings se pueden realizar muchas operaciones y metodos:

int longitud = saludo.length(); // este método devuelve la longitud de la cadena de texto, es decir, el número de caracteres que tiene la cadena, incluyendo espacios y símbolos.

// en este caso creamos una variable de tipo int llamada longitud y le asignamos el valor que devuelve el método length() de la variable saludo, este método devuelve el número de caracteres que tiene la cadena de texto almacenada en la variable saludo, incluyendo espacios y símbolos, por lo tanto, en este caso la variable longitud tendrá el valor de 44, ya que la cadena de texto "Hola Mundo y estoy programando en Java" tiene 44 caracteres.

system.out.println(saludo + longitud); // Imprimimos en la consola el valor de la variable saludo seguido del valor de la variable longitud, esto se llama concatenación, es decir, se están uniendo dos valores para formar una nueva cadena de texto, en este caso se está uniendo el valor de la variable saludo con el valor de la variable longitud, por lo tanto, el resultado será "Hola Mundo y estoy programando en Java44", ya que se está uniendo la cadena de texto almacenada en la variable saludo con el número 44 almacenado en la variable longitud.


boolean stringVacio = saludo.isEmpty(); // este método devuelve true si la cadena de texto está vacía, es decir, si no tiene ningún carácter, incluyendo espacios y símbolos, y devuelve false si la cadena de texto no está vacía, es decir, si tiene al menos un carácter, incluyendo espacios y símbolos.
