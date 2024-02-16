# TRABAJO-ENTORNOS-JAVA

* Nico 
* Daylto Bravo

## PALINDROMOS

Lo que se ha modificado del código han sido bastantes cosas

1. Quitamos el REPLACEALL que tenemos para los espacios, dado que tenemos tambien que quitar varias cosas 

2. Tenemos que limpiar la String de acentos, dieresis, etc. para eso le pasamos un metodo llamado deAccent que podemos encontrar al final del archivo GestorPalabras.java

3. Cuando ya tenemos una parte de la String limpia tenemos que quitar los signos de puntuacion, para hacerlo hemos hecho un bucle que almacena la String limpia en otra String
4. También se a puesto otra condición de que si la String cuando este completamente limpia si su longitud es menor a 2 retorne falso 

## CONTAR VOCALES

## INVERTIR LA STRING
Lo unico modificado y el unico fallo encontrado es que no pillaba el último caracter de la String dado que pone un .length -2 en vez un .length -1



	
