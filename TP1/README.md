Trabajo Práctico N° 1 ISS 
Introducción, Soluciones Soft y Deadlock. 

Soliciones de ejercicios: 
13: Divida el cálculo de la siguiente expresión entre procesos independientes con el fin de lograr el máximo grado de paralelismo. Utilice JR.
    y=(3*a*b+4)/[(c-d)^(e-f)]

18: Productor consumidor. El problema describe dos procesos, el productor y el consumidor,
que comparten un búffer en común utilizado como una cola. El trabajo del productor
es el de generar una pieza de información, ponerla en el búffer y comenzar de nuevo.
Al mismo tiempo, el consumidor está consumiendo los datos (es decir, sacándolo de la
memoria intermedia) una pieza a la vez. El problema es asegurarse de que el productor
no va a tratar de agregar los datos en el búffer si está lleno y que el consumidor no va
a tratar de eliminar los datos de un búffer vacío.
Escriba en JR un programa concurrente con un proceso productor y otro consumidor.
El productor introducirá elementos enteros en un arreglo de dimensión x relativamente
pequeño (por ej. 20) en orden. El consumidor deberá leerlos en el orden correcto y
mostrarlos por pantalla. Corrobore mediante la ejecución repetida del código que su
solución no está libre de interferencia.
