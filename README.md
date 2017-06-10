# TrabajoPractico1 
El objetivo de este primer TP es familiarizarnos con el entorno de desarrollo de Android.
 
Vamos a programar una aplicación sencilla, utilizando todo lo recientemente aprendido en los tutoriales, tanto en lo relacionado al ingreso de datos por parte de un usuario, como en las distintas modalidades para mostrar resultados.
 
También vamos desplegar nuestros vastos conocimientos traídos de C# en lo referido a manejo de strings, teniendo en cuenta que en Java es muy parecido, aunque no idéntico.  
 
Recordemos las directivas básicas de escritura de código:
Comentarios escritos antes de cada bloquecito de código
Nombres descriptivos y en castellano
Indentación
Baby Steps (escribir muy poquitas líneas de código y verificar su correcta ejecución antes de seguir codeando)
 
Por último, como siempre, nuestra herramienta mas importante, única e insustituible: el bol de gelatina.
 
La aplicación deberá permitir que el usuario ingrese distintos tipos de información, y, para cada una de ellas, presente los resultados indicados.  
 
Ustedes determinarán como organizar la aplicación, los ingresos y la muestra de resultados, ya que, a diferencia de los forms de C#, notarán rápidamente lo pequeña que resulta la pantalla en una aplicación móvil.   Es imprescindible que todo aspecto visible de nuestra aplicación sea, como mínimo, prolijo y ordenado.
 
Tal vez quieran que en la actividad principal sólo haya botones que llaman a una actividad por tarea, tal vez quieran que hayan controles ocultos que aparezcan cuando sea necesario, o tal vez se les ocurran más opciones.  Todas sirven, siempre que cumplan con lo pedido.
 
 
El usuario debe poder realizar las siguientes tareas:
 
1) Ingresar dos textos (en dos casilleros distintos).  Al presionar un botón mostrar:
 
   a) El largo (cantidad de caracteres) de cada uno de ellos
 
   b) La cantidad de caracteres excedentes del más largo sobre el más corto (si, por ejemplo, el más largo tuviera 10 caracteres y el más corto tuviera 6, entonces el más largo tendría 4 caracteres excedentes sobre el más corto)
 
   c) Los tres primeros caracteres de cada uno de los textos, concatenados entre si. Ejemplo: Si se ingresara "Aguante" y "Android", debería mostrarse "AguAnd"
 
 
2) Ingresar un texto en un casillero, junto al cuál debe haber un botón y un CheckBox.  Al presionar un botón mostrar la cantidad de letras "A" que tiene el texto ingresado.  Si el CheckBox está tildado (con "tildado" no nos referimos a esa odiosa acción que afecta algunos softwares haciéndolos entrar en coma, sino a que el checkbox esté con el tilde colocado), emitir un mensaje de advertencia en caso que el texto ingresado NO tenga más de diez caracteres.  Si no está tildado, aceptar cualquier ingreso.
 
 
3) Ingresar un texto asumiendo que tendrá más de diez caracteres.  Al presionar un botón mostrarlo en forma invertida.  Por ejemplo, si ingresara "Que copado Android!" debería mostrar "!diordnA odapoc euQ".  Si ingresara "Dabale arroz a la zorra el abad", debería mostrar…, este…, no, nada, nada.
 
 
4) Ingresar una frase de varias palabras en un solo casillero.  Al presionar un botón mostrar la última de sus palabras. Se asume que las palabras están separadas por espacios.
 
 
Opcionales:
 
A) En el punto 1) c), que no sean exactamente tres los caracteres a concatenar de cada uno de los dos textos, sino que esa cantidad sea ingresada por el usuario.  Validar la situación de que ambos textos tengan una cantidad de caracteres suficiente para el pedido.
 
B) En el punto 2), que sea el usuario el que ingrese cuál es la letra de la cuál quiere saber la cantidad de apariciones.
 
C) En el punto 3) validar que el texto ingresado tenga la cantidad mínima de caracteres indicada.  Si no lo es, mostrar un mensaje de error.
 
D) En el punto 3) informar si el texto ingresado es capicúa.
 
E) En el punto 4) validar que la frase ingresada tenga, al menos, dos palabras.
 
F) En el punto 4) que no sea necesariamente la última palabra la que se muestra, sino que sea el usuario el que elija cuál palabra quiere ver.
 
 
