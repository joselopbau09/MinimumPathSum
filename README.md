# José Luis López Bautista

## Num.Cuenta: 31719189-5

El lenguaje de programación: 
- Java

## Ejecución
Para ejecutar el programa se necesita:
- Java versión 8

Para su ejecución se descomprime el archivo de tipo ".zip".
1. Dirigirse en la terminal a la carpeta src: 
```
MinimumPathSum$
```
2. Ejecutar el comando 
```
javac Solution.java
```
Después se ejecuta el siguiente comando
```
java Solution
```

## Justificaión

Notemos que se tiene como precondición que las el arreglo bidimencional esta conformado por enteror no negativos, y como 
postcondición que se regrese un entero, el cual representa la suma mínima para llegar del extremo superior izquierdo al 
inferior derecho. Por lo que para resolverlo se hace uso de los suguientes casos, tenemos como caso base el verificar si la 
matriz es nula o si el número de columnas es cero, si se cumple alguno de estos regresamos O pues no hay elemento que sumar.
Por otro lado cuando no entra en ese caso se hace lo siguiente, creamos una variable `m` que almacena el número de columnas y 
una `n` para el número de renglones, mediante dos ciclos for anidados el principal recorres las columnas desde la última hasta 
la primera, el anidado hace el mismo recorrido pero con lo renglones, dentro del ciclo anidado se revisan lo siguiente, cuando 
se encuentra en el extremo inferior derecho cunado esta ahi no hace nada, porque no tiene elementos ni hacia abajo ni hacia la 
derecha, luego si esta en la última columna pero el renglon no debe de ser el último en este caso solo podemos sumar elementos 
hacia abajo, por lo que hacemos eso. Si por otro lado nos encontramos en el último renglon pero sin estar en la útima columna 
sumanos el elemento que se encuentra a la derecha.  
Por último tenemos el caso en que podemos sumar tanto elementos hacia abajo como hacia la derechas, en este caso se suma el 
menor de ellos, por útimo se regresa el valor del elemento en el extremo superior izquierdo el cual alamacena la suma 
acumulada. 